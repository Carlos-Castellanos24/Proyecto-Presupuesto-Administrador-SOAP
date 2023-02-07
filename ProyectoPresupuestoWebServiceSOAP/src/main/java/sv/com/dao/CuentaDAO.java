package sv.com.dao;

import java.util.List;
import sv.com.clases.Cuenta;
import sv.com.clases.Login;
import sv.com.exceptions.CuentaException;

public interface CuentaDAO {
    
    public List<Cuenta> listarCuentas();
    
    public void agregarCuenta(Cuenta cuenta);
    
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException;
    
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    public Login buscarLoginPorId(Integer idLogin);
    
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) throws CuentaException;
}
