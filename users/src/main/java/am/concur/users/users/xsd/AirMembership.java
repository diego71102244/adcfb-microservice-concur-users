//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 12:34:38 PM CDT 
//


package am.concur.users.users.xsd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AirMembership complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AirMembership"&gt;
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
 *         &lt;element name="PointsUntilNextStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="SegmentsUntilNextStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="IsSenator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirMembership", propOrder = {
    "vendorCode",
    "accountNo",
    "status",
    "statusBenefits",
    "pointTotal",
    "segmentTotal",
    "nextStatus",
    "pointsUntilNextStatus",
    "segmentsUntilNextStatus",
    "isSenator"
})
public class AirMembership {

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
    @XmlElement(name = "PointsUntilNextStatus")
    protected Integer pointsUntilNextStatus;
    @XmlElement(name = "SegmentsUntilNextStatus")
    protected Integer segmentsUntilNextStatus;
    @XmlElement(name = "IsSenator")
    protected Boolean isSenator;

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
     * Obtiene el valor de la propiedad isSenator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSenator() {
        return isSenator;
    }

    /**
     * Define el valor de la propiedad isSenator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSenator(Boolean value) {
        this.isSenator = value;
    }

}
