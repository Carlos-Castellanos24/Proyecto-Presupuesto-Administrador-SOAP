package sv.com.servicio;

import java.util.List;
import javax.ejb.Local;
import sv.com.clases.*;
import sv.com.exceptions.CuentaException;
import sv.com.exceptions.EgresoException;

@Local
public interface EgresoService {
    
    public List<Egreso> listarEgresos();
    
    public void agregarEgreso(Egreso egreso) throws EgresoException;
    
    public void actualizarEgreso(Egreso egreso) throws EgresoException;
    
    public void inhabilitarEgreso(Integer idEgreso);
    
    public Egreso buscarEgresoPorId(Integer idEgreso);
    
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException;
}
