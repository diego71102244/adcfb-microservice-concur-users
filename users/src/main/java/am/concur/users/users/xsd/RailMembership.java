//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 12:34:38 PM CDT 
//


package am.concur.users.users.xsd;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para RailMembership complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RailMembership"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AccountNo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PointTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="NextStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PointsUntilNextStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentsUntilNextStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="BahnCardClass" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="First"/&gt;
 *               &lt;enumeration value="Second"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BahnCardType" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Card25"/&gt;
 *               &lt;enumeration value="Card50"/&gt;
 *               &lt;enumeration value="Card100"/&gt;
 *               &lt;enumeration value="Business25"/&gt;
 *               &lt;enumeration value="Business50"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailMembership", propOrder = {
    "vendorCode",
    "accountNo",
    "status",
    "statusBenefits",
    "pointTotal",
    "segmentTotal",
    "nextStatus",
    "expiration",
    "pointsUntilNextStatus",
    "segmentsUntilNextStatus",
    "bahnCardClass",
    "bahnCardType"
})
public class RailMembership {

    @XmlElement(name = "VendorCode", required = true)
    protected String vendorCode;
    @XmlElement(name = "AccountNo", required = true)
    protected String accountNo;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "StatusBenefits")
    protected String statusBenefits;
    @XmlElement(name = "PointTotal")
    protected Integer pointTotal;
    @XmlElement(name = "SegmentTotal")
    protected Integer segmentTotal;
    @XmlElement(name = "NextStatus")
    protected String nextStatus;
    @XmlElement(name = "Expiration")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiration;
    @XmlElement(name = "PointsUntilNextStatus")
    protected Integer pointsUntilNextStatus;
    @XmlElement(name = "SegmentsUntilNextStatus")
    protected Integer segmentsUntilNextStatus;
    @XmlElement(name = "BahnCardClass")
    protected String bahnCardClass;
    @XmlElement(name = "BahnCardType")
    protected String bahnCardType;

    /**
     * Obtiene el valor de la propiedad vendorCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorCode() {
        return vendorCode;
    }

    /**
     * Define el valor de la propiedad vendorCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorCode(String value) {
        this.vendorCode = value;
    }

    /**
     * Obtiene el valor de la propiedad accountNo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * Define el valor de la propiedad accountNo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNo(String value) {
        this.accountNo = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad statusBenefits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusBenefits() {
        return statusBenefits;
    }

    /**
     * Define el valor de la propiedad statusBenefits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusBenefits(String value) {
        this.statusBenefits = value;
    }

    /**
     * Obtiene el valor de la propiedad pointTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointTotal() {
        return pointTotal;
    }

    /**
     * Define el valor de la propiedad pointTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointTotal(Integer value) {
        this.pointTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentTotal.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentTotal() {
        return segmentTotal;
    }

    /**
     * Define el valor de la propiedad segmentTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentTotal(Integer value) {
        this.segmentTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad nextStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextStatus() {
        return nextStatus;
    }

    /**
     * Define el valor de la propiedad nextStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextStatus(String value) {
        this.nextStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad expiration.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiration() {
        return expiration;
    }

    /**
     * Define el valor de la propiedad expiration.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiration(XMLGregorianCalendar value) {
        this.expiration = value;
    }

    /**
     * Obtiene el valor de la propiedad pointsUntilNextStatus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPointsUntilNextStatus() {
        return pointsUntilNextStatus;
    }

    /**
     * Define el valor de la propiedad pointsUntilNextStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPointsUntilNextStatus(Integer value) {
        this.pointsUntilNextStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad segmentsUntilNextStatus.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSegmentsUntilNextStatus() {
        return segmentsUntilNextStatus;
    }

    /**
     * Define el valor de la propiedad segmentsUntilNextStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSegmentsUntilNextStatus(Integer value) {
        this.segmentsUntilNextStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad bahnCardClass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBahnCardClass() {
        return bahnCardClass;
    }

    /**
     * Define el valor de la propiedad bahnCardClass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBahnCardClass(String value) {
        this.bahnCardClass = value;
    }

    /**
     * Obtiene el valor de la propiedad bahnCardType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBahnCardType() {
        return bahnCardType;
    }

    /**
     * Define el valor de la propiedad bahnCardType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBahnCardType(String value) {
        this.bahnCardType = value;
    }

}
