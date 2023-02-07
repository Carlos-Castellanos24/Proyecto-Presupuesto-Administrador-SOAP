package controladores.cliente;

import conexionesws.cliente.Conexion;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import usuariows.cliente.*;

@WebServlet("/usuario")
public class ControladorUsuario extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "listarUsuarios":
                    this.listarUsuarios(req, resp);
                    break;
                case "formularioAgregar":
                    resp.sendRedirect(req.getContextPath() + "/administracion/usuarios/agregarUsuario.jsp");
                    break;
                case "formularioEditar":
                    this.formularioEditar(req, resp);
                    break;
                case "inhabilitarUsuario":
                    this.inhabilitarUsuario(req, resp);
                    break;
                case "detalles":
                    this.cargarDetallesUsuario(req, resp);
                    break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        String accion = req.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "agregarUsuario":
                    this.agregarUsuario(req, resp);
                    break;
                case "editarUsuario":
                    this.editarUsuario(req, resp);
                    break;
                default:
                    resp.sendRedirect(req.getContextPath() + "/");
            }
        }
    }

    private void listarUsuarios(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
               
        List<Usuario> usuarios = Conexion.usuarioServiceConexion().listarUsuarios();

        Conexion.obtenerSesion(req, resp).setAttribute("usuarios", usuarios);
        resp.sendRedirect(req.getContextPath() + "/administracion/usuarios/listarUsuarios.jsp");
    }

    private void agregarUsuario(HttpServletRequest req, HttpServletResponse resp) 
            throws IOException {

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String dui = req.getParameter("dui");
        String telefono = req.getParameter("telefono");
        String estadoUsuario = req.getParameter("estadoUsuario");

        Usuario usuario = new Usuario();
        usuario.setNombre(nombre);
        usuario.setApellido(apellido);
        usuario.setDui(dui);
        usuario.setTelefono(telefono);
        usuario.setEstadoUsuario(estadoUsuario);

        Conexion.usuarioServiceConexion().insertarUsuario(usuario);

        this.listarUsuarios(req, resp);
    }

    private void formularioEditar(HttpServletRequest req, HttpServletResponse resp) 
            throws IOException {
        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));

        Usuario usuarioEncontrado = Conexion.usuarioServiceConexion().buscarUsuarioPorId(idUsuario);
        Conexion.obtenerSesion(req, resp).setAttribute("usuarioEncontrado", usuarioEncontrado);
        resp.sendRedirect(req.getContextPath() + "/administracion/usuarios/editarUsuario.jsp");
    }

    private void editarUsuario(HttpServletRequest req, HttpServletResponse resp) 
            throws IOException {
        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));

        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String dui = req.getParameter("dui");
        String telefono = req.getParameter("telefono");
        String estadoUsuario = req.getParameter("estadoUsuario");

        Usuario usuarioEditar = new Usuario();
        usuarioEditar.setIdUsuario(idUsuario);
        usuarioEditar.setNombre(nombre);
        usuarioEditar.setApellido(apellido);
        usuarioEditar.setDui(dui);
        usuarioEditar.setTelefono(telefono);
        usuarioEditar.setEstadoUsuario(estadoUsuario);

        Conexion.usuarioServiceConexion().actualizarUsuario(usuarioEditar);

        this.listarUsuarios(req, resp);
    }

    private void inhabilitarUsuario(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));
        if (idUsuario != 0) {           
          Conexion.usuarioServiceConexion().inhabilitarUsuario(idUsuario);
        }
        this.listarUsuarios(req, resp);
    }

    private void cargarDetallesUsuario(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Integer idUsuario = Integer.parseInt(req.getParameter("idUsuario"));
        if (idUsuario != 0) {
           Usuario usuario = Conexion.usuarioServiceConexion().buscarUsuarioPorId(idUsuario);
           Conexion.obtenerSesion(req, resp).setAttribute("usuario", usuario);
        }
        resp.sendRedirect(req.getContextPath() + "/administracion/usuarios/detallesUsuario.jsp");
    }
}
