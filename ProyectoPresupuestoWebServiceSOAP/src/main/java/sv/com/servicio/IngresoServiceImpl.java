package sv.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Ingreso;
import sv.com.dao.IngresoDAO;
import sv.com.exceptions.IngresoException;
import sv.com.web.IngresoServiceWS;

@Stateless
@WebService(endpointInterface = "sv.com.web.IngresoServiceWS")
public class IngresoServiceImpl implements IngresoService, IngresoServiceWS{

    @Inject
    private IngresoDAO ingresoDao;
    
    @Override
    public List<Ingreso> listarIngresos() {
        return ingresoDao.listarIngresos();
    }    

    @Override
    public void agregarIngreso(Ingreso ingreso) throws IngresoException{
        ingresoDao.agregarIngreso(ingreso);
    }

    @Override
    public void actualizarIngreso(Ingreso ingreso) {
        ingresoDao.actualizarIngreso(ingreso);
    }

    @Override
    public void inhabilitarIngreso(Integer idIngreso) {
        ingresoDao.inhabilitarIngreso(idIngreso);
    }

    @Override
    public Ingreso buscarIngresoPorId(Integer idIngreso) {
        return ingresoDao.buscarIngresoPorId(idIngreso);
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta) {
        return ingresoDao.buscarCuentaPorId(idCuenta);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        ingresoDao.actualizarCuenta(cuenta);
    }

    @Override
    public List<Ingreso> listarTop10Ingresos() {
        return ingresoDao.listarTop10Ingresos();
    }

    @Override
    public Cuenta buscarCuentaPorNumeroCuenta(String numeroCuenta) {
        return ingresoDao.buscarCuentaPorNumeroCuenta(numeroCuenta);
    }   
}
