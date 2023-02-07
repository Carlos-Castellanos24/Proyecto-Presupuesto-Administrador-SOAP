package sv.com.dao;

import java.util.List;
import sv.com.clases.Usuario;

public interface UsuarioDAO {
    
    public List<Usuario> listarUsuarios();
    
    public void insertarUsuario(Usuario usuario);
    
    public void actualizarUsuario(Usuario usuario);
    
    public void inhabilitarUsuario(Integer idUsuario);
    
    public Usuario buscarUsuarioPorId(Integer idUsuario);
}
