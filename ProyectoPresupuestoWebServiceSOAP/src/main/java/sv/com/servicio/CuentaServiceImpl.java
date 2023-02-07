package sv.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Login;
import sv.com.dao.CuentaDAO;
import sv.com.exceptions.CuentaException;
import sv.com.web.CuentaServiceWS;

@Stateless
@WebService(endpointInterface = "sv.com.web.CuentaServiceWS")
public class CuentaServiceImpl implements CuentaService, CuentaServiceWS{
    
    @Inject
    private CuentaDAO cuentaDao;

    @Override
    public List<Cuenta> listarCuentas() {
        return cuentaDao.listarCuentas();
    }

    @Override
    public void agregarCuenta(Cuenta cuenta) {
        cuentaDao.agregarCuenta(cuenta);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException{
        cuentaDao.actualizarCuenta(cuenta);
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta){
        return cuentaDao.buscarCuentaPorId(idCuenta);
    }

    @Override
    public Login buscarLoginPorId(Integer idLogin){
        return cuentaDao.buscarLoginPorId(idLogin);
    }
  
    @Override
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) throws CuentaException{
        return cuentaDao.buscarCuentaPorNumeroCuenta(numeroCuenta);       
    }
}
