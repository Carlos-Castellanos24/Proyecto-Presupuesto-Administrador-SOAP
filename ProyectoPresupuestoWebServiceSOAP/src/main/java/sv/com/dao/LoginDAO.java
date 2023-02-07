package sv.com.dao;

import java.util.List;
import sv.com.clases.Login;
import sv.com.clases.Usuario;

public interface LoginDAO {
    
    public List<Login> listarLogin();
    
    public void insertarLogin(Login login);
    
    public void actualizarLogin(Login login);
    
    public void inhabilitarLogin(Integer idLogin);    
    
    public Usuario buscarUsuarioPorId(Integer idUsuario);
    
    public Login buscarLoginPorId(Integer idLogin);
}
