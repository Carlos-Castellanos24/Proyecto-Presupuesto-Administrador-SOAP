
package usuariows.cliente;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the usuariows.cliente package. 
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
    private final static QName _InhabilitarUsuarioResponse_QNAME = new QName("http://web.com.sv/", "inhabilitarUsuarioResponse");
    private final static QName _ListarUsuarios_QNAME = new QName("http://web.com.sv/", "listarUsuarios");
    private final static QName _ActualizarUsuario_QNAME = new QName("http://web.com.sv/", "actualizarUsuario");
    private final static QName _ActualizarUsuarioResponse_QNAME = new QName("http://web.com.sv/", "actualizarUsuarioResponse");
    private final static QName _InsertarUsuario_QNAME = new QName("http://web.com.sv/", "insertarUsuario");
    private final static QName _ListarUsuariosResponse_QNAME = new QName("http://web.com.sv/", "listarUsuariosResponse");
    private final static QName _BuscarUsuarioPorIdResponse_QNAME = new QName("http://web.com.sv/", "buscarUsuarioPorIdResponse");
    private final static QName _InhabilitarUsuario_QNAME = new QName("http://web.com.sv/", "inhabilitarUsuario");
    private final static QName _InsertarUsuarioResponse_QNAME = new QName("http://web.com.sv/", "insertarUsuarioResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: usuariows.cliente
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActualizarUsuarioResponse }
     * 
     */
    public ActualizarUsuarioResponse createActualizarUsuarioResponse() {
        return new ActualizarUsuarioResponse();
    }

    /**
     * Create an instance of {@link InsertarUsuario }
     * 
     */
    public InsertarUsuario createInsertarUsuario() {
        return new InsertarUsuario();
    }

    /**
     * Create an instance of {@link ListarUsuariosResponse }
     * 
     */
    public ListarUsuariosResponse createListarUsuariosResponse() {
        return new ListarUsuariosResponse();
    }

    /**
     * Create an instance of {@link BuscarUsuarioPorId }
     * 
     */
    public BuscarUsuarioPorId createBuscarUsuarioPorId() {
        return new BuscarUsuarioPorId();
    }

    /**
     * Create an instance of {@link InhabilitarUsuarioResponse }
     * 
     */
    public InhabilitarUsuarioResponse createInhabilitarUsuarioResponse() {
        return new InhabilitarUsuarioResponse();
    }

    /**
     * Create an instance of {@link ListarUsuarios }
     * 
     */
    public ListarUsuarios createListarUsuarios() {
        return new ListarUsuarios();
    }

    /**
     * Create an instance of {@link ActualizarUsuario }
     * 
     */
    public ActualizarUsuario createActualizarUsuario() {
        return new ActualizarUsuario();
    }

    /**
     * Create an instance of {@link BuscarUsuarioPorIdResponse }
     * 
     */
    public BuscarUsuarioPorIdResponse createBuscarUsuarioPorIdResponse() {
        return new BuscarUsuarioPorIdResponse();
    }

    /**
     * Create an instance of {@link InhabilitarUsuario }
     * 
     */
    public InhabilitarUsuario createInhabilitarUsuario() {
        return new InhabilitarUsuario();
    }

    /**
     * Create an instance of {@link InsertarUsuarioResponse }
     * 
     */
    public InsertarUsuarioResponse createInsertarUsuarioResponse() {
        return new InsertarUsuarioResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarUsuarioResponse")
    public JAXBElement<InhabilitarUsuarioResponse> createInhabilitarUsuarioResponse(InhabilitarUsuarioResponse value) {
        return new JAXBElement<InhabilitarUsuarioResponse>(_InhabilitarUsuarioResponse_QNAME, InhabilitarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarUsuarios")
    public JAXBElement<ListarUsuarios> createListarUsuarios(ListarUsuarios value) {
        return new JAXBElement<ListarUsuarios>(_ListarUsuarios_QNAME, ListarUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarUsuario")
    public JAXBElement<ActualizarUsuario> createActualizarUsuario(ActualizarUsuario value) {
        return new JAXBElement<ActualizarUsuario>(_ActualizarUsuario_QNAME, ActualizarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "actualizarUsuarioResponse")
    public JAXBElement<ActualizarUsuarioResponse> createActualizarUsuarioResponse(ActualizarUsuarioResponse value) {
        return new JAXBElement<ActualizarUsuarioResponse>(_ActualizarUsuarioResponse_QNAME, ActualizarUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "insertarUsuario")
    public JAXBElement<InsertarUsuario> createInsertarUsuario(InsertarUsuario value) {
        return new JAXBElement<InsertarUsuario>(_InsertarUsuario_QNAME, InsertarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "listarUsuariosResponse")
    public JAXBElement<ListarUsuariosResponse> createListarUsuariosResponse(ListarUsuariosResponse value) {
        return new JAXBElement<ListarUsuariosResponse>(_ListarUsuariosResponse_QNAME, ListarUsuariosResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link InhabilitarUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "inhabilitarUsuario")
    public JAXBElement<InhabilitarUsuario> createInhabilitarUsuario(InhabilitarUsuario value) {
        return new JAXBElement<InhabilitarUsuario>(_InhabilitarUsuario_QNAME, InhabilitarUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertarUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://web.com.sv/", name = "insertarUsuarioResponse")
    public JAXBElement<InsertarUsuarioResponse> createInsertarUsuarioResponse(InsertarUsuarioResponse value) {
        return new JAXBElement<InsertarUsuarioResponse>(_InsertarUsuarioResponse_QNAME, InsertarUsuarioResponse.class, null, value);
    }

}
