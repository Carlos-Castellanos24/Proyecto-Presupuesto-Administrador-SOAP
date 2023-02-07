
package loginws.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the loginws.cliente package. 
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

    private final static QName _BuscarUsuarioPorId_QNAME = new QName("http://web.com.sv/", "buscarUsuarioPorId");
    private final static QName _ActualizarLoginResponse_QNAME = new QName("http://web.com.sv/", "actualizarLoginResponse");
    private final static QName _BuscarUsuarioPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarUsuarioPorIdResponse");
    private final static QName _InsertarLoginResponse_QNAME = new QName("http://web.com.sv/", "insertarLoginResponse");
    private final static QName _ActualizarLogin_QNAME = new QName("http://web.com.sv/", "actualizarLogin");
    private final static QName _BuscarLoginPorId_QNAME = new QName("http://web.com.sv/", "buscarLoginPorId");
    private final static QName _InsertarLogin_QNAME = new QName("http://web.com.sv/", "insertarLogin");
    private final static QName _ListarLogin_QNAME = new QName("http://web.com.sv/", "listarLogin");
    private final static QName _InhabilitarLogin_QNAME = new QName("http://web.com.sv/", "inhabilitarLogin");
    private final static QName _BuscarLoginPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarLoginPorIdResponse");
    private final static QName _InhabilitarLoginResponse_QNAME = new QName("http://web.com.sv/", "inhabilitarLoginResponse");
    private final static QName _ListarLoginResponse_QNAME = new QName("http://web.com.sv/", "listarLoginResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: loginws.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InhabilitarLogin }
     * 
     */
    public InhabilitarLogin createInhabilitarLogin() {
        return new InhabilitarLogin();
    }

    /**
     * Create an instance of {@link ListarLogin }
     * 
     */
    public ListarLogin createListarLogin() {
        return new ListarLogin();
    }

    /**
     * Create an instance of {@link BuscarLoginPorIdResponse }
     * 
     */
    public BuscarLoginPorIdResponse createBuscarLoginPorIdResponse() {
        return new BuscarLoginPorIdResponse();
    }

    /**
     * Create an instance of {@link InhabilitarLoginResponse }
     * 
     */
    public InhabilitarLoginResponse createInhabilitarLoginResponse() {
        return new InhabilitarLoginResponse();
    }

    /**
     * Create an instance of {@link ListarLoginResponse }
     * 
     */
    public ListarLoginResponse createListarLoginResponse() {
        return new ListarLoginResponse();
    }

    /**
     * Create an instance of {@link ActualizarLoginResponse }
     * 
     */
    public ActualizarLoginResponse createActualizarLoginResponse() {
        return new ActualizarLoginResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuarioPorId }
     * 
     */
    public BuscarUsuarioPorId createBuscarUsuarioPorId() {
        return new BuscarUsuarioPorId();
    }

    /**
     * Create an instance of {@link InsertarLoginResponse }
     * 
     */
    public InsertarLoginResponse createInsertarLoginResponse() {
        return new InsertarLoginResponse();
    }

    /**
     * Create an instance of {@link ActualizarLogin }
     * 
     */
    public ActualizarLogin createActualizarLogin() {
        return new ActualizarLogin();
    }

    /**
     * Create an instance of {@link BuscarLoginPorId }
     * 
     */
    public BuscarLoginPorId createBuscarLoginPorId() {
        return new BuscarLoginPorId();
    }

    /**
     * Create an instance of {@link InsertarLogin }
     * 
     */
    public InsertarLogin createInsertarLogin() {
        return new InsertarLogin();
    }

    /**
     * Create an instance of {@link BuscarUsuarioPorIdResponse }
     * 
     */
    public BuscarUsuarioPorIdResponse createBuscarUsuarioPorIdResponse() {
        return new BuscarUsuarioPorIdResponse();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioPorId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarUsuarioPorId")
    public JAXBElement<BuscarUsuarioPorId> createBuscarUsuarioPorId(BuscarUsuarioPorId value) {
        return new JAXBElement<BuscarUsuarioPorId>(_BuscarUsuarioPorId_QNAME, BuscarUsuarioPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarLoginResponse")
    public JAXBElement<ActualizarLoginResponse> createActualizarLoginResponse(ActualizarLoginResponse value) {
        return new JAXBElement<ActualizarLoginResponse>(_ActualizarLoginResponse_QNAME, ActualizarLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarUsuarioPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarUsuarioPorIdResponse")
    public JAXBElement<BuscarUsuarioPorIdResponse> createBuscarUsuarioPorIdResponse(BuscarUsuarioPorIdResponse value) {
        return new JAXBElement<BuscarUsuarioPorIdResponse>(_BuscarUsuarioPorIdResponse_QNAME, BuscarUsuarioPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "insertarLoginResponse")
    public JAXBElement<InsertarLoginResponse> createInsertarLoginResponse(InsertarLoginResponse value) {
        return new JAXBElement<InsertarLoginResponse>(_InsertarLoginResponse_QNAME, InsertarLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarLogin")
    public JAXBElement<ActualizarLogin> createActualizarLogin(ActualizarLogin value) {
        return new JAXBElement<ActualizarLogin>(_ActualizarLogin_QNAME, ActualizarLogin.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "insertarLogin")
    public JAXBElement<InsertarLogin> createInsertarLogin(InsertarLogin value) {
        return new JAXBElement<InsertarLogin>(_InsertarLogin_QNAME, InsertarLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarLogin")
    public JAXBElement<ListarLogin> createListarLogin(ListarLogin value) {
        return new JAXBElement<ListarLogin>(_ListarLogin_QNAME, ListarLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarLogin }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarLogin")
    public JAXBElement<InhabilitarLogin> createInhabilitarLogin(InhabilitarLogin value) {
        return new JAXBElement<InhabilitarLogin>(_InhabilitarLogin_QNAME, InhabilitarLogin.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarLoginPorIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "buscarLoginPorIdResponse")
    public JAXBElement<BuscarLoginPorIdResponse> createBuscarLoginPorIdResponse(BuscarLoginPorIdResponse value) {
        return new JAXBElement<BuscarLoginPorIdResponse>(_BuscarLoginPorIdResponse_QNAME, BuscarLoginPorIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarLoginResponse")
    public JAXBElement<InhabilitarLoginResponse> createInhabilitarLoginResponse(InhabilitarLoginResponse value) {
        return new JAXBElement<InhabilitarLoginResponse>(_InhabilitarLoginResponse_QNAME, InhabilitarLoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarLoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarLoginResponse")
    public JAXBElement<ListarLoginResponse> createListarLoginResponse(ListarLoginResponse value) {
        return new JAXBElement<ListarLoginResponse>(_ListarLoginResponse_QNAME, ListarLoginResponse.class, null, value);
    }

}
