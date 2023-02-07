package sv.com.dao;

import java.util.List;
import sv.com.clases.Cuenta;
import sv.com.clases.Egreso;
import sv.com.exceptions.CuentaException;
import sv.com.exceptions.EgresoException;

public interface EgresoDAO {
    
    public List<Egreso> listarEgresos();
        
    public void agregarEgreso(Egreso egreso) throws EgresoException;
    
    public void actualizarEgreso(Egreso egreso) throws EgresoException;
    
    public void inhabilitarEgreso(Integer idEgreso);
    
    public Egreso buscarEgresoPorId(Integer idEgreso);
    
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException;
}
