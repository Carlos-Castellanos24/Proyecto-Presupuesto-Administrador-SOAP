
package egresows.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the egresows.cliente package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InhabilitarEgreso_QNAME = new QName("http://web.com.sv/", "inhabilitarEgreso");
    private final static QName _ActualizarEgresoResponse_QNAME = new QName("http://web.com.sv/", "actualizarEgresoResponse");
    private final static QName _ActualizarCuenta_QNAME = new QName("http://web.com.sv/", "actualizarCuenta");
    private final static QName _InhabilitarEgresoResponse_QNAME = new QName("http://web.com.sv/", "inhabilitarEgresoResponse");
    private final static QName _CuentaException_QNAME = new QName("http://web.com.sv/", "CuentaException");
    private final static QName _AgregarEgreso_QNAME = new QName("http://web.com.sv/", "agregarEgreso");
    private final static QName _BuscarCuentaPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorIdResponse");
    private final static QName _ListarEgresosResponse_QNAME = new QName("http://web.com.sv/", "listarEgresosResponse");
    private final static QName _EgresoException_QNAME = new QName("http://web.com.sv/", "EgresoException");
    private final static QName _BuscarCuentaPorId_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorId");
    private final static QName _BuscarEgresoPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarEgresoPorIdResponse");
    private final static QName _ActualizarEgreso_QNAME = new QName("http://web.com.sv/", "actualizarEgreso");
    private final static QName _AgregarEgresoResponse_QNAME = new QName("http://web.com.sv/", "agregarEgresoResponse");
    private final static QName _BuscarEgresoPorId_QNAME = new QName("http://web.com.sv/", "buscarEgresoPorId");
    private final static QName _ListarEgresos_QNAME = new QName("http://web.com.sv/", "listarEgresos");
    private final static QName _ActualizarCuentaResponse_QNAME = new QName("http://web.com.sv/", "actualizarCuentaResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: egresows.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CuentaException }
     * 
     */
    public CuentaException createCuentaException() {
        return new CuentaException();
    }

    /**
     * Create an instance of {@link AgregarEgreso }
     * 
     */
    public AgregarEgreso createAgregarEgreso() {
        return new AgregarEgreso();
    }

    /**
     * Create an instance of {@link BuscarCuentaPorIdResponse }
     * 
     */
    public BuscarCuentaPorIdResponse createBuscarCuentaPorIdResponse() {
        return new BuscarCuentaPorIdResponse();
    }

    /**
     * Create an instance of {@link InhabilitarEgresoResponse }
     * 
     */
    public InhabilitarEgresoResponse createInhabilitarEgresoResponse() {
        return new InhabilitarEgresoResponse();
    }

    /**
     * Create an instance of {@link ListarEgresosResponse }
     * 
     */
    public ListarEgresosResponse createListarEgresosResponse() {
        return new ListarEgresosResponse();
    }

    /**
     * Create an instance of {@link InhabilitarEgreso }
     * 
     */
    public InhabilitarEgreso createInhabilitarEgreso() {
        return new InhabilitarEgreso();
    }

    /**
     * Create an instance of {@link ActualizarEgresoResponse }
     * 
     */
    public ActualizarEgresoResponse createActualizarEgresoResponse() {
        return new ActualizarEgresoResponse();
    }

    /**
     * Create an instance of {@link ActualizarCuenta }
     * 
     */
    public ActualizarCuenta createActualizarCuenta() {
        return new ActualizarCuenta();
    }

    /**
     * Create an instance of {@link ListarEgresos }
     * 
     */
    public ListarEgresos createListarEgresos() {
        return new ListarEgresos();
    }

    /**
     * Create an instance of {@link AgregarEgresoResponse }
     * 
     */
    public AgregarEgresoResponse createAgregarEgresoResponse() {
        return new AgregarEgresoResponse();
    }

    /**
     * Create an instance of {@link BuscarEgresoPorId }
     * 
     */
    public BuscarEgresoPorId createBuscarEgresoPorId() {
        return new BuscarEgresoPorId();
    }

    /**
     * Create an instance of {@link ActualizarCuentaResponse }
     * 
     */
    public ActualizarCuentaResponse createActualizarCuentaResponse() {
        return new ActualizarCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarEgresoPorIdResponse }
     * 
     */
    public BuscarEgresoPorIdResponse createBuscarEgresoPorIdResponse() {
        return new BuscarEgresoPorIdResponse();
    }

    /**
     * Create an instance of {@link EgresoException }
     * 
     */
    public EgresoException createEgresoException() {
        return new EgresoException();
    }

    /**
     * Create an instance of {@link BuscarCuentaPorId }
     * 
     */
    public BuscarCuentaPorId createBuscarCuentaPorId() {
        return new BuscarCuentaPorId();
    }

    /**
     * Create an instance of {@link ActualizarEgreso }
     * 
     */
    public ActualizarEgreso createActualizarEgreso() {
        return new ActualizarEgreso();
    }

    /**
     * Create an instance of {@link Egreso }
     * 
     */
    public Egreso createEgreso() {
        return new Egreso();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Cuenta }
     * 
     */
    public Cuenta createCuenta() {
        return new Cuenta();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarEgreso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarEgreso")
    public JAXBElement<InhabilitarEgreso> createInhabilitarEgreso(InhabilitarEgreso value) {
        return new JAXBElement<InhabilitarEgreso>(_InhabilitarEgreso_QNAME, InhabilitarEgreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEgresoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarEgresoResponse")
    public JAXBElement<ActualizarEgresoResponse> createActualizarEgresoResponse(ActualizarEgresoResponse value) {
        return new JAXBElement<ActualizarEgresoResponse>(_ActualizarEgresoResponse_QNAME, ActualizarEgresoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarCuenta")
    public JAXBElement<ActualizarCuenta> createActualizarCuenta(ActualizarCuenta value) {
        return new JAXBElement<ActualizarCuenta>(_ActualizarCuenta_QNAME, ActualizarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarEgresoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarEgresoResponse")
    public JAXBElement<InhabilitarEgresoResponse> createInhabilitarEgresoResponse(InhabilitarEgresoResponse value) {
        return new JAXBElement<InhabilitarEgresoResponse>(_InhabilitarEgresoResponse_QNAME, InhabilitarEgresoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "CuentaException")
    public JAXBElement<CuentaException> createCuentaException(CuentaException value) {
        return new JAXBElement<CuentaException>(_CuentaException_QNAME, CuentaException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEgreso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "agregarEgreso")
    public JAXBElement<AgregarEgreso> createAgregarEgreso(AgregarEgreso value) {
        return new JAXBElement<AgregarEgreso>(_AgregarEgreso_QNAME, AgregarEgreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarCuentaPorIdResponse")
    public JAXBElement<BuscarCuentaPorIdResponse> createBuscarCuentaPorIdResponse(BuscarCuentaPorIdResponse value) {
        return new JAXBElement<BuscarCuentaPorIdResponse>(_BuscarCuentaPorIdResponse_QNAME, BuscarCuentaPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEgresosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarEgresosResponse")
    public JAXBElement<ListarEgresosResponse> createListarEgresosResponse(ListarEgresosResponse value) {
        return new JAXBElement<ListarEgresosResponse>(_ListarEgresosResponse_QNAME, ListarEgresosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EgresoException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "EgresoException")
    public JAXBElement<EgresoException> createEgresoException(EgresoException value) {
        return new JAXBElement<EgresoException>(_EgresoException_QNAME, EgresoException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarCuentaPorId")
    public JAXBElement<BuscarCuentaPorId> createBuscarCuentaPorId(BuscarCuentaPorId value) {
        return new JAXBElement<BuscarCuentaPorId>(_BuscarCuentaPorId_QNAME, BuscarCuentaPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEgresoPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarEgresoPorIdResponse")
    public JAXBElement<BuscarEgresoPorIdResponse> createBuscarEgresoPorIdResponse(BuscarEgresoPorIdResponse value) {
        return new JAXBElement<BuscarEgresoPorIdResponse>(_BuscarEgresoPorIdResponse_QNAME, BuscarEgresoPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarEgreso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarEgreso")
    public JAXBElement<ActualizarEgreso> createActualizarEgreso(ActualizarEgreso value) {
        return new JAXBElement<ActualizarEgreso>(_ActualizarEgreso_QNAME, ActualizarEgreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarEgresoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "agregarEgresoResponse")
    public JAXBElement<AgregarEgresoResponse> createAgregarEgresoResponse(AgregarEgresoResponse value) {
        return new JAXBElement<AgregarEgresoResponse>(_AgregarEgresoResponse_QNAME, AgregarEgresoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarEgresoPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarEgresoPorId")
    public JAXBElement<BuscarEgresoPorId> createBuscarEgresoPorId(BuscarEgresoPorId value) {
        return new JAXBElement<BuscarEgresoPorId>(_BuscarEgresoPorId_QNAME, BuscarEgresoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarEgresos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarEgresos")
    public JAXBElement<ListarEgresos> createListarEgresos(ListarEgresos value) {
        return new JAXBElement<ListarEgresos>(_ListarEgresos_QNAME, ListarEgresos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarCuentaResponse")
    public JAXBElement<ActualizarCuentaResponse> createActualizarCuentaResponse(ActualizarCuentaResponse value) {
        return new JAXBElement<ActualizarCuentaResponse>(_ActualizarCuentaResponse_QNAME, ActualizarCuentaResponse.class, null, value);
    }

}
