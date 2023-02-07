
package cuentaws.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cuentaws.cliente package. 
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

    private final static QName _AgregarCuentaResponse_QNAME = new QName("http://web.com.sv/", "agregarCuentaResponse");
    private final static QName _BuscarCuentaPorNumeroCuenta_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorNumeroCuenta");
    private final static QName _ListarCuentasResponse_QNAME = new QName("http://web.com.sv/", "listarCuentasResponse");
    private final static QName _ActualizarCuenta_QNAME = new QName("http://web.com.sv/", "actualizarCuenta");
    private final static QName _CuentaException_QNAME = new QName("http://web.com.sv/", "CuentaException");
    private final static QName _BuscarCuentaPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorIdResponse");
    private final static QName _AgregarCuenta_QNAME = new QName("http://web.com.sv/", "agregarCuenta");
    private final static QName _ListarCuentas_QNAME = new QName("http://web.com.sv/", "listarCuentas");
    private final static QName _BuscarCuentaPorId_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorId");
    private final static QName _BuscarCuentaPorNumeroCuentaResponse_QNAME = new QName("http://web.com.sv/", "buscarCuentaPorNumeroCuentaResponse");
    private final static QName _BuscarLoginPorId_QNAME = new QName("http://web.com.sv/", "buscarLoginPorId");
    private final static QName _ActualizarCuentaResponse_QNAME = new QName("http://web.com.sv/", "actualizarCuentaResponse");
    private final static QName _BuscarLoginPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarLoginPorIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cuentaws.cliente
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
     * Create an instance of {@link BuscarCuentaPorIdResponse }
     * 
     */
    public BuscarCuentaPorIdResponse createBuscarCuentaPorIdResponse() {
        return new BuscarCuentaPorIdResponse();
    }

    /**
     * Create an instance of {@link AgregarCuenta }
     * 
     */
    public AgregarCuenta createAgregarCuenta() {
        return new AgregarCuenta();
    }

    /**
     * Create an instance of {@link BuscarCuentaPorNumeroCuenta }
     * 
     */
    public BuscarCuentaPorNumeroCuenta createBuscarCuentaPorNumeroCuenta() {
        return new BuscarCuentaPorNumeroCuenta();
    }

    /**
     * Create an instance of {@link AgregarCuentaResponse }
     * 
     */
    public AgregarCuentaResponse createAgregarCuentaResponse() {
        return new AgregarCuentaResponse();
    }

    /**
     * Create an instance of {@link ActualizarCuenta }
     * 
     */
    public ActualizarCuenta createActualizarCuenta() {
        return new ActualizarCuenta();
    }

    /**
     * Create an instance of {@link ListarCuentasResponse }
     * 
     */
    public ListarCuentasResponse createListarCuentasResponse() {
        return new ListarCuentasResponse();
    }

    /**
     * Create an instance of {@link ActualizarCuentaResponse }
     * 
     */
    public ActualizarCuentaResponse createActualizarCuentaResponse() {
        return new ActualizarCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarLoginPorIdResponse }
     * 
     */
    public BuscarLoginPorIdResponse createBuscarLoginPorIdResponse() {
        return new BuscarLoginPorIdResponse();
    }

    /**
     * Create an instance of {@link ListarCuentas }
     * 
     */
    public ListarCuentas createListarCuentas() {
        return new ListarCuentas();
    }

    /**
     * Create an instance of {@link BuscarCuentaPorId }
     * 
     */
    public BuscarCuentaPorId createBuscarCuentaPorId() {
        return new BuscarCuentaPorId();
    }

    /**
     * Create an instance of {@link BuscarCuentaPorNumeroCuentaResponse }
     * 
     */
    public BuscarCuentaPorNumeroCuentaResponse createBuscarCuentaPorNumeroCuentaResponse() {
        return new BuscarCuentaPorNumeroCuentaResponse();
    }

    /**
     * Create an instance of {@link BuscarLoginPorId }
     * 
     */
    public BuscarLoginPorId createBuscarLoginPorId() {
        return new BuscarLoginPorId();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "agregarCuentaResponse")
    public JAXBElement<AgregarCuentaResponse> createAgregarCuentaResponse(AgregarCuentaResponse value) {
        return new JAXBElement<AgregarCuentaResponse>(_AgregarCuentaResponse_QNAME, AgregarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaPorNumeroCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarCuentaPorNumeroCuenta")
    public JAXBElement<BuscarCuentaPorNumeroCuenta> createBuscarCuentaPorNumeroCuenta(BuscarCuentaPorNumeroCuenta value) {
        return new JAXBElement<BuscarCuentaPorNumeroCuenta>(_BuscarCuentaPorNumeroCuenta_QNAME, BuscarCuentaPorNumeroCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCuentasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarCuentasResponse")
    public JAXBElement<ListarCuentasResponse> createListarCuentasResponse(ListarCuentasResponse value) {
        return new JAXBElement<ListarCuentasResponse>(_ListarCuentasResponse_QNAME, ListarCuentasResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CuentaException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "CuentaException")
    public JAXBElement<CuentaException> createCuentaException(CuentaException value) {
        return new JAXBElement<CuentaException>(_CuentaException_QNAME, CuentaException.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCuenta }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "agregarCuenta")
    public JAXBElement<AgregarCuenta> createAgregarCuenta(AgregarCuenta value) {
        return new JAXBElement<AgregarCuenta>(_AgregarCuenta_QNAME, AgregarCuenta.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCuentas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarCuentas")
    public JAXBElement<ListarCuentas> createListarCuentas(ListarCuentas value) {
        return new JAXBElement<ListarCuentas>(_ListarCuentas_QNAME, ListarCuentas.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarCuentaPorNumeroCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarCuentaPorNumeroCuentaResponse")
    public JAXBElement<BuscarCuentaPorNumeroCuentaResponse> createBuscarCuentaPorNumeroCuentaResponse(BuscarCuentaPorNumeroCuentaResponse value) {
        return new JAXBElement<BuscarCuentaPorNumeroCuentaResponse>(_BuscarCuentaPorNumeroCuentaResponse_QNAME, BuscarCuentaPorNumeroCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLoginPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarLoginPorId")
    public JAXBElement<BuscarLoginPorId> createBuscarLoginPorId(BuscarLoginPorId value) {
        return new JAXBElement<BuscarLoginPorId>(_BuscarLoginPorId_QNAME, BuscarLoginPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCuentaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarCuentaResponse")
    public JAXBElement<ActualizarCuentaResponse> createActualizarCuentaResponse(ActualizarCuentaResponse value) {
        return new JAXBElement<ActualizarCuentaResponse>(_ActualizarCuentaResponse_QNAME, ActualizarCuentaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLoginPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarLoginPorIdResponse")
    public JAXBElement<BuscarLoginPorIdResponse> createBuscarLoginPorIdResponse(BuscarLoginPorIdResponse value) {
        return new JAXBElement<BuscarLoginPorIdResponse>(_BuscarLoginPorIdResponse_QNAME, BuscarLoginPorIdResponse.class, null, value);
    }

}
