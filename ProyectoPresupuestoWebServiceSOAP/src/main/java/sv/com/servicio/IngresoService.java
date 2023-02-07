package sv.com.servicio;

import java.util.List;
import javax.ejb.Local;
import sv.com.clases.*;
import sv.com.exceptions.IngresoException;

@Local
public interface IngresoService {
    
    public List<Ingreso> listarIngresos();
        
    public void agregarIngreso(Ingreso ingreso) throws IngresoException;
    
    public void actualizarIngreso(Ingreso ingreso);
    
    public void inhabilitarIngreso(Integer idIngreso);
    
    public Ingreso buscarIngresoPorId(Integer idIngreso);
    
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    public void actualizarCuenta(Cuenta cuenta);
    
    public List<Ingreso> listarTop10Ingresos();
    
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta);
}
