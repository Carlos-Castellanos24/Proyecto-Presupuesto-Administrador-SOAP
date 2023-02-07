
package ingresows.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para ingreso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingreso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idIngreso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cuenta" type="{http://web.com.sv/}cuenta" minOccurs="0"/>
 *         &lt;element name="saldoIngreso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaIngreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="estadoIngreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingreso", propOrder = {
    "idIngreso",
    "cuenta",
    "saldoIngreso",
    "descripcion",
    "fechaIngreso",
    "estadoIngreso"
})
public class Ingreso {

    protected Integer idIngreso;
    protected Cuenta cuenta;
    protected double saldoIngreso;
    protected String descripcion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaIngreso;
    protected String estadoIngreso;

    /**
     * Obtiene el valor de la propiedad idIngreso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdIngreso() {
        return idIngreso;
    }

    /**
     * Define el valor de la propiedad idIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdIngreso(Integer value) {
        this.idIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad cuenta.
     * 
     * @return
     *     possible object is
     *     {@link Cuenta }
     *     
     */
    public Cuenta getCuenta() {
        return cuenta;
    }

    /**
     * Define el valor de la propiedad cuenta.
     * 
     * @param value
     *     allowed object is
     *     {@link Cuenta }
     *     
     */
    public void setCuenta(Cuenta value) {
        this.cuenta = value;
    }

    /**
     * Obtiene el valor de la propiedad saldoIngreso.
     * 
     */
    public double getSaldoIngreso() {
        return saldoIngreso;
    }

    /**
     * Define el valor de la propiedad saldoIngreso.
     * 
     */
    public void setSaldoIngreso(double value) {
        this.saldoIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaIngreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaIngreso() {
        return fechaIngreso;
    }

    /**
     * Define el valor de la propiedad fechaIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaIngreso(XMLGregorianCalendar value) {
        this.fechaIngreso = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoIngreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoIngreso() {
        return estadoIngreso;
    }

    /**
     * Define el valor de la propiedad estadoIngreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoIngreso(String value) {
        this.estadoIngreso = value;
    }

}
