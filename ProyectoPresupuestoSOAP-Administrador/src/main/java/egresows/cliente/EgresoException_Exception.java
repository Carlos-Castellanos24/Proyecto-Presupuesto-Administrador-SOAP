
package egresows.cliente;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "EgresoException", targetNamespace = "http://web.com.sv/")
public class EgresoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private EgresoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public EgresoException_Exception(String message, EgresoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public EgresoException_Exception(String message, EgresoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: egresows.cliente.EgresoException
     */
    public EgresoException getFaultInfo() {
        return faultInfo;
    }

}
