package controladores.cliente;

import conexionesws.cliente.Conexion;
import cuentaws.cliente.CuentaServiceImplService;
import cuentaws.cliente.CuentaServiceWS;
import datews.cliente.Fecha;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import egresows.cliente.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.*;

@WebServlet("/egreso")
public class ControladorEgreso extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listarEgresos":
                    this.listarEgresos(req, resp);
                    break;
                case "formularioAgregar":
                    this.formularioAgregar(req, resp);
                    break;
                case "formularioEditar":
                    this.formularioEditar(req, resp);
                    break;
                case "inhabilitarEgreso":
                    this.inhabilitarEgreso(req, resp);
                    break;
                case "detalles":
                    this.cargarDetallesEgreso(req, resp);
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
                case "agregarEgreso":
                    try {
                    this.agregarEgreso(req, resp);
                } catch (ParseException | EgresoException_Exception ex) {
                    req.setAttribute("errorEgreso", ex.getMessage());
                    this.formularioAgregar(req, resp);
                }
                break;

                case "editarEgreso":
                    try {
                    this.editarEgreso(req, resp);
                } catch (ParseException ex) {
                    Logger.getLogger(ControladorEgreso.class.getName()).log(Level.SEVERE, null, ex);
                } catch (CuentaException_Exception ex) {
                    Conexion.obtenerSesion(req, resp).setAttribute("cuentaException", ex.getMessage());
                    this.formularioEditar(req, resp);
                } catch (EgresoException_Exception ex) {
                    Conexion.obtenerSesion(req, resp).setAttribute("egresoException", ex.getMessage());
                    this.formularioEditar(req, resp);
                }
                break;

                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    private void listarEgresos(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();

        List<Egreso> egresos = egresoWS.listarEgresos();

        Conexion.obtenerSesion(req, resp).setAttribute("egresos", egresos);
        resp.sendRedirect(req.getContextPath() + "/administracion/egresos/listarEgresos.jsp");
    }

    private void formularioAgregar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<cuentaws.cliente.Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();
        Conexion.obtenerSesion(req, resp).setAttribute("cuentas", cuentas);
        resp.sendRedirect(req.getContextPath() + "/administracion/egresos/agregarEgreso.jsp");
    }

    private void formularioEditar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idEgreso = Integer.parseInt(req.getParameter("idEgreso"));
        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();

        Egreso egreso = egresoWS.buscarEgresoPorId(idEgreso);
        if (egreso != null) {
            List<cuentaws.cliente.Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();
            Conexion.obtenerSesion(req, resp).setAttribute("cuentas", cuentas);
            Conexion.obtenerSesion(req, resp).setAttribute("egreso", egreso);
            Conexion.obtenerSesion(req, resp).setAttribute("saldoEgreso", egreso.getSaldoEgreso());
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/egresos/editarEgreso.jsp");
    }

    private void inhabilitarEgreso(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idEgreso = Integer.parseInt(req.getParameter("idEgreso"));
        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();
        if (idEgreso != 0) {
            egresoWS.inhabilitarEgreso(idEgreso);
        }
        this.listarEgresos(req, resp);
    }

    private void agregarEgreso(HttpServletRequest req, HttpServletResponse resp) throws IOException, ParseException, EgresoException_Exception {
        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();

        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        double saldoEgreso = Double.parseDouble(req.getParameter("saldoEgreso"));
        String fechaEgresoString = req.getParameter("fechaEgreso");
        String estadoEgreso = req.getParameter("estadoEgreso");
        String descripcion = req.getParameter("descripcion");

        egresows.cliente.Cuenta cuenta = egresoWS.buscarCuentaPorId(idCuenta);
        if (cuenta != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate = sdf.parse(fechaEgresoString);

            Egreso egreso = new Egreso();
            egreso.setCuenta(cuenta);
            egreso.setSaldoEgreso(saldoEgreso);
            egreso.setDescripcion(descripcion);
            egreso.setFechaEgreso(Fecha.toXMLGregorianCalendar(fechaDate));
            egreso.setEstadoEgreso(estadoEgreso);
            egresoWS.agregarEgreso(egreso);
        }
        this.listarEgresos(req, resp);
    }

    private void editarEgreso(HttpServletRequest req, HttpServletResponse resp) throws ParseException, IOException, CuentaException_Exception, EgresoException_Exception {
        Integer idEgreso = Integer.parseInt(req.getParameter("idEgreso"));
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        double saldoEgreso = Double.parseDouble(req.getParameter("saldoEgreso"));
        String fechaEgresoString = req.getParameter("fechaEgreso");
        String estadoEgreso = req.getParameter("estadoEgreso");
        String descripcion = req.getParameter("descripcion");


        if (idCuenta != 0) {
            EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();
            Cuenta cuenta = egresoWS.buscarCuentaPorId(idCuenta);
            if (cuenta != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaDate = sdf.parse(fechaEgresoString);

                double saldoEgresoSesion = (double) Conexion.obtenerSesion(req, resp).getAttribute("saldoEgreso");
                double saldoDescontado = cuenta.getSaldoDisponible() + saldoEgresoSesion;

                if (saldoEgreso > saldoEgresoSesion) {
                    cuenta.setSaldoDisponible(saldoDescontado - saldoEgreso);
                    egresoWS.actualizarCuenta(cuenta);
                    Conexion.obtenerSesion(req, resp).removeAttribute("saldoEgreso");
                } else if (saldoEgreso < saldoEgresoSesion) {
                    cuenta.setSaldoDisponible(saldoDescontado - saldoEgreso);
                    egresoWS.actualizarCuenta(cuenta);
                    Conexion.obtenerSesion(req, resp).removeAttribute("saldoEgreso");
                }

                Egreso egreso = new Egreso();
                egreso.setIdEgreso(idEgreso);
                egreso.setCuenta(cuenta);
                egreso.setSaldoEgreso(saldoEgreso);
                egreso.setDescripcion(descripcion);
                egreso.setFechaEgreso(Fecha.toXMLGregorianCalendar(fechaDate));
                egreso.setEstadoEgreso(estadoEgreso);
                egresoWS.actualizarEgreso(egreso);
            }
        }
        this.listarEgresos(req, resp);
    }

    private void cargarDetallesEgreso(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idEgreso = Integer.parseInt(req.getParameter("idEgreso"));
        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();
        if (idEgreso != 0) {
            Egreso egreso = egresoWS.buscarEgresoPorId(idEgreso);
            Conexion.obtenerSesion(req, resp).setAttribute("egreso", egreso);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/egresos/detallesEgreso.jsp");
    }
}
