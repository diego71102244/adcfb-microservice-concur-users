//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 12:34:38 PM CDT 
//


package am.concur.users.users.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.aeromexico.booking.corporate.microservice.xsd package. 
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

    private final static QName _ProfileResponseTSAInfoGender_QNAME = new QName("", "Gender");
    private final static QName _ProfileResponseTSAInfoDateOfBirth_QNAME = new QName("", "DateOfBirth");
    private final static QName _ProfileResponseTSAInfoNoMiddleName_QNAME = new QName("", "NoMiddleName");
    private final static QName _ProfileResponseAirMealCode_QNAME = new QName("", "MealCode");
    private final static QName _ProfileResponseVisasVisaVisaDateIssued_QNAME = new QName("", "VisaDateIssued");
    private final static QName _ProfileResponseVisasVisaVisaExpiration_QNAME = new QName("", "VisaExpiration");
    private final static QName _ProfileResponsePassportsPassportPassportExpiration_QNAME = new QName("", "PassportExpiration");
    private final static QName _ProfileResponsePassportsPassportPassportDateIssued_QNAME = new QName("", "PassportDateIssued");
    private final static QName _ProfileResponseDriversLicensesDriversLicenseExpiration_QNAME = new QName("", "Expiration");
    private final static QName _ProfileResponseEmergencyContactRelationship_QNAME = new QName("", "Relationship");
    private final static QName _ProfileResponseGeneralAccountTerminationDate_QNAME = new QName("", "AccountTerminationDate");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.aeromexico.booking.corporate.microservice.xsd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProfileResponse }
     * 
     */
    public ProfileResponse createProfileResponse() {
        return new ProfileResponse();
    }

    /**
     * Create an instance of {@link ProfileResponse.AdvantageMemberships }
     * 
     */
    public ProfileResponse.AdvantageMemberships createProfileResponseAdvantageMemberships() {
        return new ProfileResponse.AdvantageMemberships();
    }

    /**
     * Create an instance of {@link ProfileResponse.SouthwestUnusedTickets }
     * 
     */
    public ProfileResponse.SouthwestUnusedTickets createProfileResponseSouthwestUnusedTickets() {
        return new ProfileResponse.SouthwestUnusedTickets();
    }

    /**
     * Create an instance of {@link ProfileResponse.UnusedTickets }
     * 
     */
    public ProfileResponse.UnusedTickets createProfileResponseUnusedTickets() {
        return new ProfileResponse.UnusedTickets();
    }

    /**
     * Create an instance of {@link ProfileResponse.Sponsors }
     * 
     */
    public ProfileResponse.Sponsors createProfileResponseSponsors() {
        return new ProfileResponse.Sponsors();
    }

    /**
     * Create an instance of {@link ProfileResponse.Roles }
     * 
     */
    public ProfileResponse.Roles createProfileResponseRoles() {
        return new ProfileResponse.Roles();
    }

    /**
     * Create an instance of {@link ProfileResponse.CustomFields }
     * 
     */
    public ProfileResponse.CustomFields createProfileResponseCustomFields() {
        return new ProfileResponse.CustomFields();
    }

    /**
     * Create an instance of {@link ProfileResponse.Hotel }
     * 
     */
    public ProfileResponse.Hotel createProfileResponseHotel() {
        return new ProfileResponse.Hotel();
    }

    /**
     * Create an instance of {@link ProfileResponse.Car }
     * 
     */
    public ProfileResponse.Car createProfileResponseCar() {
        return new ProfileResponse.Car();
    }

    /**
     * Create an instance of {@link ProfileResponse.Rail }
     * 
     */
    public ProfileResponse.Rail createProfileResponseRail() {
        return new ProfileResponse.Rail();
    }

    /**
     * Create an instance of {@link ProfileResponse.Air }
     * 
     */
    public ProfileResponse.Air createProfileResponseAir() {
        return new ProfileResponse.Air();
    }

    /**
     * Create an instance of {@link ProfileResponse.DiscountCodes }
     * 
     */
    public ProfileResponse.DiscountCodes createProfileResponseDiscountCodes() {
        return new ProfileResponse.DiscountCodes();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmailAddresses }
     * 
     */
    public ProfileResponse.EmailAddresses createProfileResponseEmailAddresses() {
        return new ProfileResponse.EmailAddresses();
    }

    /**
     * Create an instance of {@link ProfileResponse.Visas }
     * 
     */
    public ProfileResponse.Visas createProfileResponseVisas() {
        return new ProfileResponse.Visas();
    }

    /**
     * Create an instance of {@link ProfileResponse.Passports }
     * 
     */
    public ProfileResponse.Passports createProfileResponsePassports() {
        return new ProfileResponse.Passports();
    }

    /**
     * Create an instance of {@link ProfileResponse.DriversLicenses }
     * 
     */
    public ProfileResponse.DriversLicenses createProfileResponseDriversLicenses() {
        return new ProfileResponse.DriversLicenses();
    }

    /**
     * Create an instance of {@link ProfileResponse.NationalIDs }
     * 
     */
    public ProfileResponse.NationalIDs createProfileResponseNationalIDs() {
        return new ProfileResponse.NationalIDs();
    }

    /**
     * Create an instance of {@link ProfileResponse.Addresses }
     * 
     */
    public ProfileResponse.Addresses createProfileResponseAddresses() {
        return new ProfileResponse.Addresses();
    }

    /**
     * Create an instance of {@link ProfileResponse.Telephones }
     * 
     */
    public ProfileResponse.Telephones createProfileResponseTelephones() {
        return new ProfileResponse.Telephones();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmergencyContact }
     * 
     */
    public ProfileResponse.EmergencyContact createProfileResponseEmergencyContact() {
        return new ProfileResponse.EmergencyContact();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmergencyContact.Phones }
     * 
     */
    public ProfileResponse.EmergencyContact.Phones createProfileResponseEmergencyContactPhones() {
        return new ProfileResponse.EmergencyContact.Phones();
    }

    /**
     * Create an instance of {@link ProfileResponse.General }
     * 
     */
    public ProfileResponse.General createProfileResponseGeneral() {
        return new ProfileResponse.General();
    }

    /**
     * Create an instance of {@link ProfileResponse.RatePreferences }
     * 
     */
    public ProfileResponse.RatePreferences createProfileResponseRatePreferences() {
        return new ProfileResponse.RatePreferences();
    }

    /**
     * Create an instance of {@link ProfileResponse.TSAInfo }
     * 
     */
    public ProfileResponse.TSAInfo createProfileResponseTSAInfo() {
        return new ProfileResponse.TSAInfo();
    }

    /**
     * Create an instance of {@link Membership }
     * 
     */
    public Membership createMembership() {
        return new Membership();
    }

    /**
     * Create an instance of {@link AirMembership }
     * 
     */
    public AirMembership createAirMembership() {
        return new AirMembership();
    }

    /**
     * Create an instance of {@link RailMembership }
     * 
     */
    public RailMembership createRailMembership() {
        return new RailMembership();
    }

    /**
     * Create an instance of {@link ProfileResponse.AdvantageMemberships.AdvantageMembership }
     * 
     */
    public ProfileResponse.AdvantageMemberships.AdvantageMembership createProfileResponseAdvantageMembershipsAdvantageMembership() {
        return new ProfileResponse.AdvantageMemberships.AdvantageMembership();
    }

    /**
     * Create an instance of {@link ProfileResponse.SouthwestUnusedTickets.SouthwestUnusedTicket }
     * 
     */
    public ProfileResponse.SouthwestUnusedTickets.SouthwestUnusedTicket createProfileResponseSouthwestUnusedTicketsSouthwestUnusedTicket() {
        return new ProfileResponse.SouthwestUnusedTickets.SouthwestUnusedTicket();
    }

    /**
     * Create an instance of {@link ProfileResponse.UnusedTickets.UnusedTicket }
     * 
     */
    public ProfileResponse.UnusedTickets.UnusedTicket createProfileResponseUnusedTicketsUnusedTicket() {
        return new ProfileResponse.UnusedTickets.UnusedTicket();
    }

    /**
     * Create an instance of {@link ProfileResponse.Sponsors.Sponsor }
     * 
     */
    public ProfileResponse.Sponsors.Sponsor createProfileResponseSponsorsSponsor() {
        return new ProfileResponse.Sponsors.Sponsor();
    }

    /**
     * Create an instance of {@link ProfileResponse.Roles.Role }
     * 
     */
    public ProfileResponse.Roles.Role createProfileResponseRolesRole() {
        return new ProfileResponse.Roles.Role();
    }

    /**
     * Create an instance of {@link ProfileResponse.CustomFields.CustomField }
     * 
     */
    public ProfileResponse.CustomFields.CustomField createProfileResponseCustomFieldsCustomField() {
        return new ProfileResponse.CustomFields.CustomField();
    }

    /**
     * Create an instance of {@link ProfileResponse.Hotel.HotelMemberships }
     * 
     */
    public ProfileResponse.Hotel.HotelMemberships createProfileResponseHotelHotelMemberships() {
        return new ProfileResponse.Hotel.HotelMemberships();
    }

    /**
     * Create an instance of {@link ProfileResponse.Car.CarMemberships }
     * 
     */
    public ProfileResponse.Car.CarMemberships createProfileResponseCarCarMemberships() {
        return new ProfileResponse.Car.CarMemberships();
    }

    /**
     * Create an instance of {@link ProfileResponse.Rail.RailMemberships }
     * 
     */
    public ProfileResponse.Rail.RailMemberships createProfileResponseRailRailMemberships() {
        return new ProfileResponse.Rail.RailMemberships();
    }

    /**
     * Create an instance of {@link ProfileResponse.Air.AirMemberships }
     * 
     */
    public ProfileResponse.Air.AirMemberships createProfileResponseAirAirMemberships() {
        return new ProfileResponse.Air.AirMemberships();
    }

    /**
     * Create an instance of {@link ProfileResponse.Air.Seat }
     * 
     */
    public ProfileResponse.Air.Seat createProfileResponseAirSeat() {
        return new ProfileResponse.Air.Seat();
    }

    /**
     * Create an instance of {@link ProfileResponse.DiscountCodes.DiscountCode }
     * 
     */
    public ProfileResponse.DiscountCodes.DiscountCode createProfileResponseDiscountCodesDiscountCode() {
        return new ProfileResponse.DiscountCodes.DiscountCode();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmailAddresses.EmailAddress }
     * 
     */
    public ProfileResponse.EmailAddresses.EmailAddress createProfileResponseEmailAddressesEmailAddress() {
        return new ProfileResponse.EmailAddresses.EmailAddress();
    }

    /**
     * Create an instance of {@link ProfileResponse.Visas.Visa }
     * 
     */
    public ProfileResponse.Visas.Visa createProfileResponseVisasVisa() {
        return new ProfileResponse.Visas.Visa();
    }

    /**
     * Create an instance of {@link ProfileResponse.Passports.Passport }
     * 
     */
    public ProfileResponse.Passports.Passport createProfileResponsePassportsPassport() {
        return new ProfileResponse.Passports.Passport();
    }

    /**
     * Create an instance of {@link ProfileResponse.DriversLicenses.DriversLicense }
     * 
     */
    public ProfileResponse.DriversLicenses.DriversLicense createProfileResponseDriversLicensesDriversLicense() {
        return new ProfileResponse.DriversLicenses.DriversLicense();
    }

    /**
     * Create an instance of {@link ProfileResponse.NationalIDs.NationalID }
     * 
     */
    public ProfileResponse.NationalIDs.NationalID createProfileResponseNationalIDsNationalID() {
        return new ProfileResponse.NationalIDs.NationalID();
    }

    /**
     * Create an instance of {@link ProfileResponse.Addresses.Address }
     * 
     */
    public ProfileResponse.Addresses.Address createProfileResponseAddressesAddress() {
        return new ProfileResponse.Addresses.Address();
    }

    /**
     * Create an instance of {@link ProfileResponse.Telephones.Telephone }
     * 
     */
    public ProfileResponse.Telephones.Telephone createProfileResponseTelephonesTelephone() {
        return new ProfileResponse.Telephones.Telephone();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmergencyContact.Address }
     * 
     */
    public ProfileResponse.EmergencyContact.Address createProfileResponseEmergencyContactAddress() {
        return new ProfileResponse.EmergencyContact.Address();
    }

    /**
     * Create an instance of {@link ProfileResponse.EmergencyContact.Phones.Phone }
     * 
     */
    public ProfileResponse.EmergencyContact.Phones.Phone createProfileResponseEmergencyContactPhonesPhone() {
        return new ProfileResponse.EmergencyContact.Phones.Phone();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Gender", scope = ProfileResponse.TSAInfo.class)
    public JAXBElement<String> createProfileResponseTSAInfoGender(String value) {
        return new JAXBElement<String>(_ProfileResponseTSAInfoGender_QNAME, String.class, ProfileResponse.TSAInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "DateOfBirth", scope = ProfileResponse.TSAInfo.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseTSAInfoDateOfBirth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseTSAInfoDateOfBirth_QNAME, XMLGregorianCalendar.class, ProfileResponse.TSAInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "NoMiddleName", scope = ProfileResponse.TSAInfo.class)
    public JAXBElement<Boolean> createProfileResponseTSAInfoNoMiddleName(Boolean value) {
        return new JAXBElement<Boolean>(_ProfileResponseTSAInfoNoMiddleName_QNAME, Boolean.class, ProfileResponse.TSAInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "MealCode", scope = ProfileResponse.Air.class)
    public JAXBElement<String> createProfileResponseAirMealCode(String value) {
        return new JAXBElement<String>(_ProfileResponseAirMealCode_QNAME, String.class, ProfileResponse.Air.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "VisaDateIssued", scope = ProfileResponse.Visas.Visa.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseVisasVisaVisaDateIssued(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseVisasVisaVisaDateIssued_QNAME, XMLGregorianCalendar.class, ProfileResponse.Visas.Visa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "VisaExpiration", scope = ProfileResponse.Visas.Visa.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseVisasVisaVisaExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseVisasVisaVisaExpiration_QNAME, XMLGregorianCalendar.class, ProfileResponse.Visas.Visa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PassportExpiration", scope = ProfileResponse.Passports.Passport.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponsePassportsPassportPassportExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponsePassportsPassportPassportExpiration_QNAME, XMLGregorianCalendar.class, ProfileResponse.Passports.Passport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "PassportDateIssued", scope = ProfileResponse.Passports.Passport.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponsePassportsPassportPassportDateIssued(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponsePassportsPassportPassportDateIssued_QNAME, XMLGregorianCalendar.class, ProfileResponse.Passports.Passport.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Expiration", scope = ProfileResponse.DriversLicenses.DriversLicense.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseDriversLicensesDriversLicenseExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseDriversLicensesDriversLicenseExpiration_QNAME, XMLGregorianCalendar.class, ProfileResponse.DriversLicenses.DriversLicense.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Expiration", scope = ProfileResponse.NationalIDs.NationalID.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseNationalIDsNationalIDExpiration(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseDriversLicensesDriversLicenseExpiration_QNAME, XMLGregorianCalendar.class, ProfileResponse.NationalIDs.NationalID.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "Relationship", scope = ProfileResponse.EmergencyContact.class)
    public JAXBElement<String> createProfileResponseEmergencyContactRelationship(String value) {
        return new JAXBElement<String>(_ProfileResponseEmergencyContactRelationship_QNAME, String.class, ProfileResponse.EmergencyContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "AccountTerminationDate", scope = ProfileResponse.General.class)
    public JAXBElement<XMLGregorianCalendar> createProfileResponseGeneralAccountTerminationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProfileResponseGeneralAccountTerminationDate_QNAME, XMLGregorianCalendar.class, ProfileResponse.General.class, value);
    }

}
