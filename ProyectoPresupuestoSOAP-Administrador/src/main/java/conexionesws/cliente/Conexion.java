package conexionesws.cliente;

import cuentaws.cliente.CuentaServiceImplService;
import cuentaws.cliente.CuentaServiceWS;
import egresows.cliente.EgresoServiceImplService;
import egresows.cliente.EgresoServiceWS;
import ingresows.cliente.IngresoServiceImplService;
import ingresows.cliente.IngresoServiceWS;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import loginws.cliente.LoginServiceImplService;
import loginws.cliente.LoginServiceWS;
import usuariows.cliente.UsuarioServiceImplService;
import usuariows.cliente.UsuarioServiceWS;

public class Conexion {
    
    public static CuentaServiceWS cuentaServiceConexion(){
        CuentaServiceWS cuentaWS = new CuentaServiceImplService().getCuentaServiceImplPort();
        return cuentaWS;
    }
    
    public static EgresoServiceWS egresoServiceConexion(){
        EgresoServiceWS egresoWS = new EgresoServiceImplService().getEgresoServiceImplPort();
        return egresoWS;
    }
    
    public static IngresoServiceWS ingresoServiceConexion(){
        IngresoServiceWS ingresoWS = new IngresoServiceImplService().getIngresoServiceImplPort();
        return ingresoWS;
    }
    
    public static UsuarioServiceWS usuarioServiceConexion(){
        UsuarioServiceWS usuarioWS = new UsuarioServiceImplService().getUsuarioServiceImplPort();
        return usuarioWS;
    }
    
    public static LoginServiceWS loginServiceConexion(){
        LoginServiceWS loginWS = new LoginServiceImplService().getLoginServiceImplPort();
        return loginWS;
    }
    
    /*PARA LA SESION*/
    public static HttpSession obtenerSesion(HttpServletRequest req, HttpServletResponse resp){
        HttpSession sesion = req.getSession();
        return sesion;
    }
}
