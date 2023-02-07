package sv.com.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import sv.com.clases.Cuenta;
import sv.com.clases.Ingreso;
import sv.com.exceptions.IngresoException;

@Stateless
public class IngresoDaoImpl implements IngresoDAO {

    @PersistenceContext(unitName = "ProyectoPresupuestoPU")
    EntityManager em;

    @Override
    public List<Ingreso> listarIngresos() {
        Query query = em.createQuery("SELECT i FROM Ingreso i");
        return query.getResultList();
    }

    @Override
    public void agregarIngreso(Ingreso ingreso) throws IngresoException{
        if (ingreso != null) {
            if (ingreso.getSaldoIngreso() < 9999.99) {
            em.persist(ingreso);                
            }else{
                throw new IngresoException("El ingreso excede la cantidad de dinero establecida.");
            }
        }
    }

    @Override
    public void actualizarIngreso(Ingreso ingreso) {
        if (ingreso != null) {
            em.merge(ingreso);
        }
    }

    @Override
    public void inhabilitarIngreso(Integer idIngreso) {
        if (idIngreso != 0) {
            em.createQuery("UPDATE Ingreso i SET i.estadoIngreso = 'I' WHERE i.idIngreso = :idIngreso").setParameter("idIngreso", idIngreso).executeUpdate();            
        }
    }

    @Override
    public Ingreso buscarIngresoPorId(Integer idIngreso) {
        if (idIngreso != 0) {
            Query query = em.createQuery("SELECT i FROM Ingreso i WHERE i.idIngreso = :idIngreso").setParameter("idIngreso", idIngreso);
            return (Ingreso) query.getSingleResult();
        }else{
            return null;
        }
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        if (idCuenta != 0) {
            Query query = em.createQuery("SELECT c FROM Cuenta c WHERE c.idCuenta = :idCuenta").setParameter("idCuenta", idCuenta);
            return (Cuenta) query.getSingleResult();
        }else{
            return null;
        }
    }
    
    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        if (cuenta != null) {
            em.merge(cuenta);
        }
    }

    @Override
    public List<Ingreso> listarTop10Ingresos() {
        List<Ingreso> listado = em.createQuery("SELECT i FROM Ingreso i ORDER BY i.idIngreso DESC").setMaxResults(10).getResultList();
        return listado;
    }
    
    @Override
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) {
        if (!numeroCuenta.equals("")) {
            Cuenta cuenta = (Cuenta) em.createQuery("SELECT c FROM Cuenta c WHERE c.numeroCuenta = :numeroCuenta").setParameter("numeroCuenta", numeroCuenta).getSingleResult();
            return cuenta;
        }else{
            return null;
        }
    }
}
