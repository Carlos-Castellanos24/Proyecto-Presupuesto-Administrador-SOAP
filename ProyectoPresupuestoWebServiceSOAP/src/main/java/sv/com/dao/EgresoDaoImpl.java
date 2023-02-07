package sv.com.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.*;
import sv.com.clases.Cuenta;
import sv.com.clases.Egreso;
import sv.com.exceptions.CuentaException;
import sv.com.exceptions.EgresoException;

@Stateless
public class EgresoDaoImpl implements EgresoDAO{

    @PersistenceContext(unitName = "ProyectoPresupuestoPU")
    EntityManager em;
    
    @Override
    public List<Egreso> listarEgresos() {
        Query query = em.createQuery("SELECT e FROM Egreso e");
        return query.getResultList();
    }   
    
    @Override
    public void agregarEgreso(Egreso egreso) throws EgresoException{
        if (egreso != null) {
            if (egreso.getSaldoEgreso() < 9999.99) {
                em.persist(egreso);
            }else{
                throw new EgresoException("El egreso excede la cantidad de dinero establecida.");
            }
        }
    }

    @Override
    public void actualizarEgreso(Egreso egreso) throws EgresoException{
        if (egreso != null) {
            em.merge(egreso);
        }else{
            throw new EgresoException("Hubo un error al actualizar el egreso.");
        }
    }

    @Override
    public void inhabilitarEgreso(Integer idEgreso) {
        if (idEgreso != 0) {
            em.createQuery("UPDATE Egreso i SET i.estadoEgreso = 'I' WHERE i.idEgreso = :idEgreso").setParameter("idEgreso", idEgreso).executeUpdate();            
        }
    }

    @Override
    public Egreso buscarEgresoPorId(Integer idEgreso){
        if (idEgreso != 0) {
            Query query = em.createQuery("SELECT e FROM Egreso e WHERE e.idEgreso = :idEgreso").setParameter("idEgreso", idEgreso);
            return (Egreso) query.getSingleResult();
        }else{
            return null;
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
}
