
package usuariows.cliente;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "UsuarioServiceImplService", targetNamespace = "http://servicio.com.sv/", wsdlLocation = "http://localhost:9090/UsuarioServiceImplService/UsuarioServiceImpl?wsdl")
public class UsuarioServiceImplService
    extends Service
{

    private final static URL USUARIOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException USUARIOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName USUARIOSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.com.sv/", "UsuarioServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/UsuarioServiceImplService/UsuarioServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USUARIOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        USUARIOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public UsuarioServiceImplService() {
        super(__getWsdlLocation(), USUARIOSERVICEIMPLSERVICE_QNAME);
    }

    public UsuarioServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), USUARIOSERVICEIMPLSERVICE_QNAME, features);
    }

    public UsuarioServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, USUARIOSERVICEIMPLSERVICE_QNAME);
    }

    public UsuarioServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USUARIOSERVICEIMPLSERVICE_QNAME, features);
    }

    public UsuarioServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UsuarioServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UsuarioServiceWS
     */
    @WebEndpoint(name = "UsuarioServiceImplPort")
    public UsuarioServiceWS getUsuarioServiceImplPort() {
        return super.getPort(new QName("http://servicio.com.sv/", "UsuarioServiceImplPort"), UsuarioServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UsuarioServiceWS
     */
    @WebEndpoint(name = "UsuarioServiceImplPort")
    public UsuarioServiceWS getUsuarioServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.com.sv/", "UsuarioServiceImplPort"), UsuarioServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USUARIOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw USUARIOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return USUARIOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
