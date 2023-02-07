package controladores.cliente;

import conexionesws.cliente.Conexion;
import cuentaws.cliente.*;
import egresows.cliente.Egreso;
import ingresows.cliente.Ingreso;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import loginws.cliente.Login;
import usuariows.cliente.Usuario;

@WebServlet("")
public class ControladorInicio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.cargarIndex(req, resp);
    }

    private int obtenerListadoUsuarios() {
        List<Usuario> usuarios = Conexion.usuarioServiceConexion().listarUsuarios();
        return usuarios.size();
    }

    private int obtenerListadoLogin() {
        List<Login> login = Conexion.loginServiceConexion().listarLogin();
        return login.size();
    }

    private int obtenerListadoCuentas() {
        List<Cuenta> cuentas = Conexion.cuentaServiceConexion().listarCuentas();
        return cuentas.size();
    }

    private int obtenerListadoIngresos() {
        List<Ingreso> ingresos = Conexion.ingresoServiceConexion().listarIngresos();
        return ingresos.size();
    }

    private int obtenerListadoEgresos() {
        List<Egreso> egresos = Conexion.egresoServiceConexion().listarEgresos();
        return egresos.size();
    }

    private List<Ingreso> listarIngresos() {
        List<Ingreso> listadoIngresos = Conexion.ingresoServiceConexion().listarTop10Ingresos();
        return listadoIngresos;
    }

    private void cargarIndex(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        Conexion.obtenerSesion(req, resp).setAttribute("usuariosIndex", this.obtenerListadoUsuarios());
        Conexion.obtenerSesion(req, resp).setAttribute("loginIndex", this.obtenerListadoLogin());
        Conexion.obtenerSesion(req, resp).setAttribute("cuentasIndex", this.obtenerListadoCuentas());
        Conexion.obtenerSesion(req, resp).setAttribute("ingresosIndex", this.obtenerListadoIngresos());
        Conexion.obtenerSesion(req, resp).setAttribute("egresosIndex", this.obtenerListadoEgresos());
        Conexion.obtenerSesion(req, resp).setAttribute("listaIngresosIndex", this.listarIngresos());
        resp.sendRedirect("index.jsp");
    }

    public static void eliminarSesiones(HttpServletRequest req, HttpServletResponse resp) {
        Conexion.obtenerSesion(req, resp).removeAttribute("usuariosIndex");
        Conexion.obtenerSesion(req, resp).removeAttribute("loginIndex");
        Conexion.obtenerSesion(req, resp).removeAttribute("cuentasIndex");
        Conexion.obtenerSesion(req, resp).removeAttribute("ingresosIndex");
        Conexion.obtenerSesion(req, resp).removeAttribute("egresosIndex");
        Conexion.obtenerSesion(req, resp).removeAttribute("listaIngresosIndex");
    }
}
