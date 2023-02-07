package sv.com.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.com.clases.Usuario;

@Stateless
public class UsuarioDaoImpl implements UsuarioDAO{

    @PersistenceContext(unitName = "ProyectoPresupuestoPU")
    EntityManager em;
    
    @Override
    public List<Usuario> listarUsuarios() {
        Query query = em.createQuery("SELECT u FROM Usuario u");
        return query.getResultList();
    } 
    
    @Override
    public void insertarUsuario(Usuario usuario){
        if (usuario != null) {
            em.persist(usuario);
        }
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        if (usuario != null) {
            em.merge(usuario);
        }
    }

    @Override
    public void inhabilitarUsuario(Integer idUsuario) {
        if (idUsuario != 0) {
            em.createQuery("UPDATE Usuario u SET u.estadoUsuario = 'I' WHERE u.idUsuario = :idUsuario").setParameter("idUsuario", idUsuario).executeUpdate();
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
}
