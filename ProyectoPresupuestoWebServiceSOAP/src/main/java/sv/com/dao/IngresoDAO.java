package sv.com.dao;

import java.util.List;
import sv.com.clases.Cuenta;
import sv.com.clases.Ingreso;
import sv.com.exceptions.IngresoException;

public interface IngresoDAO {
    
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
