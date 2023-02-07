package sv.com.web;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Login;
import sv.com.exceptions.CuentaException;

@WebService
public interface CuentaServiceWS {
    
    @WebMethod
    public List<Cuenta> listarCuentas();
    
    @WebMethod
    public void agregarCuenta(Cuenta cuenta);
    
    @WebMethod
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException;  
    
    @WebMethod
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    @WebMethod
    public Login buscarLoginPorId(Integer idLogin);
    
    @WebMethod
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) throws CuentaException;
}
