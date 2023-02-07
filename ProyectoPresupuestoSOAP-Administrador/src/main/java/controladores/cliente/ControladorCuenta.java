package controladores.cliente;

import conexionesws.cliente.Conexion;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import cuentaws.cliente.*;
import datews.cliente.Fecha;
import egresows.cliente.Egreso;
import egresows.cliente.EgresoException_Exception;
import ingresows.cliente.Ingreso;
import ingresows.cliente.IngresoException_Exception;
import java.util.Date;
import numerocuenta.cliente.Numero;

@WebServlet("/cuenta")
public class ControladorCuenta extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if (accion != null) {
            switch (accion) {
                case "listarCuentas":
                    this.listarCuentas(req, resp);
                    break;
                case "formularioAgregar":
                    this.formularioAgregar(req, resp);
                    break;
                case "formularioEditar":
                    this.formularioEditar(req, resp);
                    break;
                case "detalles":
                    this.cargarDetallesCuenta(req, resp);
                    break;
                case "formularioDinero":
                    this.formularioDinero(req, resp);
                    break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "agregarCuenta":
                    this.agregarCuenta(req, resp);
                    break;
                case "editarCuenta": {
                    try {
                        this.editarCuenta(req, resp);
                    } catch (CuentaException_Exception ex) {
                        Conexion.obtenerSesion(req, resp).setAttribute("errorEditarCuenta", ex.getMessage());
                        this.formularioEditar(req, resp);
                    }
                }
                break;

                case "enviarDinero": {
                    try {
                        this.enviarDinero(req, resp);
                    } catch (IngresoException_Exception ex) {
                        Conexion.obtenerSesion(req, resp).setAttribute("errorIngresoCuenta", ex.getMessage());
                        this.formularioDinero(req, resp);
                    } catch (EgresoException_Exception ex) {
                        Conexion.obtenerSesion(req, resp).setAttribute("errorEgresoCuenta", ex.getMessage());
                        this.formularioDinero(req, resp);
                    } catch (egresows.cliente.CuentaException_Exception ex) {
                        Conexion.obtenerSesion(req, resp).setAttribute("errorEgresoWS", ex.getMessage());
                        this.formularioDinero(req, resp);
                    }
                }
                break;

                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    private void listarCuentas(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();

        Conexion.obtenerSesion(req, resp).setAttribute("cuentas", cuentas);
        resp.sendRedirect(req.getContextPath() + "/administracion/cuentas/listarCuentas.jsp");
    }

    private void formularioAgregar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<loginws.cliente.Login> registros = Conexion.loginServiceConexion().listarLogin();
        Conexion.obtenerSesion(req, resp).setAttribute("registros", registros);
        resp.sendRedirect(req.getContextPath() + "/administracion/cuentas/agregarCuenta.jsp");
    }

    private void formularioEditar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));

        Cuenta cuenta = Conexion.cuentaServiceConexion().buscarCuentaPorId(idCuenta);
        if (cuenta != null) {

            List<loginws.cliente.Login> login = Conexion.loginServiceConexion().listarLogin();
            Conexion.obtenerSesion(req, resp).setAttribute("cuenta", cuenta);
            Conexion.obtenerSesion(req, resp).setAttribute("login", login);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/cuentas/editarCuenta.jsp");
    }

    private void agregarCuenta(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));
        String numeroCuenta = Numero.generarNumeroCuenta();
        double saldoDisponible = 0.0;

        if (idLogin != 0) {
            Login login = Conexion.cuentaServiceConexion().buscarLoginPorId(idLogin);
            if (login != null) {
                Cuenta cuenta = new Cuenta();
                cuenta.setLogin(login);
                cuenta.setNumeroCuenta(numeroCuenta);
                cuenta.setSaldoDisponible(saldoDisponible);
                Conexion.cuentaServiceConexion().agregarCuenta(cuenta);
            }
        }
        this.listarCuentas(req, resp);
    }

    private void editarCuenta(HttpServletRequest req, HttpServletResponse resp) throws IOException, CuentaException_Exception {
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));

        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));
        String numeroCuenta = req.getParameter("numeroCuenta");
        double saldoDisponible = Double.parseDouble(req.getParameter("saldoDisponible"));

        if (idLogin != 0) {
            Login login = Conexion.cuentaServiceConexion().buscarLoginPorId(idLogin);
            if (login != null) {
                Cuenta cuenta = new Cuenta();
                cuenta.setIdCuenta(idCuenta);
                cuenta.setLogin(login);
                cuenta.setNumeroCuenta(numeroCuenta);
                cuenta.setSaldoDisponible(saldoDisponible);
                Conexion.cuentaServiceConexion().actualizarCuenta(cuenta);
            }
        }
        this.listarCuentas(req, resp);
    }

    private void cargarDetallesCuenta(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));

        if (idCuenta != 0) {
            Cuenta cuenta = Conexion.cuentaServiceConexion().buscarCuentaPorId(idCuenta);
            Conexion.obtenerSesion(req, resp).setAttribute("cuenta", cuenta);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/cuentas/detallesCuenta.jsp");
    }

    private void formularioDinero(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        if (idCuenta != 0) {
            Cuenta cuentaEmisora = Conexion.cuentaServiceConexion().buscarCuentaPorId(idCuenta);
            Conexion.obtenerSesion(req, resp).setAttribute("cuenta", cuentaEmisora);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/cuentas/enviarDinero.jsp");
    }

    private void enviarDinero(HttpServletRequest req, HttpServletResponse resp) throws IOException, IngresoException_Exception, EgresoException_Exception, egresows.cliente.CuentaException_Exception {
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        String numeroCuenta = req.getParameter("numeroCuenta");
        double saldoEnviar = Double.parseDouble(req.getParameter("saldoEnviar"));
        String estado = req.getParameter("estado");
        String nombrePersona = req.getParameter("nombrePersona");

        ingresows.cliente.Cuenta cuentaReceptora = Conexion.ingresoServiceConexion().buscarCuentaPorNumeroCuenta(numeroCuenta);

        egresows.cliente.Cuenta cuentaEmisora = Conexion.egresoServiceConexion().buscarCuentaPorId(idCuenta);

        if (idCuenta != 0 && !numeroCuenta.equals("")) {

            if (numeroCuenta.equals(cuentaEmisora.getNumeroCuenta())) {
                Conexion.obtenerSesion(req, resp).setAttribute("numeroCuentaIgual", "No se puede enviar dinero a su propia cuenta");
                this.formularioDinero(req, resp);
                return;
            } else {

                if (cuentaReceptora != null) {
                    Date date = new Date();
                    Ingreso ingreso = new Ingreso();
                    ingreso.setCuenta(cuentaReceptora);
                    ingreso.setSaldoIngreso(saldoEnviar);
                    ingreso.setDescripcion("Usted ha recibido dinero de " + nombrePersona);
                    ingreso.setFechaIngreso(Fecha.toXMLGregorianCalendar(date));
                    ingreso.setEstadoIngreso(estado);
                    Conexion.ingresoServiceConexion().agregarIngreso(ingreso);
                    if (ingreso != null) {
                        cuentaReceptora.setSaldoDisponible(cuentaReceptora.getSaldoDisponible() + saldoEnviar);
                        if (cuentaReceptora.getSaldoDisponible() >= 999999.9999) {
                            Conexion.obtenerSesion(req, resp).setAttribute("valorRango", "El valor esta fuera del rango establecido");
                            this.formularioDinero(req, resp);
                            return;
                        } else {
                            Conexion.ingresoServiceConexion().actualizarCuenta(cuentaReceptora);
                        }
                    }
                    if (cuentaEmisora != null) {
                        Egreso egreso = new Egreso();
                        egreso.setCuenta(cuentaEmisora);
                        egreso.setSaldoEgreso(saldoEnviar);
                        egreso.setDescripcion("Usted ha envido dinero a "
                                + cuentaReceptora.getLogin().getUsuario().getNombre()
                                + cuentaReceptora.getLogin().getUsuario().getApellido());
                        egreso.setFechaEgreso(Fecha.toXMLGregorianCalendar(date));
                        egreso.setEstadoEgreso(estado);
                        Conexion.egresoServiceConexion().agregarEgreso(egreso);
                        if (egreso != null) {
                            cuentaEmisora.setSaldoDisponible(cuentaEmisora.getSaldoDisponible() - saldoEnviar);
                            Conexion.egresoServiceConexion().actualizarCuenta(cuentaEmisora);
                        }
                    }
                }
            }
            this.listarCuentas(req, resp);
        }
    }
}
