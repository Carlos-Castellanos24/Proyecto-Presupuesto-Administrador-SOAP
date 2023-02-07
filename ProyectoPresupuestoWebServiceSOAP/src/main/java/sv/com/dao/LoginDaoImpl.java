package sv.com.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.com.clases.Login;
import sv.com.clases.Usuario;

@Stateless
public class LoginDaoImpl implements LoginDAO{

    @PersistenceContext(unitName = "ProyectoPresupuestoPU")
    EntityManager em;
    
    @Override
    public List<Login> listarLogin() {
        Query query = em.createQuery("SELECT l FROM Login l");
        return query.getResultList();
    }    

    @Override
    public void insertarLogin(Login login) {
        if (login != null) {
            em.persist(login);
        }
    }

    @Override
    public void actualizarLogin(Login login) {
        if (login != null) {
            em.merge(login);
        }
    }

    @Override
    public void inhabilitarLogin(Integer idLogin) {
        if (idLogin != 0) {
            em.createQuery("UPDATE Login l SET l.estadoLogin = 'I' WHERE l.idLogin = :idLogin").setParameter("idLogin", idLogin).executeUpdate();
        }
    }

    @Override
    public Usuario buscarUsuarioPorId(Integer idUsuario) {
        if (idUsuario != 0) {
            Query query = em.createQuery("SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario").setParameter("idUsuario", idUsuario);
            return (Usuario) query.getSingleResult();
        }else{
            return null;
        }
    }

    @Override
    public Login buscarLoginPorId(Integer idLogin) {
        if (idLogin != 0) {
            Query query = em.createQuery("SELECT l FROM Login l WHERE l.idLogin = :idLogin").setParameter("idLogin", idLogin);
            return (Login) query.getSingleResult();
        }else{
            return null;
        }
    }
}
