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
import ingresows.cliente.*;
import java.text.*;
import java.util.logging.*;

@WebServlet("/ingreso")
public class ControladorIngreso extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listarIngresos":
                    this.listarIngresos(req, resp);
                    break;
                case "formularioAgregar":
                    this.formularioAgregar(req, resp);
                    break;
                case "formularioEditar":
                    this.formularioEditar(req, resp);
                    break;
                case "inhabilitarIngreso":
                    this.inhabilitarIngreso(req, resp);
                    break;
                case "detalles":
                    this.cargarDetallesIngreso(req, resp);
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
                case "agregarIngreso":
                    try {
                    this.agregarIngreso(req, resp);
                } catch (ParseException | IngresoException_Exception ex) {
                    Conexion.obtenerSesion(req, resp).setAttribute("errorIngreso", ex.getMessage());
                    this.formularioAgregar(req, resp);
                }
                break;
                case "editarIngreso":
                    try {
                    this.editarIngreso(req, resp);
                } catch (ParseException ex) {
                    Conexion.obtenerSesion(req, resp).setAttribute("errorFecha", "Error al convertir la fecha");
                    this.formularioEditar(req, resp);
                }
                break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    private void listarIngresos(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Ingreso> ingresos = Conexion.ingresoServiceConexion().listarIngresos();
        Conexion.obtenerSesion(req, resp).setAttribute("ingresos", ingresos);
        resp.sendRedirect(req.getContextPath() + "/administracion/ingresos/listarIngresos.jsp");
    }

    private void formularioAgregar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<cuentaws.cliente.Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();
        Conexion.obtenerSesion(req, resp).setAttribute("cuentas", cuentas);
        resp.sendRedirect(req.getContextPath() + "/administracion/ingresos/agregarIngreso.jsp");
    }

    private void formularioEditar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idIngreso = Integer.parseInt(req.getParameter("idIngreso"));

        Ingreso ingreso = Conexion.ingresoServiceConexion().buscarIngresoPorId(idIngreso);
        if (ingreso != null) {
            List<cuentaws.cliente.Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();
            Conexion.obtenerSesion(req, resp).setAttribute("cuentas", cuentas);
            Conexion.obtenerSesion(req, resp).setAttribute("ingreso", ingreso);
            Conexion.obtenerSesion(req, resp).setAttribute("saldoIngreso", ingreso.getSaldoIngreso());
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/ingresos/editarIngreso.jsp");
    }

    private void inhabilitarIngreso(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idIngreso = Integer.parseInt(req.getParameter("idIngreso"));
        if (idIngreso != 0) {
            Conexion.ingresoServiceConexion().inhabilitarIngreso(idIngreso);
        }
        this.listarIngresos(req, resp);
    }

    private void agregarIngreso(HttpServletRequest req, HttpServletResponse resp) throws IOException, ParseException, IngresoException_Exception {

        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        double saldoIngreso = Double.parseDouble(req.getParameter("saldoIngreso"));
        String fechaIngresoString = req.getParameter("fechaIngreso");
        String estadoIngreso = req.getParameter("estadoIngreso");
        String descripcion = req.getParameter("descripcion");

        Cuenta cuenta = Conexion.ingresoServiceConexion().buscarCuentaPorId(idCuenta);
        if (cuenta != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate = sdf.parse(fechaIngresoString);

            cuenta.setSaldoDisponible(cuenta.getSaldoDisponible() + saldoIngreso);

            if (cuenta.getSaldoDisponible() >= 999999.9999) {
                Conexion.obtenerSesion(req, resp).setAttribute("valorRango", "El valor esta fuera del rango establecido");
                this.formularioAgregar(req, resp);
                return;
            } else {
                Conexion.ingresoServiceConexion().actualizarCuenta(cuenta);
            }

            Ingreso ingreso = new Ingreso();
            ingreso.setCuenta(cuenta);
            ingreso.setSaldoIngreso(saldoIngreso);
            ingreso.setDescripcion(descripcion);
            ingreso.setFechaIngreso(Fecha.toXMLGregorianCalendar(fechaDate));
            ingreso.setEstadoIngreso(estadoIngreso);
            Conexion.ingresoServiceConexion().agregarIngreso(ingreso);
        }
        this.listarIngresos(req, resp);
    }

    private void editarIngreso(HttpServletRequest req, HttpServletResponse resp) throws ParseException, IOException {
        Integer idIngreso = Integer.parseInt(req.getParameter("idIngreso"));
        Integer idCuenta = Integer.parseInt(req.getParameter("idCuenta"));
        double saldoIngreso = Double.parseDouble(req.getParameter("saldoIngreso"));
        String fechaIngresoString = req.getParameter("fechaIngreso");
        String estadoIngreso = req.getParameter("estadoIngreso");
        String descripcion = req.getParameter("descripcion");

        if (idCuenta != 0) {
            Cuenta cuenta = Conexion.ingresoServiceConexion().buscarCuentaPorId(idCuenta);
            if (cuenta != null) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date fechaDate = sdf.parse(fechaIngresoString);

                double saldoIngresoSesion = (double) Conexion.obtenerSesion(req, resp).getAttribute("saldoIngreso");
                double saldoDescontado = cuenta.getSaldoDisponible() - saldoIngresoSesion;

                if (saldoIngreso > saldoIngresoSesion) {
                    cuenta.setSaldoDisponible(saldoIngreso + saldoDescontado);
                    Conexion.ingresoServiceConexion().actualizarCuenta(cuenta);
                    Conexion.obtenerSesion(req, resp).removeAttribute("saldoIngreso");
                } else if (saldoIngreso < saldoIngresoSesion) {
                    cuenta.setSaldoDisponible(saldoIngreso + saldoDescontado);
                    Conexion.ingresoServiceConexion().actualizarCuenta(cuenta);
                    Conexion.obtenerSesion(req, resp).removeAttribute("saldoIngreso");
                }

                Ingreso ingreso = new Ingreso();
                ingreso.setIdIngreso(idIngreso);
                ingreso.setCuenta(cuenta);
                ingreso.setSaldoIngreso(saldoIngreso);
                ingreso.setDescripcion(descripcion);
                ingreso.setFechaIngreso(Fecha.toXMLGregorianCalendar(fechaDate));
                ingreso.setEstadoIngreso(estadoIngreso);
                Conexion.ingresoServiceConexion().actualizarIngreso(ingreso);
            }
        }
        this.listarIngresos(req, resp);
    }

    private void cargarDetallesIngreso(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idIngreso = Integer.parseInt(req.getParameter("idIngreso"));
        if (idIngreso != 0) {
            Ingreso ingreso = Conexion.ingresoServiceConexion().buscarIngresoPorId(idIngreso);
            Conexion.obtenerSesion(req, resp).setAttribute("ingreso", ingreso);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/ingresos/detallesIngreso.jsp");
    }
}
