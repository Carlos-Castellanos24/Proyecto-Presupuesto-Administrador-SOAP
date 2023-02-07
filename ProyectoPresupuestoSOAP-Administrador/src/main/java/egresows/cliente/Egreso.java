
package egresows.cliente;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para egreso complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="egreso">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idEgreso" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="cuenta" type="{http://web.com.sv/}cuenta" minOccurs="0"/>
 *         &lt;element name="saldoEgreso" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="estadoEgreso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechaEgreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "egreso", propOrder = {
    "idEgreso",
    "cuenta",
    "saldoEgreso",
    "descripcion",
    "estadoEgreso",
    "fechaEgreso"
})
public class Egreso {

    protected Integer idEgreso;
    protected Cuenta cuenta;
    protected double saldoEgreso;
    protected String descripcion;
    protected String estadoEgreso;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaEgreso;

    /**
     * Obtiene el valor de la propiedad idEgreso.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEgreso() {
        return idEgreso;
    }

    /**
     * Define el valor de la propiedad idEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEgreso(Integer value) {
        this.idEgreso = value;
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
     * Obtiene el valor de la propiedad saldoEgreso.
     * 
     */
    public double getSaldoEgreso() {
        return saldoEgreso;
    }

    /**
     * Define el valor de la propiedad saldoEgreso.
     * 
     */
    public void setSaldoEgreso(double value) {
        this.saldoEgreso = value;
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
     * Obtiene el valor de la propiedad estadoEgreso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoEgreso() {
        return estadoEgreso;
    }

    /**
     * Define el valor de la propiedad estadoEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoEgreso(String value) {
        this.estadoEgreso = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaEgreso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaEgreso() {
        return fechaEgreso;
    }

    /**
     * Define el valor de la propiedad fechaEgreso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaEgreso(XMLGregorianCalendar value) {
        this.fechaEgreso = value;
    }

}
