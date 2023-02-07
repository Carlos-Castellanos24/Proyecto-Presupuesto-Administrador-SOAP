package sv.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import sv.com.clases.Login;
import sv.com.clases.Usuario;
import sv.com.dao.LoginDAO;
import sv.com.web.LoginServiceWS;

@Stateless
@WebService(endpointInterface = "sv.com.web.LoginServiceWS")
public class LoginServiceImpl implements LoginService, LoginServiceWS{

    @Inject
    private LoginDAO loginDao;
    
    @Override
    public List<Login> listarLogin() {
        return loginDao.listarLogin();
    }    

    @Override
    public void insertarLogin(Login login) {
        loginDao.insertarLogin(login);
    }

    @Override
    public void actualizarLogin(Login login) {
        loginDao.actualizarLogin(login);
    }

    @Override
    public void inhabilitarLogin(Integer idLogin) {
        loginDao.inhabilitarLogin(idLogin);
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return loginDao.buscarUsuarioPorId(idUsuario);
    }

    @Override
    public Login buscarLoginPorId(Integer idLogin) {
        return loginDao.buscarLoginPorId(idLogin);
    }
}
