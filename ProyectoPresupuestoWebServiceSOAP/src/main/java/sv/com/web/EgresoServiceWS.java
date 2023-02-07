package sv.com.web;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Egreso;
import sv.com.exceptions.CuentaException;
import sv.com.exceptions.EgresoException;

@WebService
public interface EgresoServiceWS {
    
    @WebMethod
    public List<Egreso> listarEgresos();
    
    @WebMethod
    public void agregarEgreso(Egreso egreso) throws EgresoException;
    
    @WebMethod
    public void actualizarEgreso(Egreso egreso)throws EgresoException;
    
    @WebMethod
    public void inhabilitarEgreso(Integer idEgreso);
    
    @WebMethod
    public Egreso buscarEgresoPorId(Integer idEgreso);
    
    @WebMethod
    public Cuenta buscarCuentaPorId(Integer idCuenta);
    
    @WebMethod
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException;
}
