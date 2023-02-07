
package egresows.cliente;

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
@WebServiceClient(name = "EgresoServiceImplService", targetNamespace = "http://servicio.com.sv/", wsdlLocation = "http://localhost:9090/EgresoServiceImplService/EgresoServiceImpl?wsdl")
public class EgresoServiceImplService
    extends Service
{

    private final static URL EGRESOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EGRESOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName EGRESOSERVICEIMPLSERVICE_QNAME = new QName("http://servicio.com.sv/", "EgresoServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/EgresoServiceImplService/EgresoServiceImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EGRESOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        EGRESOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public EgresoServiceImplService() {
        super(__getWsdlLocation(), EGRESOSERVICEIMPLSERVICE_QNAME);
    }

    public EgresoServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EGRESOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EgresoServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, EGRESOSERVICEIMPLSERVICE_QNAME);
    }

    public EgresoServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EGRESOSERVICEIMPLSERVICE_QNAME, features);
    }

    public EgresoServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EgresoServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EgresoServiceWS
     */
    @WebEndpoint(name = "EgresoServiceImplPort")
    public EgresoServiceWS getEgresoServiceImplPort() {
        return super.getPort(new QName("http://servicio.com.sv/", "EgresoServiceImplPort"), EgresoServiceWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EgresoServiceWS
     */
    @WebEndpoint(name = "EgresoServiceImplPort")
    public EgresoServiceWS getEgresoServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://servicio.com.sv/", "EgresoServiceImplPort"), EgresoServiceWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EGRESOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw EGRESOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return EGRESOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
