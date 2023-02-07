package sv.com.web;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import sv.com.clases.Usuario;

@WebService
public interface UsuarioServiceWS {
    
    @WebMethod
    public List<Usuario> listarUsuarios();
    
    @WebMethod
    public void insertarUsuario(Usuario usuario);
    
    @WebMethod
    public void actualizarUsuario(Usuario usuario);
    
    @WebMethod
    public void inhabilitarUsuario(Integer idUsuario);
    
    @WebMethod
    public Usuario buscarUsuarioPorId(Integer idUsuario);
}
