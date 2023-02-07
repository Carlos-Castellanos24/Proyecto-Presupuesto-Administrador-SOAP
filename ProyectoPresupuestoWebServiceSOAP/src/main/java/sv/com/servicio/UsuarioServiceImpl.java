package sv.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import sv.com.clases.Usuario;
import sv.com.dao.UsuarioDAO;
import sv.com.web.UsuarioServiceWS;

@Stateless
@WebService(endpointInterface = "sv.com.web.UsuarioServiceWS")
public class UsuarioServiceImpl implements UsuarioService, UsuarioServiceWS{

    @Inject
    private UsuarioDAO usuarioDao;
    
    @Override
    public List<Usuario> listarUsuarios() {
        return usuarioDao.listarUsuarios();
    }   

    @Override
    public void insertarUsuario(Usuario usuario) {
        usuarioDao.insertarUsuario(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        usuarioDao.actualizarUsuario(usuario);
    }

    @Override
    public void inhabilitarUsuario(Integer idUsuario) {
        usuarioDao.inhabilitarUsuario(idUsuario);
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        return usuarioDao.buscarUsuarioPorId(idUsuario);
    }
}
