package sv.com.web;

import java.util.List;
import javax.jws.*;
import sv.com.clases.Login;
import sv.com.clases.Usuario;

@WebService
public interface LoginServiceWS {
    
    @WebMethod
    public List<Login> listarLogin();
    
    @WebMethod
    public void insertarLogin(Login login);
    
    @WebMethod
    public void actualizarLogin(Login login);
    
    @WebMethod
    public void inhabilitarLogin(Integer idLogin);
    
    @WebMethod
    public Usuario buscarUsuarioPorId(Integer idUsuario);
    
    @WebMethod
    public Login buscarLoginPorId(Integer idLogin);
}
