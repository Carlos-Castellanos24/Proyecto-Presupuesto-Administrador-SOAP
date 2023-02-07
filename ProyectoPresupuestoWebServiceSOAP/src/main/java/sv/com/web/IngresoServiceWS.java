package sv.com.web;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Ingreso;
import sv.com.exceptions.IngresoException;

@WebService
public interface IngresoServiceWS {
    
    @WebMethod
    public List<Ingreso> listarIngresos();
    
    @WebMethod
    public void agregarIngreso(Ingreso ingreso) throws IngresoException;
    
    @WebMethod
    public void actualizarIngreso(Ingreso ingreso);
    
    @WebMethod
    public void inhabilitarIngreso(Integer idIngreso);
    
    @WebMethod
    public Ingreso buscarIngresoPorId(Integer idIngreso);
    
    @WebMethod
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    @WebMethod
    public void actualizarCuenta(Cuenta cuenta);
    
    @WebMethod
    public List<Ingreso> listarTop10Ingresos();
    
    @WebMethod
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta);
}
