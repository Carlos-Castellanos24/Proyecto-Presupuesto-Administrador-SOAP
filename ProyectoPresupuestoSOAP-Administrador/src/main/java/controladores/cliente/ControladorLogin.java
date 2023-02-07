package controladores.cliente;

import conexionesws.cliente.Conexion;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import loginws.cliente.*;
import net.bytebuddy.utility.RandomString;
import passwordencrypt.cliente.Hash;
import usuariows.cliente.UsuarioServiceImplService;
import usuariows.cliente.UsuarioServiceWS;

@WebServlet("/login")
public class ControladorLogin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listarLogin":
                    this.listarLogin(req, resp);
                    break;
                case "formularioAgregar":
                    this.formularioAgregarLogin(req, resp);
                    break;
                case "formularioEditar":
                    this.formularioEditar(req, resp);
                    break;
                case "inhabilitarLogin":
                    this.inhabilitarLogin(req, resp);
                    break;
                case "detalles":
                    this.cargarDetallesLogin(req, resp);
                    break;
                case "generarToken":
                    this.generarToken(req, resp);
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
                case "agregarLogin":
                    this.agregarLogin(req, resp);
                    break;
                case "editarLogin":
                    this.editarLogin(req, resp);
                    break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    private void listarLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<Login> login = Conexion.loginServiceConexion().listarLogin();

        Conexion.obtenerSesion(req, resp).setAttribute("login", login);
        resp.sendRedirect(req.getContextPath() + "/administracion/login/listarLogin.jsp");
    }

    private void formularioAgregarLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        List<usuariows.cliente.Usuario> usuarios = Conexion.usuarioServiceConexion().listarUsuarios();
        Conexion.obtenerSesion(req, resp).setAttribute("usuarios", usuarios);
        resp.sendRedirect(req.getContextPath() + "/administracion/login/agregarLogin.jsp");
    }

    private void agregarLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));
        String correo = req.getParameter("correo");
        String clave = req.getParameter("clave");
        String estadoLogin = req.getParameter("estadoLogin");

        if (idUsuario != 0) {
            Usuario usuarioEncontrado = Conexion.loginServiceConexion().buscarUsuarioPorId(idUsuario);
            if (usuarioEncontrado != null) {
                Login login = new Login();
                login.setUsuario(usuarioEncontrado);
                login.setCorreo(correo);
                login.setClave(Hash.hash(clave));
                login.setEstadoLogin(estadoLogin);
                Conexion.loginServiceConexion().insertarLogin(login);
            }
        }
        this.listarLogin(req, resp);
    }

    private void formularioEditar(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));

        Login login = Conexion.loginServiceConexion().buscarLoginPorId(idLogin);
        if (login != null) {
            List<usuariows.cliente.Usuario> usuarios = Conexion.usuarioServiceConexion().listarUsuarios();

            Conexion.obtenerSesion(req, resp).setAttribute("login", login);
            Conexion.obtenerSesion(req, resp).setAttribute("claveSesion", login.getClave());
            Conexion.obtenerSesion(req, resp).setAttribute("usuarios", usuarios);
        }

        resp.sendRedirect(req.getContextPath() + "/administracion/login/editarLogin.jsp");
    }

    private void editarLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));


        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));
        String correo = req.getParameter("correo");
        String clave = req.getParameter("clave");
        String estadoLogin = req.getParameter("estadoLogin");
        String claveSesion = req.getParameter("claveSesion");

        if (idLogin != 0) {
            Usuario usuario = Conexion.loginServiceConexion().buscarUsuarioPorId(idUsuario);
            if (usuario != null) {
                Login login = new Login();
                login.setIdLogin(idLogin);
                login.setUsuario(usuario);
                login.setCorreo(correo);
                login.setEstadoLogin(estadoLogin);
                if (!clave.equals(claveSesion)) {
                    login.setClave(Hash.hash(clave));
                }else{
                    login.setClave(claveSesion);
                }
                Conexion.loginServiceConexion().actualizarLogin(login);
            }
        }
        this.listarLogin(req, resp);
    }

    private void inhabilitarLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));
        if (idLogin != 0) {
            Conexion.loginServiceConexion().inhabilitarLogin(idLogin);
        }
        this.listarLogin(req, resp);
    }

    private void cargarDetallesLogin(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));
        if (idLogin != 0) {
            Login login = Conexion.loginServiceConexion().buscarLoginPorId(idLogin);
            Conexion.obtenerSesion(req, resp).setAttribute("login", login);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/login/detallesLogin.jsp");
    }

    private void generarToken(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idLogin = Integer.parseInt(req.getParameter("idLogin"));
        if (idLogin != 0) {
            Login login = Conexion.loginServiceConexion().buscarLoginPorId(idLogin);
            if (login != null && login.getPasswordToken() == null) {
                String token = RandomString.make(60);
                login.setPasswordToken(token);
                Conexion.loginServiceConexion().actualizarLogin(login);
            }
        }
        this.listarLogin(req, resp);
    }
}
