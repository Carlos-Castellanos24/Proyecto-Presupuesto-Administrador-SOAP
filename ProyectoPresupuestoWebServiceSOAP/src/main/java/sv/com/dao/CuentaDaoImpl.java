package sv.com.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sv.com.clases.Cuenta;
import sv.com.clases.Login;
import sv.com.exceptions.CuentaException;

@Stateless
public class CuentaDaoImpl implements CuentaDAO {

    @PersistenceContext(unitName = "ProyectoPresupuestoPU")
    EntityManager em;

    @Override
    public List<Cuenta> listarCuentas() {
        Query query = em.createQuery("SELECT c FROM Cuenta c");
        return query.getResultList();
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        if (cuenta != null) {
            em.persist(cuenta);
        }
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException{
        if (cuenta != null) {
            if (cuenta.getSaldoDisponible() < 999999.9999) {
                em.merge(cuenta);
            }else{
                throw new CuentaException("Ha excedido la cantidad de dinero establecido en su cuenta.");
            }
        }
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta){
        if (idCuenta != 0) {
            Query query = em.createQuery("SELECT c FROM Cuenta c WHERE c.idCuenta = :idCuenta").setParameter("idCuenta", idCuenta);
            return (Cuenta) query.getSingleResult();
        } else {
            return null;
        }
    }

    @Override
    public Login buscarLoginPorId(Integer idLogin){
        if (idLogin != 0) {
            Query query = em.createQuery("SELECT l FROM Login l WHERE l.idLogin = :idLogin").setParameter("idLogin", idLogin);
            return (Login) query.getSingleResult();
        } else {
            return null;
        }
    }

    @Override
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) throws CuentaException {
        Cuenta cuenta = (Cuenta) em.createQuery("SELECT c FROM Cuenta c WHERE c.numeroCuenta = :numeroCuenta").setParameter("numeroCuenta", numeroCuenta).getSingleResult();
        if (cuenta != null) {
            return cuenta;
        }else{
            throw new CuentaException("No se encontro el numero de cuenta: " + numeroCuenta);
        }
    }
}
