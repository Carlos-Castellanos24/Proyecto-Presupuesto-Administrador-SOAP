package sv.com.servicio;

import java.util.List;
import javax.ejb.Local;
import sv.com.clases.Login;
import sv.com.clases.Usuario;

@Local
public interface LoginService {
    
    public List<Login> listarLogin();
    
    public void insertarLogin(Login login);
    
    public void actualizarLogin(Login login);
    
    public void inhabilitarLogin(Integer idLogin);
    
    public Usuario buscarUsuarioPorId(Integer idUsuario);
    
    public Login buscarLoginPorId(Integer idLogin);
}
