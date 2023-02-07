package sv.com.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import sv.com.clases.Cuenta;
import sv.com.clases.Egreso;
import sv.com.dao.EgresoDAO;
import sv.com.exceptions.CuentaException;
import sv.com.exceptions.EgresoException;
import sv.com.web.EgresoServiceWS;

@Stateless
@WebService(endpointInterface = "sv.com.web.EgresoServiceWS")
public class EgresoServiceImpl implements EgresoService, EgresoServiceWS{

    @Inject
    private EgresoDAO egresoDao;
    
    @Override
    public List<Egreso> listarEgresos() {
        return egresoDao.listarEgresos();
    }    

    @Override
    public void agregarEgreso(Egreso egreso) throws EgresoException{
        egresoDao.agregarEgreso(egreso);
    }

    @Override
    public void actualizarEgreso(Egreso egreso) throws EgresoException{
        egresoDao.actualizarEgreso(egreso);
    }

    @Override
    public void inhabilitarEgreso(Integer idEgreso) {
        egresoDao.inhabilitarEgreso(idEgreso);
    }

    @Override
    public Egreso buscarEgresoPorId(Integer idEgreso){
        return egresoDao.buscarEgresoPorId(idEgreso);
    }

    @Override
    public Cuenta buscarCuentaPorId(Integer idCuenta){
        return egresoDao.buscarCuentaPorId(idCuenta);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) throws CuentaException{
        egresoDao.actualizarCuenta(cuenta);
    }
}
