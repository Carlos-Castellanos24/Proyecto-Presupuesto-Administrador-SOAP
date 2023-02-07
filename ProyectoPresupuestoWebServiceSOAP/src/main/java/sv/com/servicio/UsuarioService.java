package sv.com.servicio;

import java.util.List;
import javax.ejb.Local;
import sv.com.clases.Usuario;

@Local
public interface UsuarioService {
    
    public List<Usuario> listarUsuarios();
        
    public void insertarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void inhabilitarUsuario(Integer idUsuario);
    
    public Usuario buscarUsuarioPorId(Integer idUsuario);
}
