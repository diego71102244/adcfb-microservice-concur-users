//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.05.19 a las 12:34:38 PM CDT 
//


package am.concur.users.users.xsd;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="General" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CompanyEmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AccountTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="EReceiptOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="HasOpenBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RuleClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="TravelConfigID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="MedicalAlerts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AgencyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="GDSProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="SabreProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmergencyContact" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="Relationship" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Spouse"/&gt;
 *                         &lt;enumeration value="Brother"/&gt;
 *                         &lt;enumeration value="Parent"/&gt;
 *                         &lt;enumeration value="Sister"/&gt;
 *                         &lt;enumeration value="LifePartner"/&gt;
 *                         &lt;enumeration value="Other"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Phones" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Phone" maxOccurs="2" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                     &lt;attribute name="Type" use="required"&gt;
 *                                       &lt;simpleType&gt;
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                           &lt;enumeration value="DayTime"/&gt;
 *                                           &lt;enumeration value="Alternate"/&gt;
 *                                         &lt;/restriction&gt;
 *                                       &lt;/simpleType&gt;
 *                                     &lt;/attribute&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Address" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Telephones" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Home"/&gt;
 *                                 &lt;enumeration value="Work"/&gt;
 *                                 &lt;enumeration value="Fax"/&gt;
 *                                 &lt;enumeration value="Pager"/&gt;
 *                                 &lt;enumeration value="Other"/&gt;
 *                                 &lt;enumeration value="Cell"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="ContactOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="PrimaryMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Addresses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Address" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Home"/&gt;
 *                                 &lt;enumeration value="Work"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NationalIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NationalID" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NationalIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DriversLicenses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DriversLicense" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DriversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="IssuingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="HasNoPassport" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Passports" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Passport" maxOccurs="2" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PassportNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PassportExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="PassportDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="PassportCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="PassportCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Visas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Visa" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VisaNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VisaType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Unknown"/&gt;
 *                                   &lt;enumeration value="SE"/&gt;
 *                                   &lt;enumeration value="DE"/&gt;
 *                                   &lt;enumeration value="ME"/&gt;
 *                                   &lt;enumeration value="ES"/&gt;
 *                                   &lt;enumeration value="ET"/&gt;
 *                                   &lt;enumeration value="SH"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="VisaDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="VisaExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="VisaCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="VisaCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmailAddresses" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="EmailAddress" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Business"/&gt;
 *                                 &lt;enumeration value="Personal"/&gt;
 *                                 &lt;enumeration value="Business2"/&gt;
 *                                 &lt;enumeration value="Other1"/&gt;
 *                                 &lt;enumeration value="Other2"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RatePreferences" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AAARate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="AARPRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="GovtRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="MilitaryRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="DiscountCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="DiscountCode" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Air" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AirMemberships" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AirMembership" type="{}AirMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Seat" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InterRowPositionCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Aisle"/&gt;
 *                                   &lt;enumeration value="Window"/&gt;
 *                                   &lt;enumeration value="Middle"/&gt;
 *                                   &lt;enumeration value="DontCare"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SectionPositionCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Bulkhead"/&gt;
 *                                   &lt;enumeration value="Forward"/&gt;
 *                                   &lt;enumeration value="Rear"/&gt;
 *                                   &lt;enumeration value="ExitRow"/&gt;
 *                                   &lt;enumeration value="DontCare"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MealCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="BLML"/&gt;
 *                         &lt;enumeration value="CHML"/&gt;
 *                         &lt;enumeration value="DBML"/&gt;
 *                         &lt;enumeration value="FPML"/&gt;
 *                         &lt;enumeration value="GFML"/&gt;
 *                         &lt;enumeration value="HNML"/&gt;
 *                         &lt;enumeration value="BBML"/&gt;
 *                         &lt;enumeration value="KSML"/&gt;
 *                         &lt;enumeration value="LCML"/&gt;
 *                         &lt;enumeration value="LSML"/&gt;
 *                         &lt;enumeration value="MOML"/&gt;
 *                         &lt;enumeration value="NSML"/&gt;
 *                         &lt;enumeration value="NLML"/&gt;
 *                         &lt;enumeration value="PFML"/&gt;
 *                         &lt;enumeration value="SFML"/&gt;
 *                         &lt;enumeration value="VLML"/&gt;
 *                         &lt;enumeration value="VGML"/&gt;
 *                         &lt;enumeration value="KVML"/&gt;
 *                         &lt;enumeration value="RVML"/&gt;
 *                         &lt;enumeration value="AVML"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HomeAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="AirOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Seat" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Aisle"/&gt;
 *                         &lt;enumeration value="Window"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Coach" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Compartment"/&gt;
 *                         &lt;enumeration value="Coach"/&gt;
 *                         &lt;enumeration value="CoachWithTable"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NoiseComfort" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="QuietSpace"/&gt;
 *                         &lt;enumeration value="MobileSpace"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Bed" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Lower"/&gt;
 *                         &lt;enumeration value="Upper"/&gt;
 *                         &lt;enumeration value="Middle"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BedCategory" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="WomenOnly"/&gt;
 *                         &lt;enumeration value="MenOnly"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Berth" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Lower"/&gt;
 *                         &lt;enumeration value="Upper"/&gt;
 *                         &lt;enumeration value="Middle"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Deck" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Lower"/&gt;
 *                         &lt;enumeration value="Upper"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SpaceType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Panorama"/&gt;
 *                         &lt;enumeration value="SeatWithTable"/&gt;
 *                         &lt;enumeration value="Solo"/&gt;
 *                         &lt;enumeration value="Salon"/&gt;
 *                         &lt;enumeration value="Kiosk"/&gt;
 *                         &lt;enumeration value="InclineSeat"/&gt;
 *                         &lt;enumeration value="DuoSideBySide"/&gt;
 *                         &lt;enumeration value="DuoFaceToFace"/&gt;
 *                         &lt;enumeration value="Club6"/&gt;
 *                         &lt;enumeration value="Club4"/&gt;
 *                         &lt;enumeration value="Carre"/&gt;
 *                         &lt;enumeration value="DisabledCompanionSpace"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FareSpaceComfort" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DedicatedBusiness"/&gt;
 *                         &lt;enumeration value="Business"/&gt;
 *                         &lt;enumeration value="IntermediateLeisure"/&gt;
 *                         &lt;enumeration value="Leisure"/&gt;
 *                         &lt;enumeration value="StandardLeisure"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SpecialMeals" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="LowFat"/&gt;
 *                         &lt;enumeration value="LowSalt"/&gt;
 *                         &lt;enumeration value="GlutenFree"/&gt;
 *                         &lt;enumeration value="Diabetic"/&gt;
 *                         &lt;enumeration value="Muslim"/&gt;
 *                         &lt;enumeration value="Kosher"/&gt;
 *                         &lt;enumeration value="Vegetarian"/&gt;
 *                         &lt;enumeration value="VegetarianLactoOvo"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Contingencies" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Bike"/&gt;
 *                         &lt;enumeration value="WomenOnly"/&gt;
 *                         &lt;enumeration value="WheelchairSpace"/&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RailMemberships" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RailMembership" type="{}RailMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Car" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CarSmokingCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                         &lt;enumeration value="NonSmoking"/&gt;
 *                         &lt;enumeration value="Smoking"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CarGPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CarType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                         &lt;enumeration value="Economy"/&gt;
 *                         &lt;enumeration value="Compact"/&gt;
 *                         &lt;enumeration value="Intermediate"/&gt;
 *                         &lt;enumeration value="Standard"/&gt;
 *                         &lt;enumeration value="FullSize"/&gt;
 *                         &lt;enumeration value="Luxury"/&gt;
 *                         &lt;enumeration value="Premium"/&gt;
 *                         &lt;enumeration value="Mini"/&gt;
 *                         &lt;enumeration value="EconomyHybrid"/&gt;
 *                         &lt;enumeration value="CompactHybrid"/&gt;
 *                         &lt;enumeration value="IntermediateHybrid"/&gt;
 *                         &lt;enumeration value="StandardHybrid"/&gt;
 *                         &lt;enumeration value="FullSizeHybrid"/&gt;
 *                         &lt;enumeration value="MiniVan"/&gt;
 *                         &lt;enumeration value="StandardSUV"/&gt;
 *                         &lt;enumeration value="FullSizeSUV"/&gt;
 *                         &lt;enumeration value="FullSizePickup"/&gt;
 *                         &lt;enumeration value="Specialized"/&gt;
 *                         &lt;enumeration value="IntermediateSUV"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CarMemberships" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="CarMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="CarOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="CarSkiRack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="CarTransmission" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                         &lt;enumeration value="Automatic"/&gt;
 *                         &lt;enumeration value="Manual"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hotel" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HotelSmokingCode" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                         &lt;enumeration value="NonSmoking"/&gt;
 *                         &lt;enumeration value="Smoking"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HotelMemberships" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="HotelMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RoomType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="DontCare"/&gt;
 *                         &lt;enumeration value="King"/&gt;
 *                         &lt;enumeration value="Queen"/&gt;
 *                         &lt;enumeration value="Double"/&gt;
 *                         &lt;enumeration value="Twin"/&gt;
 *                         &lt;enumeration value="Single"/&gt;
 *                         &lt;enumeration value="Disability"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="HotelOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PreferFoamPillows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferCrib" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferRollawayBed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferGym" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferRestaurant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferWheelchairAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferAccessForBlind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferRoomService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreferEarlyCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CustomFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CustomField" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Roles" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Role" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Type" use="required"&gt;
 *                             &lt;simpleType&gt;
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                 &lt;enumeration value="Arranger"/&gt;
 *                                 &lt;enumeration value="Manager"/&gt;
 *                               &lt;/restriction&gt;
 *                             &lt;/simpleType&gt;
 *                           &lt;/attribute&gt;
 *                           &lt;attribute name="PrimaryIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sponsors" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Sponsor" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="NonEmployeeUserType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Contractor"/&gt;
 *                                   &lt;enumeration value="Student/Intern"/&gt;
 *                                   &lt;enumeration value="Candidate for Hire"/&gt;
 *                                   &lt;enumeration value="Invitational Traveler"/&gt;
 *                                   &lt;enumeration value="Dependent/Spouse"/&gt;
 *                                   &lt;enumeration value="Board Member"/&gt;
 *                                   &lt;enumeration value="Other"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="SponsorshipStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="SponsorshipEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                             &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TSAInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Gender" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="Male"/&gt;
 *                         &lt;enumeration value="Female"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="NoMiddleName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="PreCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnusedTickets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="UnusedTicket" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SouthwestUnusedTickets" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SouthwestUnusedTicket" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="TicketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdvantageMemberships" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AdvantageMembership" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="VendorType"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;enumeration value="Air"/&gt;
 *                                   &lt;enumeration value="Rail"/&gt;
 *                                   &lt;enumeration value="Car"/&gt;
 *                                   &lt;enumeration value="Hotel"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ProgramNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                             &lt;element name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Status"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Active"/&gt;
 *             &lt;enumeration value="Inactive"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="Unique" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="LoginId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Action"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="Create"/&gt;
 *             &lt;enumeration value="Update"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "general",
    "emergencyContact",
    "telephones",
    "addresses",
    "nationalIDs",
    "driversLicenses",
    "hasNoPassport",
    "passports",
    "visas",
    "emailAddresses",
    "ratePreferences",
    "discountCodes",
    "air",
    "rail",
    "car",
    "hotel",
    "customFields",
    "roles",
    "sponsors",
    "tsaInfo",
    "unusedTickets",
    "southwestUnusedTickets",
    "advantageMemberships",
    "password"
})
@XmlRootElement(name = "ProfileResponse")
public class ProfileResponse {

    @XmlElement(name = "General")
    protected ProfileResponse.General general;
    @XmlElement(name = "EmergencyContact")
    protected ProfileResponse.EmergencyContact emergencyContact;
    @XmlElement(name = "Telephones")
    protected ProfileResponse.Telephones telephones;
    @XmlElement(name = "Addresses")
    protected ProfileResponse.Addresses addresses;
    @XmlElement(name = "NationalIDs")
    protected ProfileResponse.NationalIDs nationalIDs;
    @XmlElement(name = "DriversLicenses")
    protected ProfileResponse.DriversLicenses driversLicenses;
    @XmlElement(name = "HasNoPassport")
    protected Boolean hasNoPassport;
    @XmlElement(name = "Passports")
    protected ProfileResponse.Passports passports;
    @XmlElement(name = "Visas")
    protected ProfileResponse.Visas visas;
    @XmlElement(name = "EmailAddresses")
    protected ProfileResponse.EmailAddresses emailAddresses;
    @XmlElement(name = "RatePreferences")
    protected ProfileResponse.RatePreferences ratePreferences;
    @XmlElement(name = "DiscountCodes")
    protected ProfileResponse.DiscountCodes discountCodes;
    @XmlElement(name = "Air")
    protected ProfileResponse.Air air;
    @XmlElement(name = "Rail")
    protected ProfileResponse.Rail rail;
    @XmlElement(name = "Car")
    protected ProfileResponse.Car car;
    @XmlElement(name = "Hotel")
    protected ProfileResponse.Hotel hotel;
    @XmlElement(name = "CustomFields")
    protected ProfileResponse.CustomFields customFields;
    @XmlElement(name = "Roles")
    protected ProfileResponse.Roles roles;
    @XmlElement(name = "Sponsors")
    protected ProfileResponse.Sponsors sponsors;
    @XmlElement(name = "TSAInfo")
    protected ProfileResponse.TSAInfo tsaInfo;
    @XmlElement(name = "UnusedTickets")
    protected ProfileResponse.UnusedTickets unusedTickets;
    @XmlElement(name = "SouthwestUnusedTickets")
    protected ProfileResponse.SouthwestUnusedTickets southwestUnusedTickets;
    @XmlElement(name = "AdvantageMemberships")
    protected ProfileResponse.AdvantageMemberships advantageMemberships;
    @XmlElement(name = "Password")
    protected String password;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Unique")
    protected String unique;
    @XmlAttribute(name = "LoginId", required = true)
    protected String loginId;
    @XmlAttribute(name = "Action")
    protected String action;

    /**
     * Obtiene el valor de la propiedad general.
     * 
     * @return
     *     possible object is
     *     {@link General }
     *
     */
    public General getGeneral() {
        return general;
    }

    /**
     * Define el valor de la propiedad general.
     *
     * @param value
     *     allowed object is
     *     {@link General }
     *
     */
    public void setGeneral(General value) {
        this.general = value;
    }

    /**
     * Obtiene el valor de la propiedad emergencyContact.
     *
     * @return
     *     possible object is
     *     {@link EmergencyContact }
     *
     */
    public EmergencyContact getEmergencyContact() {
        return emergencyContact;
    }

    /**
     * Define el valor de la propiedad emergencyContact.
     *
     * @param value
     *     allowed object is
     *     {@link EmergencyContact }
     *
     */
    public void setEmergencyContact(EmergencyContact value) {
        this.emergencyContact = value;
    }

    /**
     * Obtiene el valor de la propiedad telephones.
     *
     * @return
     *     possible object is
     *     {@link Telephones }
     *
     */
    public Telephones getTelephones() {
        return telephones;
    }

    /**
     * Define el valor de la propiedad telephones.
     *
     * @param value
     *     allowed object is
     *     {@link Telephones }
     *
     */
    public void setTelephones(Telephones value) {
        this.telephones = value;
    }

    /**
     * Obtiene el valor de la propiedad addresses.
     *
     * @return
     *     possible object is
     *     {@link Addresses }
     *
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Define el valor de la propiedad addresses.
     *
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalIDs.
     *
     * @return
     *     possible object is
     *     {@link NationalIDs }
     *
     */
    public NationalIDs getNationalIDs() {
        return nationalIDs;
    }

    /**
     * Define el valor de la propiedad nationalIDs.
     *
     * @param value
     *     allowed object is
     *     {@link NationalIDs }
     *
     */
    public void setNationalIDs(NationalIDs value) {
        this.nationalIDs = value;
    }

    /**
     * Obtiene el valor de la propiedad driversLicenses.
     *
     * @return
     *     possible object is
     *     {@link DriversLicenses }
     *
     */
    public DriversLicenses getDriversLicenses() {
        return driversLicenses;
    }

    /**
     * Define el valor de la propiedad driversLicenses.
     *
     * @param value
     *     allowed object is
     *     {@link DriversLicenses }
     *
     */
    public void setDriversLicenses(DriversLicenses value) {
        this.driversLicenses = value;
    }

    /**
     * Obtiene el valor de la propiedad hasNoPassport.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHasNoPassport() {
        return hasNoPassport;
    }

    /**
     * Define el valor de la propiedad hasNoPassport.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHasNoPassport(Boolean value) {
        this.hasNoPassport = value;
    }

    /**
     * Obtiene el valor de la propiedad passports.
     *
     * @return
     *     possible object is
     *     {@link Passports }
     *
     */
    public Passports getPassports() {
        return passports;
    }

    /**
     * Define el valor de la propiedad passports.
     *
     * @param value
     *     allowed object is
     *     {@link Passports }
     *
     */
    public void setPassports(Passports value) {
        this.passports = value;
    }

    /**
     * Obtiene el valor de la propiedad visas.
     *
     * @return
     *     possible object is
     *     {@link Visas }
     *
     */
    public Visas getVisas() {
        return visas;
    }

    /**
     * Define el valor de la propiedad visas.
     *
     * @param value
     *     allowed object is
     *     {@link Visas }
     *
     */
    public void setVisas(Visas value) {
        this.visas = value;
    }

    /**
     * Obtiene el valor de la propiedad emailAddresses.
     *
     * @return
     *     possible object is
     *     {@link EmailAddresses }
     *
     */
    public EmailAddresses getEmailAddresses() {
        return emailAddresses;
    }

    /**
     * Define el valor de la propiedad emailAddresses.
     *
     * @param value
     *     allowed object is
     *     {@link EmailAddresses }
     *
     */
    public void setEmailAddresses(EmailAddresses value) {
        this.emailAddresses = value;
    }

    /**
     * Obtiene el valor de la propiedad ratePreferences.
     *
     * @return
     *     possible object is
     *     {@link RatePreferences }
     *
     */
    public RatePreferences getRatePreferences() {
        return ratePreferences;
    }

    /**
     * Define el valor de la propiedad ratePreferences.
     *
     * @param value
     *     allowed object is
     *     {@link RatePreferences }
     *
     */
    public void setRatePreferences(RatePreferences value) {
        this.ratePreferences = value;
    }

    /**
     * Obtiene el valor de la propiedad discountCodes.
     *
     * @return
     *     possible object is
     *     {@link DiscountCodes }
     *
     */
    public DiscountCodes getDiscountCodes() {
        return discountCodes;
    }

    /**
     * Define el valor de la propiedad discountCodes.
     *
     * @param value
     *     allowed object is
     *     {@link DiscountCodes }
     *
     */
    public void setDiscountCodes(DiscountCodes value) {
        this.discountCodes = value;
    }

    /**
     * Obtiene el valor de la propiedad air.
     *
     * @return
     *     possible object is
     *     {@link Air }
     *
     */
    public Air getAir() {
        return air;
    }

    /**
     * Define el valor de la propiedad air.
     *
     * @param value
     *     allowed object is
     *     {@link Air }
     *
     */
    public void setAir(Air value) {
        this.air = value;
    }

    /**
     * Obtiene el valor de la propiedad rail.
     *
     * @return
     *     possible object is
     *     {@link Rail }
     *
     */
    public Rail getRail() {
        return rail;
    }

    /**
     * Define el valor de la propiedad rail.
     *
     * @param value
     *     allowed object is
     *     {@link Rail }
     *
     */
    public void setRail(Rail value) {
        this.rail = value;
    }

    /**
     * Obtiene el valor de la propiedad car.
     *
     * @return
     *     possible object is
     *     {@link Car }
     *
     */
    public Car getCar() {
        return car;
    }

    /**
     * Define el valor de la propiedad car.
     *
     * @param value
     *     allowed object is
     *     {@link Car }
     *
     */
    public void setCar(Car value) {
        this.car = value;
    }

    /**
     * Obtiene el valor de la propiedad hotel.
     *
     * @return
     *     possible object is
     *     {@link Hotel }
     *
     */
    public Hotel getHotel() {
        return hotel;
    }

    /**
     * Define el valor de la propiedad hotel.
     *
     * @param value
     *     allowed object is
     *     {@link Hotel }
     *
     */
    public void setHotel(Hotel value) {
        this.hotel = value;
    }

    /**
     * Obtiene el valor de la propiedad customFields.
     *
     * @return
     *     possible object is
     *     {@link CustomFields }
     *
     */
    public CustomFields getCustomFields() {
        return customFields;
    }

    /**
     * Define el valor de la propiedad customFields.
     *
     * @param value
     *     allowed object is
     *     {@link CustomFields }
     *
     */
    public void setCustomFields(CustomFields value) {
        this.customFields = value;
    }

    /**
     * Obtiene el valor de la propiedad roles.
     *
     * @return
     *     possible object is
     *     {@link Roles }
     *
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Define el valor de la propiedad roles.
     *
     * @param value
     *     allowed object is
     *     {@link Roles }
     *
     */
    public void setRoles(Roles value) {
        this.roles = value;
    }

    /**
     * Obtiene el valor de la propiedad sponsors.
     *
     * @return
     *     possible object is
     *     {@link Sponsors }
     *
     */
    public Sponsors getSponsors() {
        return sponsors;
    }

    /**
     * Define el valor de la propiedad sponsors.
     *
     * @param value
     *     allowed object is
     *     {@link Sponsors }
     *
     */
    public void setSponsors(Sponsors value) {
        this.sponsors = value;
    }

    /**
     * Obtiene el valor de la propiedad tsaInfo.
     *
     * @return
     *     possible object is
     *     {@link TSAInfo }
     *
     */
    public TSAInfo getTSAInfo() {
        return tsaInfo;
    }

    /**
     * Define el valor de la propiedad tsaInfo.
     *
     * @param value
     *     allowed object is
     *     {@link TSAInfo }
     *
     */
    public void setTSAInfo(TSAInfo value) {
        this.tsaInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad unusedTickets.
     *
     * @return
     *     possible object is
     *     {@link UnusedTickets }
     *
     */
    public UnusedTickets getUnusedTickets() {
        return unusedTickets;
    }

    /**
     * Define el valor de la propiedad unusedTickets.
     *
     * @param value
     *     allowed object is
     *     {@link UnusedTickets }
     *
     */
    public void setUnusedTickets(UnusedTickets value) {
        this.unusedTickets = value;
    }

    /**
     * Obtiene el valor de la propiedad southwestUnusedTickets.
     *
     * @return
     *     possible object is
     *     {@link SouthwestUnusedTickets }
     *
     */
    public SouthwestUnusedTickets getSouthwestUnusedTickets() {
        return southwestUnusedTickets;
    }

    /**
     * Define el valor de la propiedad southwestUnusedTickets.
     *
     * @param value
     *     allowed object is
     *     {@link SouthwestUnusedTickets }
     *
     */
    public void setSouthwestUnusedTickets(SouthwestUnusedTickets value) {
        this.southwestUnusedTickets = value;
    }

    /**
     * Obtiene el valor de la propiedad advantageMemberships.
     *
     * @return
     *     possible object is
     *     {@link AdvantageMemberships }
     *
     */
    public AdvantageMemberships getAdvantageMemberships() {
        return advantageMemberships;
    }

    /**
     * Define el valor de la propiedad advantageMemberships.
     *
     * @param value
     *     allowed object is
     *     {@link AdvantageMemberships }
     *
     */
    public void setAdvantageMemberships(AdvantageMemberships value) {
        this.advantageMemberships = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
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
     * Obtiene el valor de la propiedad unique.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUnique() {
        return unique;
    }

    /**
     * Define el valor de la propiedad unique.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUnique(String value) {
        this.unique = value;
    }

    /**
     * Obtiene el valor de la propiedad loginId.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Define el valor de la propiedad loginId.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Obtiene el valor de la propiedad action.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAction() {
        return action;
    }

    /**
     * Define el valor de la propiedad action.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAction(String value) {
        this.action = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Address" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Home"/&gt;
     *                       &lt;enumeration value="Work"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address")
        protected List<Address> address;

        /**
         * Gets the value of the address property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         *
         *
         */
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Home"/&gt;
         *             &lt;enumeration value="Work"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "street",
            "city",
            "stateProvince",
            "postalCode",
            "countryCode"
        })
        public static class Address {

            @XmlElement(name = "Street", required = true)
            protected String street;
            @XmlElement(name = "City", required = true)
            protected String city;
            @XmlElement(name = "StateProvince")
            protected String stateProvince;
            @XmlElement(name = "PostalCode", required = true)
            protected String postalCode;
            @XmlElement(name = "CountryCode", required = true)
            protected String countryCode;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad street.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStreet() {
                return street;
            }

            /**
             * Define el valor de la propiedad street.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStreet(String value) {
                this.street = value;
            }

            /**
             * Obtiene el valor de la propiedad city.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCity() {
                return city;
            }

            /**
             * Define el valor de la propiedad city.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Obtiene el valor de la propiedad stateProvince.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStateProvince() {
                return stateProvince;
            }

            /**
             * Define el valor de la propiedad stateProvince.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStateProvince(String value) {
                this.stateProvince = value;
            }

            /**
             * Obtiene el valor de la propiedad postalCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Define el valor de la propiedad postalCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Obtiene el valor de la propiedad countryCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Define el valor de la propiedad countryCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AdvantageMembership" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VendorType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Air"/&gt;
     *                         &lt;enumeration value="Rail"/&gt;
     *                         &lt;enumeration value="Car"/&gt;
     *                         &lt;enumeration value="Hotel"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ProgramNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "advantageMembership"
    })
    public static class AdvantageMemberships {

        @XmlElement(name = "AdvantageMembership")
        protected List<AdvantageMembership> advantageMembership;

        /**
         * Gets the value of the advantageMembership property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the advantageMembership property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAdvantageMembership().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AdvantageMembership }
         *
         *
         */
        public List<AdvantageMembership> getAdvantageMembership() {
            if (advantageMembership == null) {
                advantageMembership = new ArrayList<AdvantageMembership>();
            }
            return this.advantageMembership;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VendorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VendorType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Air"/&gt;
         *               &lt;enumeration value="Rail"/&gt;
         *               &lt;enumeration value="Car"/&gt;
         *               &lt;enumeration value="Hotel"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ProgramNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="DiscountPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="OriginCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="DestinationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ProgramCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="OptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "vendorCode",
            "vendorType",
            "programNumber",
            "discountPercentage",
            "originCode",
            "destinationCode",
            "programCode",
            "expirationDate",
            "optionCode",
            "programName"
        })
        public static class AdvantageMembership {

            @XmlElement(name = "VendorCode", required = true)
            protected String vendorCode;
            @XmlElement(name = "VendorType", required = true)
            protected String vendorType;
            @XmlElement(name = "ProgramNumber", required = true)
            protected String programNumber;
            @XmlElement(name = "DiscountPercentage")
            protected String discountPercentage;
            @XmlElement(name = "OriginCode")
            protected String originCode;
            @XmlElement(name = "DestinationCode")
            protected String destinationCode;
            @XmlElement(name = "ProgramCode", required = true)
            protected String programCode;
            @XmlElement(name = "ExpirationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expirationDate;
            @XmlElement(name = "OptionCode")
            protected String optionCode;
            @XmlElement(name = "ProgramName")
            protected String programName;

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
             * Obtiene el valor de la propiedad vendorType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVendorType() {
                return vendorType;
            }

            /**
             * Define el valor de la propiedad vendorType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVendorType(String value) {
                this.vendorType = value;
            }

            /**
             * Obtiene el valor de la propiedad programNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProgramNumber() {
                return programNumber;
            }

            /**
             * Define el valor de la propiedad programNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProgramNumber(String value) {
                this.programNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad discountPercentage.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDiscountPercentage() {
                return discountPercentage;
            }

            /**
             * Define el valor de la propiedad discountPercentage.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDiscountPercentage(String value) {
                this.discountPercentage = value;
            }

            /**
             * Obtiene el valor de la propiedad originCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOriginCode() {
                return originCode;
            }

            /**
             * Define el valor de la propiedad originCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOriginCode(String value) {
                this.originCode = value;
            }

            /**
             * Obtiene el valor de la propiedad destinationCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDestinationCode() {
                return destinationCode;
            }

            /**
             * Define el valor de la propiedad destinationCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDestinationCode(String value) {
                this.destinationCode = value;
            }

            /**
             * Obtiene el valor de la propiedad programCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProgramCode() {
                return programCode;
            }

            /**
             * Define el valor de la propiedad programCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProgramCode(String value) {
                this.programCode = value;
            }

            /**
             * Obtiene el valor de la propiedad expirationDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getExpirationDate() {
                return expirationDate;
            }

            /**
             * Define el valor de la propiedad expirationDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setExpirationDate(XMLGregorianCalendar value) {
                this.expirationDate = value;
            }

            /**
             * Obtiene el valor de la propiedad optionCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getOptionCode() {
                return optionCode;
            }

            /**
             * Define el valor de la propiedad optionCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setOptionCode(String value) {
                this.optionCode = value;
            }

            /**
             * Obtiene el valor de la propiedad programName.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getProgramName() {
                return programName;
            }

            /**
             * Define el valor de la propiedad programName.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setProgramName(String value) {
                this.programName = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AirMemberships" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AirMembership" type="{}AirMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Seat" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InterRowPositionCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Aisle"/&gt;
     *                         &lt;enumeration value="Window"/&gt;
     *                         &lt;enumeration value="Middle"/&gt;
     *                         &lt;enumeration value="DontCare"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SectionPositionCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Bulkhead"/&gt;
     *                         &lt;enumeration value="Forward"/&gt;
     *                         &lt;enumeration value="Rear"/&gt;
     *                         &lt;enumeration value="ExitRow"/&gt;
     *                         &lt;enumeration value="DontCare"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MealCode" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="BLML"/&gt;
     *               &lt;enumeration value="CHML"/&gt;
     *               &lt;enumeration value="DBML"/&gt;
     *               &lt;enumeration value="FPML"/&gt;
     *               &lt;enumeration value="GFML"/&gt;
     *               &lt;enumeration value="HNML"/&gt;
     *               &lt;enumeration value="BBML"/&gt;
     *               &lt;enumeration value="KSML"/&gt;
     *               &lt;enumeration value="LCML"/&gt;
     *               &lt;enumeration value="LSML"/&gt;
     *               &lt;enumeration value="MOML"/&gt;
     *               &lt;enumeration value="NSML"/&gt;
     *               &lt;enumeration value="NLML"/&gt;
     *               &lt;enumeration value="PFML"/&gt;
     *               &lt;enumeration value="SFML"/&gt;
     *               &lt;enumeration value="VLML"/&gt;
     *               &lt;enumeration value="VGML"/&gt;
     *               &lt;enumeration value="KVML"/&gt;
     *               &lt;enumeration value="RVML"/&gt;
     *               &lt;enumeration value="AVML"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HomeAirport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AirOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airMemberships",
        "seat",
        "mealCode",
        "homeAirport",
        "airOther"
    })
    public static class Air {

        @XmlElement(name = "AirMemberships")
        protected ProfileResponse.Air.AirMemberships airMemberships;
        @XmlElement(name = "Seat")
        protected ProfileResponse.Air.Seat seat;
        @XmlElementRef(name = "MealCode", type = JAXBElement.class, required = false)
        protected JAXBElement<String> mealCode;
        @XmlElement(name = "HomeAirport")
        protected String homeAirport;
        @XmlElement(name = "AirOther")
        protected String airOther;

        /**
         * Obtiene el valor de la propiedad airMemberships.
         *
         * @return
         *     possible object is
         *     {@link AirMemberships }
         *
         */
        public AirMemberships getAirMemberships() {
            return airMemberships;
        }

        /**
         * Define el valor de la propiedad airMemberships.
         *
         * @param value
         *     allowed object is
         *     {@link AirMemberships }
         *
         */
        public void setAirMemberships(AirMemberships value) {
            this.airMemberships = value;
        }

        /**
         * Obtiene el valor de la propiedad seat.
         *
         * @return
         *     possible object is
         *     {@link Seat }
         *
         */
        public Seat getSeat() {
            return seat;
        }

        /**
         * Define el valor de la propiedad seat.
         *
         * @param value
         *     allowed object is
         *     {@link Seat }
         *
         */
        public void setSeat(Seat value) {
            this.seat = value;
        }

        /**
         * Obtiene el valor de la propiedad mealCode.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getMealCode() {
            return mealCode;
        }

        /**
         * Define el valor de la propiedad mealCode.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setMealCode(JAXBElement<String> value) {
            this.mealCode = value;
        }

        /**
         * Obtiene el valor de la propiedad homeAirport.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHomeAirport() {
            return homeAirport;
        }

        /**
         * Define el valor de la propiedad homeAirport.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHomeAirport(String value) {
            this.homeAirport = value;
        }

        /**
         * Obtiene el valor de la propiedad airOther.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAirOther() {
            return airOther;
        }

        /**
         * Define el valor de la propiedad airOther.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAirOther(String value) {
            this.airOther = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="AirMembership" type="{}AirMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "airMembership"
        })
        public static class AirMemberships {

            @XmlElement(name = "AirMembership")
            protected List<AirMembership> airMembership;

            /**
             * Gets the value of the airMembership property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the airMembership property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAirMembership().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirMembership }
             *
             *
             */
            public List<AirMembership> getAirMembership() {
                if (airMembership == null) {
                    airMembership = new ArrayList<AirMembership>();
                }
                return this.airMembership;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="InterRowPositionCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Aisle"/&gt;
         *               &lt;enumeration value="Window"/&gt;
         *               &lt;enumeration value="Middle"/&gt;
         *               &lt;enumeration value="DontCare"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SectionPositionCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Bulkhead"/&gt;
         *               &lt;enumeration value="Forward"/&gt;
         *               &lt;enumeration value="Rear"/&gt;
         *               &lt;enumeration value="ExitRow"/&gt;
         *               &lt;enumeration value="DontCare"/&gt;
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
        @XmlType(name = "", propOrder = {
            "interRowPositionCode",
            "sectionPositionCode"
        })
        public static class Seat {

            @XmlElement(name = "InterRowPositionCode")
            protected String interRowPositionCode;
            @XmlElement(name = "SectionPositionCode")
            protected String sectionPositionCode;

            /**
             * Obtiene el valor de la propiedad interRowPositionCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getInterRowPositionCode() {
                return interRowPositionCode;
            }

            /**
             * Define el valor de la propiedad interRowPositionCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setInterRowPositionCode(String value) {
                this.interRowPositionCode = value;
            }

            /**
             * Obtiene el valor de la propiedad sectionPositionCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSectionPositionCode() {
                return sectionPositionCode;
            }

            /**
             * Define el valor de la propiedad sectionPositionCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSectionPositionCode(String value) {
                this.sectionPositionCode = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CarSmokingCode" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *               &lt;enumeration value="NonSmoking"/&gt;
     *               &lt;enumeration value="Smoking"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CarGPS" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CarType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *               &lt;enumeration value="Economy"/&gt;
     *               &lt;enumeration value="Compact"/&gt;
     *               &lt;enumeration value="Intermediate"/&gt;
     *               &lt;enumeration value="Standard"/&gt;
     *               &lt;enumeration value="FullSize"/&gt;
     *               &lt;enumeration value="Luxury"/&gt;
     *               &lt;enumeration value="Premium"/&gt;
     *               &lt;enumeration value="Mini"/&gt;
     *               &lt;enumeration value="EconomyHybrid"/&gt;
     *               &lt;enumeration value="CompactHybrid"/&gt;
     *               &lt;enumeration value="IntermediateHybrid"/&gt;
     *               &lt;enumeration value="StandardHybrid"/&gt;
     *               &lt;enumeration value="FullSizeHybrid"/&gt;
     *               &lt;enumeration value="MiniVan"/&gt;
     *               &lt;enumeration value="StandardSUV"/&gt;
     *               &lt;enumeration value="FullSizeSUV"/&gt;
     *               &lt;enumeration value="FullSizePickup"/&gt;
     *               &lt;enumeration value="Specialized"/&gt;
     *               &lt;enumeration value="IntermediateSUV"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CarMemberships" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CarMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="CarOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CarSkiRack" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CarTransmission" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *               &lt;enumeration value="Automatic"/&gt;
     *               &lt;enumeration value="Manual"/&gt;
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
    @XmlType(name = "", propOrder = {
        "carSmokingCode",
        "carGPS",
        "carType",
        "carMemberships",
        "carOther",
        "carSkiRack",
        "carTransmission"
    })
    public static class Car {

        @XmlElement(name = "CarSmokingCode")
        protected String carSmokingCode;
        @XmlElement(name = "CarGPS")
        protected Boolean carGPS;
        @XmlElement(name = "CarType")
        protected String carType;
        @XmlElement(name = "CarMemberships")
        protected ProfileResponse.Car.CarMemberships carMemberships;
        @XmlElement(name = "CarOther")
        protected String carOther;
        @XmlElement(name = "CarSkiRack")
        protected Boolean carSkiRack;
        @XmlElement(name = "CarTransmission")
        protected String carTransmission;

        /**
         * Obtiene el valor de la propiedad carSmokingCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCarSmokingCode() {
            return carSmokingCode;
        }

        /**
         * Define el valor de la propiedad carSmokingCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCarSmokingCode(String value) {
            this.carSmokingCode = value;
        }

        /**
         * Obtiene el valor de la propiedad carGPS.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isCarGPS() {
            return carGPS;
        }

        /**
         * Define el valor de la propiedad carGPS.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setCarGPS(Boolean value) {
            this.carGPS = value;
        }

        /**
         * Obtiene el valor de la propiedad carType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCarType() {
            return carType;
        }

        /**
         * Define el valor de la propiedad carType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCarType(String value) {
            this.carType = value;
        }

        /**
         * Obtiene el valor de la propiedad carMemberships.
         *
         * @return
         *     possible object is
         *     {@link CarMemberships }
         *
         */
        public CarMemberships getCarMemberships() {
            return carMemberships;
        }

        /**
         * Define el valor de la propiedad carMemberships.
         *
         * @param value
         *     allowed object is
         *     {@link CarMemberships }
         *
         */
        public void setCarMemberships(CarMemberships value) {
            this.carMemberships = value;
        }

        /**
         * Obtiene el valor de la propiedad carOther.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCarOther() {
            return carOther;
        }

        /**
         * Define el valor de la propiedad carOther.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCarOther(String value) {
            this.carOther = value;
        }

        /**
         * Obtiene el valor de la propiedad carSkiRack.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isCarSkiRack() {
            return carSkiRack;
        }

        /**
         * Define el valor de la propiedad carSkiRack.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setCarSkiRack(Boolean value) {
            this.carSkiRack = value;
        }

        /**
         * Obtiene el valor de la propiedad carTransmission.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCarTransmission() {
            return carTransmission;
        }

        /**
         * Define el valor de la propiedad carTransmission.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCarTransmission(String value) {
            this.carTransmission = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CarMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "carMembership"
        })
        public static class CarMemberships {

            @XmlElement(name = "CarMembership")
            protected List<Membership> carMembership;

            /**
             * Gets the value of the carMembership property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the carMembership property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCarMembership().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Membership }
             *
             *
             */
            public List<Membership> getCarMembership() {
                if (carMembership == null) {
                    carMembership = new ArrayList<Membership>();
                }
                return this.carMembership;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CustomField" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "customField"
    })
    public static class CustomFields {

        @XmlElement(name = "CustomField")
        protected List<CustomField> customField;

        /**
         * Gets the value of the customField property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customField property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomField().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomField }
         *
         *
         */
        public List<CustomField> getCustomField() {
            if (customField == null) {
                customField = new ArrayList<CustomField>();
            }
            return this.customField;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class CustomField {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Name", required = true)
            protected String name;

            /**
             * Obtiene el valor de la propiedad value.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad name.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DiscountCode" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "discountCode"
    })
    public static class DiscountCodes {

        @XmlElement(name = "DiscountCode")
        protected List<DiscountCode> discountCode;

        /**
         * Gets the value of the discountCode property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the discountCode property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDiscountCode().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DiscountCode }
         *
         *
         */
        public List<DiscountCode> getDiscountCode() {
            if (discountCode == null) {
                discountCode = new ArrayList<DiscountCode>();
            }
            return this.discountCode;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Vendor" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DiscountCode {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Vendor", required = true)
            protected String vendor;

            /**
             * Obtiene el valor de la propiedad value.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad vendor.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVendor() {
                return vendor;
            }

            /**
             * Define el valor de la propiedad vendor.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVendor(String value) {
                this.vendor = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="DriversLicense" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DriversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="IssuingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "driversLicense"
    })
    public static class DriversLicenses {

        @XmlElement(name = "DriversLicense")
        protected List<DriversLicense> driversLicense;

        /**
         * Gets the value of the driversLicense property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the driversLicense property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDriversLicense().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DriversLicense }
         *
         *
         */
        public List<DriversLicense> getDriversLicense() {
            if (driversLicense == null) {
                driversLicense = new ArrayList<DriversLicense>();
            }
            return this.driversLicense;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="DriversLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="IssuingState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "driversLicenseNumber",
            "issuingCountry",
            "issuingState",
            "expiration"
        })
        public static class DriversLicense {

            @XmlElement(name = "DriversLicenseNumber", required = true)
            protected String driversLicenseNumber;
            @XmlElement(name = "IssuingCountry", required = true)
            protected String issuingCountry;
            @XmlElement(name = "IssuingState")
            protected String issuingState;
            @XmlElementRef(name = "Expiration", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> expiration;

            /**
             * Obtiene el valor de la propiedad driversLicenseNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDriversLicenseNumber() {
                return driversLicenseNumber;
            }

            /**
             * Define el valor de la propiedad driversLicenseNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDriversLicenseNumber(String value) {
                this.driversLicenseNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad issuingCountry.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIssuingCountry() {
                return issuingCountry;
            }

            /**
             * Define el valor de la propiedad issuingCountry.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIssuingCountry(String value) {
                this.issuingCountry = value;
            }

            /**
             * Obtiene el valor de la propiedad issuingState.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIssuingState() {
                return issuingState;
            }

            /**
             * Define el valor de la propiedad issuingState.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIssuingState(String value) {
                this.issuingState = value;
            }

            /**
             * Obtiene el valor de la propiedad expiration.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getExpiration() {
                return expiration;
            }

            /**
             * Define el valor de la propiedad expiration.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setExpiration(JAXBElement<XMLGregorianCalendar> value) {
                this.expiration = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="EmailAddress" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Business"/&gt;
     *                       &lt;enumeration value="Personal"/&gt;
     *                       &lt;enumeration value="Business2"/&gt;
     *                       &lt;enumeration value="Other1"/&gt;
     *                       &lt;enumeration value="Other2"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "emailAddress"
    })
    public static class EmailAddresses {

        @XmlElement(name = "EmailAddress")
        protected List<EmailAddress> emailAddress;

        /**
         * Gets the value of the emailAddress property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmailAddress().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EmailAddress }
         *
         *
         */
        public List<EmailAddress> getEmailAddress() {
            if (emailAddress == null) {
                emailAddress = new ArrayList<EmailAddress>();
            }
            return this.emailAddress;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Contact" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Business"/&gt;
         *             &lt;enumeration value="Personal"/&gt;
         *             &lt;enumeration value="Business2"/&gt;
         *             &lt;enumeration value="Other1"/&gt;
         *             &lt;enumeration value="Other2"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class EmailAddress {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Contact")
            protected Boolean contact;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad value.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getValue() {
                return value;
            }

            /**
             * Define el valor de la propiedad value.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Obtiene el valor de la propiedad contact.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isContact() {
                return contact;
            }

            /**
             * Define el valor de la propiedad contact.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setContact(Boolean value) {
                this.contact = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Relationship" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Spouse"/&gt;
     *               &lt;enumeration value="Brother"/&gt;
     *               &lt;enumeration value="Parent"/&gt;
     *               &lt;enumeration value="Sister"/&gt;
     *               &lt;enumeration value="LifePartner"/&gt;
     *               &lt;enumeration value="Other"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Phones" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Phone" maxOccurs="2" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                           &lt;attribute name="Type" use="required"&gt;
     *                             &lt;simpleType&gt;
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                 &lt;enumeration value="DayTime"/&gt;
     *                                 &lt;enumeration value="Alternate"/&gt;
     *                               &lt;/restriction&gt;
     *                             &lt;/simpleType&gt;
     *                           &lt;/attribute&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Address" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "name",
        "relationship",
        "phones",
        "address"
    })
    public static class EmergencyContact {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElementRef(name = "Relationship", type = JAXBElement.class, required = false)
        protected JAXBElement<String> relationship;
        @XmlElement(name = "Phones")
        protected ProfileResponse.EmergencyContact.Phones phones;
        @XmlElement(name = "Address")
        protected ProfileResponse.EmergencyContact.Address address;

        /**
         * Obtiene el valor de la propiedad name.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad relationship.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getRelationship() {
            return relationship;
        }

        /**
         * Define el valor de la propiedad relationship.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setRelationship(JAXBElement<String> value) {
            this.relationship = value;
        }

        /**
         * Obtiene el valor de la propiedad phones.
         *
         * @return
         *     possible object is
         *     {@link Phones }
         *
         */
        public Phones getPhones() {
            return phones;
        }

        /**
         * Define el valor de la propiedad phones.
         *
         * @param value
         *     allowed object is
         *     {@link Phones }
         *
         */
        public void setPhones(Phones value) {
            this.phones = value;
        }

        /**
         * Obtiene el valor de la propiedad address.
         *
         * @return
         *     possible object is
         *     {@link Address }
         *
         */
        public Address getAddress() {
            return address;
        }

        /**
         * Define el valor de la propiedad address.
         *
         * @param value
         *     allowed object is
         *     {@link Address }
         *
         */
        public void setAddress(Address value) {
            this.address = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="StateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "street",
            "city",
            "stateProvince",
            "postalCode",
            "countryCode"
        })
        public static class Address {

            @XmlElement(name = "Street")
            protected String street;
            @XmlElement(name = "City")
            protected String city;
            @XmlElement(name = "StateProvince")
            protected String stateProvince;
            @XmlElement(name = "PostalCode")
            protected String postalCode;
            @XmlElement(name = "CountryCode")
            protected String countryCode;

            /**
             * Obtiene el valor de la propiedad street.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStreet() {
                return street;
            }

            /**
             * Define el valor de la propiedad street.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStreet(String value) {
                this.street = value;
            }

            /**
             * Obtiene el valor de la propiedad city.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCity() {
                return city;
            }

            /**
             * Define el valor de la propiedad city.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Obtiene el valor de la propiedad stateProvince.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getStateProvince() {
                return stateProvince;
            }

            /**
             * Define el valor de la propiedad stateProvince.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setStateProvince(String value) {
                this.stateProvince = value;
            }

            /**
             * Obtiene el valor de la propiedad postalCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Define el valor de la propiedad postalCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Obtiene el valor de la propiedad countryCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Define el valor de la propiedad countryCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Phone" maxOccurs="2" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attribute name="Type" use="required"&gt;
         *                   &lt;simpleType&gt;
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                       &lt;enumeration value="DayTime"/&gt;
         *                       &lt;enumeration value="Alternate"/&gt;
         *                     &lt;/restriction&gt;
         *                   &lt;/simpleType&gt;
         *                 &lt;/attribute&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
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
        @XmlType(name = "", propOrder = {
            "phone"
        })
        public static class Phones {

            @XmlElement(name = "Phone")
            protected List<Phone> phone;

            /**
             * Gets the value of the phone property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phone property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPhone().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Phone }
             *
             *
             */
            public List<Phone> getPhone() {
                if (phone == null) {
                    phone = new ArrayList<Phone>();
                }
                return this.phone;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             *
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attribute name="Type" use="required"&gt;
             *         &lt;simpleType&gt;
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *             &lt;enumeration value="DayTime"/&gt;
             *             &lt;enumeration value="Alternate"/&gt;
             *           &lt;/restriction&gt;
             *         &lt;/simpleType&gt;
             *       &lt;/attribute&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Phone {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Type", required = true)
                protected String type;

                /**
                 * Obtiene el valor de la propiedad value.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Define el valor de la propiedad value.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Obtiene el valor de la propiedad type.
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getType() {
                    return type;
                }

                /**
                 * Define el valor de la propiedad type.
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setType(String value) {
                    this.type = value;
                }

            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CostCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CompanyEmployeeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AccountTerminationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="PreferredLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="EReceiptOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="HasOpenBooking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CompanyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="CompanyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RuleClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="TravelConfigID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="MedicalAlerts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="AgencyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SearchId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="GDSProfileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="SabreProfileId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "namePrefix",
        "firstName",
        "middleName",
        "lastName",
        "nameSuffix",
        "preferredName",
        "jobTitle",
        "costCenter",
        "companyEmployeeID",
        "division",
        "accountTerminationDate",
        "preferredLanguage",
        "eReceiptOptIn",
        "hasOpenBooking",
        "countryCode",
        "companyName",
        "companyID",
        "ruleClass",
        "travelConfigID",
        "medicalAlerts",
        "agencyNumber",
        "searchId",
        "gdsProfileName",
        "sabreProfileId",
        "uuid"
    })
    public static class General {

        @XmlElement(name = "NamePrefix")
        protected String namePrefix;
        @XmlElement(name = "FirstName")
        protected String firstName;
        @XmlElement(name = "MiddleName")
        protected String middleName;
        @XmlElement(name = "LastName")
        protected String lastName;
        @XmlElement(name = "NameSuffix")
        protected String nameSuffix;
        @XmlElement(name = "PreferredName")
        protected String preferredName;
        @XmlElement(name = "JobTitle")
        protected String jobTitle;
        @XmlElement(name = "CostCenter")
        protected String costCenter;
        @XmlElement(name = "CompanyEmployeeID")
        protected String companyEmployeeID;
        @XmlElement(name = "Division")
        protected String division;
        @XmlElementRef(name = "AccountTerminationDate", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> accountTerminationDate;
        @XmlElement(name = "PreferredLanguage")
        protected String preferredLanguage;
        @XmlElement(name = "EReceiptOptIn")
        protected Boolean eReceiptOptIn;
        @XmlElement(name = "HasOpenBooking")
        protected Boolean hasOpenBooking;
        @XmlElement(name = "CountryCode")
        protected String countryCode;
        @XmlElement(name = "CompanyName")
        protected String companyName;
        @XmlElement(name = "CompanyID")
        protected String companyID;
        @XmlElement(name = "RuleClass")
        protected String ruleClass;
        @XmlElement(name = "TravelConfigID")
        protected String travelConfigID;
        @XmlElement(name = "MedicalAlerts")
        protected String medicalAlerts;
        @XmlElement(name = "AgencyNumber")
        protected String agencyNumber;
        @XmlElement(name = "SearchId")
        protected String searchId;
        @XmlElement(name = "GDSProfileName")
        protected String gdsProfileName;
        @XmlElement(name = "SabreProfileId")
        protected String sabreProfileId;
        @XmlElement(name = "UUID")
        protected String uuid;

        /**
         * Obtiene el valor de la propiedad namePrefix.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNamePrefix() {
            return namePrefix;
        }

        /**
         * Define el valor de la propiedad namePrefix.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNamePrefix(String value) {
            this.namePrefix = value;
        }

        /**
         * Obtiene el valor de la propiedad firstName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Define el valor de la propiedad firstName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Obtiene el valor de la propiedad middleName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Define el valor de la propiedad middleName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Obtiene el valor de la propiedad lastName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Define el valor de la propiedad lastName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Obtiene el valor de la propiedad nameSuffix.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNameSuffix() {
            return nameSuffix;
        }

        /**
         * Define el valor de la propiedad nameSuffix.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNameSuffix(String value) {
            this.nameSuffix = value;
        }

        /**
         * Obtiene el valor de la propiedad preferredName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPreferredName() {
            return preferredName;
        }

        /**
         * Define el valor de la propiedad preferredName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPreferredName(String value) {
            this.preferredName = value;
        }

        /**
         * Obtiene el valor de la propiedad jobTitle.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getJobTitle() {
            return jobTitle;
        }

        /**
         * Define el valor de la propiedad jobTitle.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setJobTitle(String value) {
            this.jobTitle = value;
        }

        /**
         * Obtiene el valor de la propiedad costCenter.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCostCenter() {
            return costCenter;
        }

        /**
         * Define el valor de la propiedad costCenter.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCostCenter(String value) {
            this.costCenter = value;
        }

        /**
         * Obtiene el valor de la propiedad companyEmployeeID.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCompanyEmployeeID() {
            return companyEmployeeID;
        }

        /**
         * Define el valor de la propiedad companyEmployeeID.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCompanyEmployeeID(String value) {
            this.companyEmployeeID = value;
        }

        /**
         * Obtiene el valor de la propiedad division.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDivision() {
            return division;
        }

        /**
         * Define el valor de la propiedad division.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDivision(String value) {
            this.division = value;
        }

        /**
         * Obtiene el valor de la propiedad accountTerminationDate.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *
         */
        public JAXBElement<XMLGregorianCalendar> getAccountTerminationDate() {
            return accountTerminationDate;
        }

        /**
         * Define el valor de la propiedad accountTerminationDate.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *
         */
        public void setAccountTerminationDate(JAXBElement<XMLGregorianCalendar> value) {
            this.accountTerminationDate = value;
        }

        /**
         * Obtiene el valor de la propiedad preferredLanguage.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPreferredLanguage() {
            return preferredLanguage;
        }

        /**
         * Define el valor de la propiedad preferredLanguage.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPreferredLanguage(String value) {
            this.preferredLanguage = value;
        }

        /**
         * Obtiene el valor de la propiedad eReceiptOptIn.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isEReceiptOptIn() {
            return eReceiptOptIn;
        }

        /**
         * Define el valor de la propiedad eReceiptOptIn.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setEReceiptOptIn(Boolean value) {
            this.eReceiptOptIn = value;
        }

        /**
         * Obtiene el valor de la propiedad hasOpenBooking.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isHasOpenBooking() {
            return hasOpenBooking;
        }

        /**
         * Define el valor de la propiedad hasOpenBooking.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setHasOpenBooking(Boolean value) {
            this.hasOpenBooking = value;
        }

        /**
         * Obtiene el valor de la propiedad countryCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * Define el valor de la propiedad countryCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
        }

        /**
         * Obtiene el valor de la propiedad companyName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCompanyName() {
            return companyName;
        }

        /**
         * Define el valor de la propiedad companyName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCompanyName(String value) {
            this.companyName = value;
        }

        /**
         * Obtiene el valor de la propiedad companyID.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCompanyID() {
            return companyID;
        }

        /**
         * Define el valor de la propiedad companyID.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCompanyID(String value) {
            this.companyID = value;
        }

        /**
         * Obtiene el valor de la propiedad ruleClass.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRuleClass() {
            return ruleClass;
        }

        /**
         * Define el valor de la propiedad ruleClass.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRuleClass(String value) {
            this.ruleClass = value;
        }

        /**
         * Obtiene el valor de la propiedad travelConfigID.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTravelConfigID() {
            return travelConfigID;
        }

        /**
         * Define el valor de la propiedad travelConfigID.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTravelConfigID(String value) {
            this.travelConfigID = value;
        }

        /**
         * Obtiene el valor de la propiedad medicalAlerts.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMedicalAlerts() {
            return medicalAlerts;
        }

        /**
         * Define el valor de la propiedad medicalAlerts.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMedicalAlerts(String value) {
            this.medicalAlerts = value;
        }

        /**
         * Obtiene el valor de la propiedad agencyNumber.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAgencyNumber() {
            return agencyNumber;
        }

        /**
         * Define el valor de la propiedad agencyNumber.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAgencyNumber(String value) {
            this.agencyNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad searchId.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSearchId() {
            return searchId;
        }

        /**
         * Define el valor de la propiedad searchId.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSearchId(String value) {
            this.searchId = value;
        }

        /**
         * Obtiene el valor de la propiedad gdsProfileName.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGDSProfileName() {
            return gdsProfileName;
        }

        /**
         * Define el valor de la propiedad gdsProfileName.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGDSProfileName(String value) {
            this.gdsProfileName = value;
        }

        /**
         * Obtiene el valor de la propiedad sabreProfileId.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSabreProfileId() {
            return sabreProfileId;
        }

        /**
         * Define el valor de la propiedad sabreProfileId.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSabreProfileId(String value) {
            this.sabreProfileId = value;
        }

        /**
         * Obtiene el valor de la propiedad uuid.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getUUID() {
            return uuid;
        }

        /**
         * Define el valor de la propiedad uuid.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setUUID(String value) {
            this.uuid = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="HotelSmokingCode" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *               &lt;enumeration value="NonSmoking"/&gt;
     *               &lt;enumeration value="Smoking"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HotelMemberships" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="HotelMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RoomType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *               &lt;enumeration value="King"/&gt;
     *               &lt;enumeration value="Queen"/&gt;
     *               &lt;enumeration value="Double"/&gt;
     *               &lt;enumeration value="Twin"/&gt;
     *               &lt;enumeration value="Single"/&gt;
     *               &lt;enumeration value="Disability"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="HotelOther" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PreferFoamPillows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferCrib" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferRollawayBed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferGym" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferPool" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferRestaurant" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferWheelchairAccess" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferAccessForBlind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferRoomService" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreferEarlyCheckIn" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hotelSmokingCode",
        "hotelMemberships",
        "roomType",
        "hotelOther",
        "preferFoamPillows",
        "preferCrib",
        "preferRollawayBed",
        "preferGym",
        "preferPool",
        "preferRestaurant",
        "preferWheelchairAccess",
        "preferAccessForBlind",
        "preferRoomService",
        "preferEarlyCheckIn"
    })
    public static class Hotel {

        @XmlElement(name = "HotelSmokingCode")
        protected String hotelSmokingCode;
        @XmlElement(name = "HotelMemberships")
        protected ProfileResponse.Hotel.HotelMemberships hotelMemberships;
        @XmlElement(name = "RoomType")
        protected String roomType;
        @XmlElement(name = "HotelOther")
        protected String hotelOther;
        @XmlElement(name = "PreferFoamPillows")
        protected Boolean preferFoamPillows;
        @XmlElement(name = "PreferCrib")
        protected Boolean preferCrib;
        @XmlElement(name = "PreferRollawayBed")
        protected Boolean preferRollawayBed;
        @XmlElement(name = "PreferGym")
        protected Boolean preferGym;
        @XmlElement(name = "PreferPool")
        protected Boolean preferPool;
        @XmlElement(name = "PreferRestaurant")
        protected Boolean preferRestaurant;
        @XmlElement(name = "PreferWheelchairAccess")
        protected Boolean preferWheelchairAccess;
        @XmlElement(name = "PreferAccessForBlind")
        protected Boolean preferAccessForBlind;
        @XmlElement(name = "PreferRoomService")
        protected Boolean preferRoomService;
        @XmlElement(name = "PreferEarlyCheckIn")
        protected Boolean preferEarlyCheckIn;

        /**
         * Obtiene el valor de la propiedad hotelSmokingCode.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHotelSmokingCode() {
            return hotelSmokingCode;
        }

        /**
         * Define el valor de la propiedad hotelSmokingCode.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHotelSmokingCode(String value) {
            this.hotelSmokingCode = value;
        }

        /**
         * Obtiene el valor de la propiedad hotelMemberships.
         *
         * @return
         *     possible object is
         *     {@link HotelMemberships }
         *
         */
        public HotelMemberships getHotelMemberships() {
            return hotelMemberships;
        }

        /**
         * Define el valor de la propiedad hotelMemberships.
         *
         * @param value
         *     allowed object is
         *     {@link HotelMemberships }
         *
         */
        public void setHotelMemberships(HotelMemberships value) {
            this.hotelMemberships = value;
        }

        /**
         * Obtiene el valor de la propiedad roomType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRoomType() {
            return roomType;
        }

        /**
         * Define el valor de la propiedad roomType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRoomType(String value) {
            this.roomType = value;
        }

        /**
         * Obtiene el valor de la propiedad hotelOther.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHotelOther() {
            return hotelOther;
        }

        /**
         * Define el valor de la propiedad hotelOther.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHotelOther(String value) {
            this.hotelOther = value;
        }

        /**
         * Obtiene el valor de la propiedad preferFoamPillows.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferFoamPillows() {
            return preferFoamPillows;
        }

        /**
         * Define el valor de la propiedad preferFoamPillows.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferFoamPillows(Boolean value) {
            this.preferFoamPillows = value;
        }

        /**
         * Obtiene el valor de la propiedad preferCrib.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferCrib() {
            return preferCrib;
        }

        /**
         * Define el valor de la propiedad preferCrib.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferCrib(Boolean value) {
            this.preferCrib = value;
        }

        /**
         * Obtiene el valor de la propiedad preferRollawayBed.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferRollawayBed() {
            return preferRollawayBed;
        }

        /**
         * Define el valor de la propiedad preferRollawayBed.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferRollawayBed(Boolean value) {
            this.preferRollawayBed = value;
        }

        /**
         * Obtiene el valor de la propiedad preferGym.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferGym() {
            return preferGym;
        }

        /**
         * Define el valor de la propiedad preferGym.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferGym(Boolean value) {
            this.preferGym = value;
        }

        /**
         * Obtiene el valor de la propiedad preferPool.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferPool() {
            return preferPool;
        }

        /**
         * Define el valor de la propiedad preferPool.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferPool(Boolean value) {
            this.preferPool = value;
        }

        /**
         * Obtiene el valor de la propiedad preferRestaurant.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferRestaurant() {
            return preferRestaurant;
        }

        /**
         * Define el valor de la propiedad preferRestaurant.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferRestaurant(Boolean value) {
            this.preferRestaurant = value;
        }

        /**
         * Obtiene el valor de la propiedad preferWheelchairAccess.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferWheelchairAccess() {
            return preferWheelchairAccess;
        }

        /**
         * Define el valor de la propiedad preferWheelchairAccess.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferWheelchairAccess(Boolean value) {
            this.preferWheelchairAccess = value;
        }

        /**
         * Obtiene el valor de la propiedad preferAccessForBlind.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferAccessForBlind() {
            return preferAccessForBlind;
        }

        /**
         * Define el valor de la propiedad preferAccessForBlind.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferAccessForBlind(Boolean value) {
            this.preferAccessForBlind = value;
        }

        /**
         * Obtiene el valor de la propiedad preferRoomService.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferRoomService() {
            return preferRoomService;
        }

        /**
         * Define el valor de la propiedad preferRoomService.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferRoomService(Boolean value) {
            this.preferRoomService = value;
        }

        /**
         * Obtiene el valor de la propiedad preferEarlyCheckIn.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isPreferEarlyCheckIn() {
            return preferEarlyCheckIn;
        }

        /**
         * Define el valor de la propiedad preferEarlyCheckIn.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setPreferEarlyCheckIn(Boolean value) {
            this.preferEarlyCheckIn = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="HotelMembership" type="{}Membership" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelMembership"
        })
        public static class HotelMemberships {

            @XmlElement(name = "HotelMembership")
            protected List<Membership> hotelMembership;

            /**
             * Gets the value of the hotelMembership property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelMembership property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelMembership().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Membership }
             *
             *
             */
            public List<Membership> getHotelMembership() {
                if (hotelMembership == null) {
                    hotelMembership = new ArrayList<Membership>();
                }
                return this.hotelMembership;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NationalID" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NationalIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "nationalID"
    })
    public static class NationalIDs {

        @XmlElement(name = "NationalID")
        protected List<NationalID> nationalID;

        /**
         * Gets the value of the nationalID property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the nationalID property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNationalID().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link NationalID }
         *
         *
         */
        public List<NationalID> getNationalID() {
            if (nationalID == null) {
                nationalID = new ArrayList<NationalID>();
            }
            return this.nationalID;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NationalIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IssuingCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Expiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nationalIDNumber",
            "issuingCountry",
            "expiration"
        })
        public static class NationalID {

            @XmlElement(name = "NationalIDNumber")
            protected String nationalIDNumber;
            @XmlElement(name = "IssuingCountry")
            protected String issuingCountry;
            @XmlElementRef(name = "Expiration", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> expiration;

            /**
             * Obtiene el valor de la propiedad nationalIDNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNationalIDNumber() {
                return nationalIDNumber;
            }

            /**
             * Define el valor de la propiedad nationalIDNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNationalIDNumber(String value) {
                this.nationalIDNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad issuingCountry.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIssuingCountry() {
                return issuingCountry;
            }

            /**
             * Define el valor de la propiedad issuingCountry.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIssuingCountry(String value) {
                this.issuingCountry = value;
            }

            /**
             * Obtiene el valor de la propiedad expiration.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getExpiration() {
                return expiration;
            }

            /**
             * Define el valor de la propiedad expiration.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setExpiration(JAXBElement<XMLGregorianCalendar> value) {
                this.expiration = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Passport" maxOccurs="2" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PassportNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PassportExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="PassportDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="PassportCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PassportCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "passport"
    })
    public static class Passports {

        @XmlElement(name = "Passport")
        protected List<Passport> passport;

        /**
         * Gets the value of the passport property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passport property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassport().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Passport }
         *
         *
         */
        public List<Passport> getPassport() {
            if (passport == null) {
                passport = new ArrayList<Passport>();
            }
            return this.passport;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PassportNationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PassportExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="PassportDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="PassportCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PassportCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passportNumber",
            "passportNationality",
            "passportExpiration",
            "passportDateIssued",
            "passportCityIssued",
            "passportCountryIssued"
        })
        public static class Passport {

            @XmlElement(name = "PassportNumber")
            protected String passportNumber;
            @XmlElement(name = "PassportNationality")
            protected String passportNationality;
            @XmlElementRef(name = "PassportExpiration", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> passportExpiration;
            @XmlElementRef(name = "PassportDateIssued", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> passportDateIssued;
            @XmlElement(name = "PassportCityIssued")
            protected String passportCityIssued;
            @XmlElement(name = "PassportCountryIssued")
            protected String passportCountryIssued;

            /**
             * Obtiene el valor de la propiedad passportNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPassportNumber() {
                return passportNumber;
            }

            /**
             * Define el valor de la propiedad passportNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPassportNumber(String value) {
                this.passportNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad passportNationality.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPassportNationality() {
                return passportNationality;
            }

            /**
             * Define el valor de la propiedad passportNationality.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPassportNationality(String value) {
                this.passportNationality = value;
            }

            /**
             * Obtiene el valor de la propiedad passportExpiration.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getPassportExpiration() {
                return passportExpiration;
            }

            /**
             * Define el valor de la propiedad passportExpiration.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setPassportExpiration(JAXBElement<XMLGregorianCalendar> value) {
                this.passportExpiration = value;
            }

            /**
             * Obtiene el valor de la propiedad passportDateIssued.
             *
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public JAXBElement<XMLGregorianCalendar> getPassportDateIssued() {
                return passportDateIssued;
            }

            /**
             * Define el valor de la propiedad passportDateIssued.
             *
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *
             */
            public void setPassportDateIssued(JAXBElement<XMLGregorianCalendar> value) {
                this.passportDateIssued = value;
            }

            /**
             * Obtiene el valor de la propiedad passportCityIssued.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPassportCityIssued() {
                return passportCityIssued;
            }

            /**
             * Define el valor de la propiedad passportCityIssued.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPassportCityIssued(String value) {
                this.passportCityIssued = value;
            }

            /**
             * Obtiene el valor de la propiedad passportCountryIssued.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPassportCountryIssued() {
                return passportCountryIssued;
            }

            /**
             * Define el valor de la propiedad passportCountryIssued.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPassportCountryIssued(String value) {
                this.passportCountryIssued = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Seat" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Aisle"/&gt;
     *               &lt;enumeration value="Window"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Coach" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Compartment"/&gt;
     *               &lt;enumeration value="Coach"/&gt;
     *               &lt;enumeration value="CoachWithTable"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NoiseComfort" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="QuietSpace"/&gt;
     *               &lt;enumeration value="MobileSpace"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Bed" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Lower"/&gt;
     *               &lt;enumeration value="Upper"/&gt;
     *               &lt;enumeration value="Middle"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BedCategory" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="WomenOnly"/&gt;
     *               &lt;enumeration value="MenOnly"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Berth" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Lower"/&gt;
     *               &lt;enumeration value="Upper"/&gt;
     *               &lt;enumeration value="Middle"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Deck" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Lower"/&gt;
     *               &lt;enumeration value="Upper"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SpaceType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Panorama"/&gt;
     *               &lt;enumeration value="SeatWithTable"/&gt;
     *               &lt;enumeration value="Solo"/&gt;
     *               &lt;enumeration value="Salon"/&gt;
     *               &lt;enumeration value="Kiosk"/&gt;
     *               &lt;enumeration value="InclineSeat"/&gt;
     *               &lt;enumeration value="DuoSideBySide"/&gt;
     *               &lt;enumeration value="DuoFaceToFace"/&gt;
     *               &lt;enumeration value="Club6"/&gt;
     *               &lt;enumeration value="Club4"/&gt;
     *               &lt;enumeration value="Carre"/&gt;
     *               &lt;enumeration value="DisabledCompanionSpace"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FareSpaceComfort" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="DedicatedBusiness"/&gt;
     *               &lt;enumeration value="Business"/&gt;
     *               &lt;enumeration value="IntermediateLeisure"/&gt;
     *               &lt;enumeration value="Leisure"/&gt;
     *               &lt;enumeration value="StandardLeisure"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SpecialMeals" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="LowFat"/&gt;
     *               &lt;enumeration value="LowSalt"/&gt;
     *               &lt;enumeration value="GlutenFree"/&gt;
     *               &lt;enumeration value="Diabetic"/&gt;
     *               &lt;enumeration value="Muslim"/&gt;
     *               &lt;enumeration value="Kosher"/&gt;
     *               &lt;enumeration value="Vegetarian"/&gt;
     *               &lt;enumeration value="VegetarianLactoOvo"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Contingencies" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Bike"/&gt;
     *               &lt;enumeration value="WomenOnly"/&gt;
     *               &lt;enumeration value="WheelchairSpace"/&gt;
     *               &lt;enumeration value="DontCare"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RailMemberships" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RailMembership" type="{}RailMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "seat",
        "coach",
        "noiseComfort",
        "bed",
        "bedCategory",
        "berth",
        "deck",
        "spaceType",
        "fareSpaceComfort",
        "specialMeals",
        "contingencies",
        "railMemberships"
    })
    public static class Rail {

        @XmlElement(name = "Seat")
        protected String seat;
        @XmlElement(name = "Coach")
        protected String coach;
        @XmlElement(name = "NoiseComfort")
        protected String noiseComfort;
        @XmlElement(name = "Bed")
        protected String bed;
        @XmlElement(name = "BedCategory")
        protected String bedCategory;
        @XmlElement(name = "Berth")
        protected String berth;
        @XmlElement(name = "Deck")
        protected String deck;
        @XmlElement(name = "SpaceType")
        protected String spaceType;
        @XmlElement(name = "FareSpaceComfort")
        protected String fareSpaceComfort;
        @XmlElement(name = "SpecialMeals")
        protected String specialMeals;
        @XmlElement(name = "Contingencies")
        protected String contingencies;
        @XmlElement(name = "RailMemberships")
        protected ProfileResponse.Rail.RailMemberships railMemberships;

        /**
         * Obtiene el valor de la propiedad seat.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSeat() {
            return seat;
        }

        /**
         * Define el valor de la propiedad seat.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSeat(String value) {
            this.seat = value;
        }

        /**
         * Obtiene el valor de la propiedad coach.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCoach() {
            return coach;
        }

        /**
         * Define el valor de la propiedad coach.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCoach(String value) {
            this.coach = value;
        }

        /**
         * Obtiene el valor de la propiedad noiseComfort.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNoiseComfort() {
            return noiseComfort;
        }

        /**
         * Define el valor de la propiedad noiseComfort.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNoiseComfort(String value) {
            this.noiseComfort = value;
        }

        /**
         * Obtiene el valor de la propiedad bed.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBed() {
            return bed;
        }

        /**
         * Define el valor de la propiedad bed.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBed(String value) {
            this.bed = value;
        }

        /**
         * Obtiene el valor de la propiedad bedCategory.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBedCategory() {
            return bedCategory;
        }

        /**
         * Define el valor de la propiedad bedCategory.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBedCategory(String value) {
            this.bedCategory = value;
        }

        /**
         * Obtiene el valor de la propiedad berth.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBerth() {
            return berth;
        }

        /**
         * Define el valor de la propiedad berth.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBerth(String value) {
            this.berth = value;
        }

        /**
         * Obtiene el valor de la propiedad deck.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getDeck() {
            return deck;
        }

        /**
         * Define el valor de la propiedad deck.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setDeck(String value) {
            this.deck = value;
        }

        /**
         * Obtiene el valor de la propiedad spaceType.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSpaceType() {
            return spaceType;
        }

        /**
         * Define el valor de la propiedad spaceType.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSpaceType(String value) {
            this.spaceType = value;
        }

        /**
         * Obtiene el valor de la propiedad fareSpaceComfort.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getFareSpaceComfort() {
            return fareSpaceComfort;
        }

        /**
         * Define el valor de la propiedad fareSpaceComfort.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setFareSpaceComfort(String value) {
            this.fareSpaceComfort = value;
        }

        /**
         * Obtiene el valor de la propiedad specialMeals.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSpecialMeals() {
            return specialMeals;
        }

        /**
         * Define el valor de la propiedad specialMeals.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSpecialMeals(String value) {
            this.specialMeals = value;
        }

        /**
         * Obtiene el valor de la propiedad contingencies.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getContingencies() {
            return contingencies;
        }

        /**
         * Define el valor de la propiedad contingencies.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setContingencies(String value) {
            this.contingencies = value;
        }

        /**
         * Obtiene el valor de la propiedad railMemberships.
         *
         * @return
         *     possible object is
         *     {@link RailMemberships }
         *
         */
        public RailMemberships getRailMemberships() {
            return railMemberships;
        }

        /**
         * Define el valor de la propiedad railMemberships.
         *
         * @param value
         *     allowed object is
         *     {@link RailMemberships }
         *
         */
        public void setRailMemberships(RailMemberships value) {
            this.railMemberships = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="RailMembership" type="{}RailMembership" maxOccurs="unbounded" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "railMembership"
        })
        public static class RailMemberships {

            @XmlElement(name = "RailMembership")
            protected List<RailMembership> railMembership;

            /**
             * Gets the value of the railMembership property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the railMembership property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRailMembership().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RailMembership }
             *
             *
             */
            public List<RailMembership> getRailMembership() {
                if (railMembership == null) {
                    railMembership = new ArrayList<RailMembership>();
                }
                return this.railMembership;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="AAARate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="AARPRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="GovtRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="MilitaryRate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aaaRate",
        "aarpRate",
        "govtRate",
        "militaryRate"
    })
    public static class RatePreferences {

        @XmlElement(name = "AAARate")
        protected Boolean aaaRate;
        @XmlElement(name = "AARPRate")
        protected Boolean aarpRate;
        @XmlElement(name = "GovtRate")
        protected Boolean govtRate;
        @XmlElement(name = "MilitaryRate")
        protected Boolean militaryRate;

        /**
         * Obtiene el valor de la propiedad aaaRate.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isAAARate() {
            return aaaRate;
        }

        /**
         * Define el valor de la propiedad aaaRate.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setAAARate(Boolean value) {
            this.aaaRate = value;
        }

        /**
         * Obtiene el valor de la propiedad aarpRate.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isAARPRate() {
            return aarpRate;
        }

        /**
         * Define el valor de la propiedad aarpRate.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setAARPRate(Boolean value) {
            this.aarpRate = value;
        }

        /**
         * Obtiene el valor de la propiedad govtRate.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isGovtRate() {
            return govtRate;
        }

        /**
         * Define el valor de la propiedad govtRate.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setGovtRate(Boolean value) {
            this.govtRate = value;
        }

        /**
         * Obtiene el valor de la propiedad militaryRate.
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isMilitaryRate() {
            return militaryRate;
        }

        /**
         * Define el valor de la propiedad militaryRate.
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setMilitaryRate(Boolean value) {
            this.militaryRate = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Role" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Arranger"/&gt;
     *                       &lt;enumeration value="Manager"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="PrimaryIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "role"
    })
    public static class Roles {

        @XmlElement(name = "Role")
        protected List<Role> role;

        /**
         * Gets the value of the role property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the role property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRole().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Role }
         *
         *
         */
        public List<Role> getRole() {
            if (role == null) {
                role = new ArrayList<Role>();
            }
            return this.role;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Arranger"/&gt;
         *             &lt;enumeration value="Manager"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="PrimaryIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstName",
            "lastName",
            "emailAddress",
            "loginId"
        })
        public static class Role {

            @XmlElement(name = "FirstName")
            protected String firstName;
            @XmlElement(name = "LastName")
            protected String lastName;
            @XmlElement(name = "EmailAddress")
            protected String emailAddress;
            @XmlElement(name = "LoginId")
            protected String loginId;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "PrimaryIndicatorFlag")
            protected Boolean primaryIndicatorFlag;

            /**
             * Obtiene el valor de la propiedad firstName.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Define el valor de la propiedad firstName.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Obtiene el valor de la propiedad lastName.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Define el valor de la propiedad lastName.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Obtiene el valor de la propiedad emailAddress.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getEmailAddress() {
                return emailAddress;
            }

            /**
             * Define el valor de la propiedad emailAddress.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setEmailAddress(String value) {
                this.emailAddress = value;
            }

            /**
             * Obtiene el valor de la propiedad loginId.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLoginId() {
                return loginId;
            }

            /**
             * Define el valor de la propiedad loginId.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLoginId(String value) {
                this.loginId = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad primaryIndicatorFlag.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isPrimaryIndicatorFlag() {
                return primaryIndicatorFlag;
            }

            /**
             * Define el valor de la propiedad primaryIndicatorFlag.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setPrimaryIndicatorFlag(Boolean value) {
                this.primaryIndicatorFlag = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="SouthwestUnusedTicket" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TicketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "southwestUnusedTicket"
    })
    public static class SouthwestUnusedTickets {

        @XmlElement(name = "SouthwestUnusedTicket")
        protected List<SouthwestUnusedTicket> southwestUnusedTicket;

        /**
         * Gets the value of the southwestUnusedTicket property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the southwestUnusedTicket property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSouthwestUnusedTicket().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SouthwestUnusedTicket }
         *
         *
         */
        public List<SouthwestUnusedTicket> getSouthwestUnusedTicket() {
            if (southwestUnusedTicket == null) {
                southwestUnusedTicket = new ArrayList<SouthwestUnusedTicket>();
            }
            return this.southwestUnusedTicket;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TicketAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "recordLocator",
            "ticketAmount",
            "currencyCode",
            "expirationDate"
        })
        public static class SouthwestUnusedTicket {

            @XmlElement(name = "RecordLocator", required = true)
            protected String recordLocator;
            @XmlElement(name = "TicketAmount")
            protected String ticketAmount;
            @XmlElement(name = "CurrencyCode")
            protected String currencyCode;
            @XmlElement(name = "ExpirationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expirationDate;

            /**
             * Obtiene el valor de la propiedad recordLocator.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRecordLocator() {
                return recordLocator;
            }

            /**
             * Define el valor de la propiedad recordLocator.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRecordLocator(String value) {
                this.recordLocator = value;
            }

            /**
             * Obtiene el valor de la propiedad ticketAmount.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTicketAmount() {
                return ticketAmount;
            }

            /**
             * Define el valor de la propiedad ticketAmount.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTicketAmount(String value) {
                this.ticketAmount = value;
            }

            /**
             * Obtiene el valor de la propiedad currencyCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * Define el valor de la propiedad currencyCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * Obtiene el valor de la propiedad expirationDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getExpirationDate() {
                return expirationDate;
            }

            /**
             * Define el valor de la propiedad expirationDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setExpirationDate(XMLGregorianCalendar value) {
                this.expirationDate = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Sponsor" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="NonEmployeeUserType"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Contractor"/&gt;
     *                         &lt;enumeration value="Student/Intern"/&gt;
     *                         &lt;enumeration value="Candidate for Hire"/&gt;
     *                         &lt;enumeration value="Invitational Traveler"/&gt;
     *                         &lt;enumeration value="Dependent/Spouse"/&gt;
     *                         &lt;enumeration value="Board Member"/&gt;
     *                         &lt;enumeration value="Other"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="SponsorshipStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="SponsorshipEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                   &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "sponsor"
    })
    public static class Sponsors {

        @XmlElement(name = "Sponsor")
        protected List<Sponsor> sponsor;

        /**
         * Gets the value of the sponsor property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sponsor property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSponsor().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Sponsor }
         *
         *
         */
        public List<Sponsor> getSponsor() {
            if (sponsor == null) {
                sponsor = new ArrayList<Sponsor>();
            }
            return this.sponsor;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="NonEmployeeUserType"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Contractor"/&gt;
         *               &lt;enumeration value="Student/Intern"/&gt;
         *               &lt;enumeration value="Candidate for Hire"/&gt;
         *               &lt;enumeration value="Invitational Traveler"/&gt;
         *               &lt;enumeration value="Dependent/Spouse"/&gt;
         *               &lt;enumeration value="Board Member"/&gt;
         *               &lt;enumeration value="Other"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SponsorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="SponsorshipStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="SponsorshipEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *         &lt;element name="LoginId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "nonEmployeeUserType",
            "sponsorName",
            "sponsorshipStartDate",
            "sponsorshipEndDate",
            "loginId"
        })
        public static class Sponsor {

            @XmlElement(name = "NonEmployeeUserType", required = true)
            protected String nonEmployeeUserType;
            @XmlElement(name = "SponsorName")
            protected String sponsorName;
            @XmlElement(name = "SponsorshipStartDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar sponsorshipStartDate;
            @XmlElement(name = "SponsorshipEndDate", required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar sponsorshipEndDate;
            @XmlElement(name = "LoginId", required = true)
            protected String loginId;

            /**
             * Obtiene el valor de la propiedad nonEmployeeUserType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNonEmployeeUserType() {
                return nonEmployeeUserType;
            }

            /**
             * Define el valor de la propiedad nonEmployeeUserType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNonEmployeeUserType(String value) {
                this.nonEmployeeUserType = value;
            }

            /**
             * Obtiene el valor de la propiedad sponsorName.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSponsorName() {
                return sponsorName;
            }

            /**
             * Define el valor de la propiedad sponsorName.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSponsorName(String value) {
                this.sponsorName = value;
            }

            /**
             * Obtiene el valor de la propiedad sponsorshipStartDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getSponsorshipStartDate() {
                return sponsorshipStartDate;
            }

            /**
             * Define el valor de la propiedad sponsorshipStartDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setSponsorshipStartDate(XMLGregorianCalendar value) {
                this.sponsorshipStartDate = value;
            }

            /**
             * Obtiene el valor de la propiedad sponsorshipEndDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getSponsorshipEndDate() {
                return sponsorshipEndDate;
            }

            /**
             * Define el valor de la propiedad sponsorshipEndDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setSponsorshipEndDate(XMLGregorianCalendar value) {
                this.sponsorshipEndDate = value;
            }

            /**
             * Obtiene el valor de la propiedad loginId.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLoginId() {
                return loginId;
            }

            /**
             * Define el valor de la propiedad loginId.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLoginId(String value) {
                this.loginId = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Gender" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="Male"/&gt;
     *               &lt;enumeration value="Female"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DateOfBirth" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="NoMiddleName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="PreCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="RedressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "gender",
        "dateOfBirth",
        "noMiddleName",
        "preCheckNumber",
        "redressNumber"
    })
    public static class TSAInfo {

        @XmlElementRef(name = "Gender", type = JAXBElement.class, required = false)
        protected JAXBElement<String> gender;
        @XmlElementRef(name = "DateOfBirth", type = JAXBElement.class, required = false)
        protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
        @XmlElementRef(name = "NoMiddleName", type = JAXBElement.class, required = false)
        protected JAXBElement<Boolean> noMiddleName;
        @XmlElement(name = "PreCheckNumber")
        protected String preCheckNumber;
        @XmlElement(name = "RedressNumber")
        protected String redressNumber;

        /**
         * Obtiene el valor de la propiedad gender.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public JAXBElement<String> getGender() {
            return gender;
        }

        /**
         * Define el valor de la propiedad gender.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *
         */
        public void setGender(JAXBElement<String> value) {
            this.gender = value;
        }

        /**
         * Obtiene el valor de la propiedad dateOfBirth.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *
         */
        public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * Define el valor de la propiedad dateOfBirth.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
         *
         */
        public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
            this.dateOfBirth = value;
        }

        /**
         * Obtiene el valor de la propiedad noMiddleName.
         *
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *
         */
        public JAXBElement<Boolean> getNoMiddleName() {
            return noMiddleName;
        }

        /**
         * Define el valor de la propiedad noMiddleName.
         *
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
         *
         */
        public void setNoMiddleName(JAXBElement<Boolean> value) {
            this.noMiddleName = value;
        }

        /**
         * Obtiene el valor de la propiedad preCheckNumber.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPreCheckNumber() {
            return preCheckNumber;
        }

        /**
         * Define el valor de la propiedad preCheckNumber.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPreCheckNumber(String value) {
            this.preCheckNumber = value;
        }

        /**
         * Obtiene el valor de la propiedad redressNumber.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRedressNumber() {
            return redressNumber;
        }

        /**
         * Define el valor de la propiedad redressNumber.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRedressNumber(String value) {
            this.redressNumber = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Telephone" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Type" use="required"&gt;
     *                   &lt;simpleType&gt;
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                       &lt;enumeration value="Home"/&gt;
     *                       &lt;enumeration value="Work"/&gt;
     *                       &lt;enumeration value="Fax"/&gt;
     *                       &lt;enumeration value="Pager"/&gt;
     *                       &lt;enumeration value="Other"/&gt;
     *                       &lt;enumeration value="Cell"/&gt;
     *                     &lt;/restriction&gt;
     *                   &lt;/simpleType&gt;
     *                 &lt;/attribute&gt;
     *                 &lt;attribute name="ContactOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="PrimaryMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "telephone"
    })
    public static class Telephones {

        @XmlElement(name = "Telephone")
        protected List<Telephone> telephone;

        /**
         * Gets the value of the telephone property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the telephone property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTelephone().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Telephone }
         *
         *
         */
        public List<Telephone> getTelephone() {
            if (telephone == null) {
                telephone = new ArrayList<Telephone>();
            }
            return this.telephone;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="CountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="PhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="Extension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Type" use="required"&gt;
         *         &lt;simpleType&gt;
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *             &lt;enumeration value="Home"/&gt;
         *             &lt;enumeration value="Work"/&gt;
         *             &lt;enumeration value="Fax"/&gt;
         *             &lt;enumeration value="Pager"/&gt;
         *             &lt;enumeration value="Other"/&gt;
         *             &lt;enumeration value="Cell"/&gt;
         *           &lt;/restriction&gt;
         *         &lt;/simpleType&gt;
         *       &lt;/attribute&gt;
         *       &lt;attribute name="ContactOptIn" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="PrimaryMobile" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "countryCode",
            "phoneNumber",
            "extension"
        })
        public static class Telephone {

            @XmlElement(name = "CountryCode")
            protected String countryCode;
            @XmlElement(name = "PhoneNumber", required = true)
            protected String phoneNumber;
            @XmlElement(name = "Extension")
            protected String extension;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "ContactOptIn")
            protected Boolean contactOptIn;
            @XmlAttribute(name = "PrimaryMobile")
            protected Boolean primaryMobile;

            /**
             * Obtiene el valor de la propiedad countryCode.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * Define el valor de la propiedad countryCode.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * Obtiene el valor de la propiedad phoneNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Define el valor de la propiedad phoneNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPhoneNumber(String value) {
                this.phoneNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad extension.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getExtension() {
                return extension;
            }

            /**
             * Define el valor de la propiedad extension.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setExtension(String value) {
                this.extension = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Obtiene el valor de la propiedad contactOptIn.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isContactOptIn() {
                return contactOptIn;
            }

            /**
             * Define el valor de la propiedad contactOptIn.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setContactOptIn(Boolean value) {
                this.contactOptIn = value;
            }

            /**
             * Obtiene el valor de la propiedad primaryMobile.
             *
             * @return
             *     possible object is
             *     {@link Boolean }
             *
             */
            public Boolean isPrimaryMobile() {
                return primaryMobile;
            }

            /**
             * Define el valor de la propiedad primaryMobile.
             *
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *
             */
            public void setPrimaryMobile(Boolean value) {
                this.primaryMobile = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="UnusedTicket" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "unusedTicket"
    })
    public static class UnusedTickets {

        @XmlElement(name = "UnusedTicket")
        protected List<UnusedTicket> unusedTicket;

        /**
         * Gets the value of the unusedTicket property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the unusedTicket property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUnusedTicket().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link UnusedTicket }
         *
         *
         */
        public List<UnusedTicket> getUnusedTicket() {
            if (unusedTicket == null) {
                unusedTicket = new ArrayList<UnusedTicket>();
            }
            return this.unusedTicket;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         *
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="TicketNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="RecordLocator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="BaseFare" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Taxes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Fees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TicketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="ExpirationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "carrier",
            "ticketNumber",
            "recordLocator",
            "baseFare",
            "taxes",
            "fees",
            "currency",
            "ticketType",
            "issueDate",
            "expirationDate",
            "notes"
        })
        public static class UnusedTicket {

            @XmlElement(name = "Carrier", required = true)
            protected String carrier;
            @XmlElement(name = "TicketNumber", required = true)
            protected String ticketNumber;
            @XmlElement(name = "RecordLocator")
            protected String recordLocator;
            @XmlElement(name = "BaseFare")
            protected String baseFare;
            @XmlElement(name = "Taxes")
            protected String taxes;
            @XmlElement(name = "Fees")
            protected String fees;
            @XmlElement(name = "Currency")
            protected String currency;
            @XmlElement(name = "TicketType")
            protected String ticketType;
            @XmlElement(name = "IssueDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar issueDate;
            @XmlElement(name = "ExpirationDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar expirationDate;
            @XmlElement(name = "Notes")
            protected String notes;

            /**
             * Obtiene el valor de la propiedad carrier.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCarrier() {
                return carrier;
            }

            /**
             * Define el valor de la propiedad carrier.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCarrier(String value) {
                this.carrier = value;
            }

            /**
             * Obtiene el valor de la propiedad ticketNumber.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTicketNumber() {
                return ticketNumber;
            }

            /**
             * Define el valor de la propiedad ticketNumber.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTicketNumber(String value) {
                this.ticketNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad recordLocator.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRecordLocator() {
                return recordLocator;
            }

            /**
             * Define el valor de la propiedad recordLocator.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRecordLocator(String value) {
                this.recordLocator = value;
            }

            /**
             * Obtiene el valor de la propiedad baseFare.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getBaseFare() {
                return baseFare;
            }

            /**
             * Define el valor de la propiedad baseFare.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setBaseFare(String value) {
                this.baseFare = value;
            }

            /**
             * Obtiene el valor de la propiedad taxes.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTaxes() {
                return taxes;
            }

            /**
             * Define el valor de la propiedad taxes.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTaxes(String value) {
                this.taxes = value;
            }

            /**
             * Obtiene el valor de la propiedad fees.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFees() {
                return fees;
            }

            /**
             * Define el valor de la propiedad fees.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFees(String value) {
                this.fees = value;
            }

            /**
             * Obtiene el valor de la propiedad currency.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCurrency() {
                return currency;
            }

            /**
             * Define el valor de la propiedad currency.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCurrency(String value) {
                this.currency = value;
            }

            /**
             * Obtiene el valor de la propiedad ticketType.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getTicketType() {
                return ticketType;
            }

            /**
             * Define el valor de la propiedad ticketType.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setTicketType(String value) {
                this.ticketType = value;
            }

            /**
             * Obtiene el valor de la propiedad issueDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getIssueDate() {
                return issueDate;
            }

            /**
             * Define el valor de la propiedad issueDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setIssueDate(XMLGregorianCalendar value) {
                this.issueDate = value;
            }

            /**
             * Obtiene el valor de la propiedad expirationDate.
             *
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public XMLGregorianCalendar getExpirationDate() {
                return expirationDate;
            }

            /**
             * Define el valor de la propiedad expirationDate.
             *
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *
             */
            public void setExpirationDate(XMLGregorianCalendar value) {
                this.expirationDate = value;
            }

            /**
             * Obtiene el valor de la propiedad notes.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getNotes() {
                return notes;
            }

            /**
             * Define el valor de la propiedad notes.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setNotes(String value) {
                this.notes = value;
            }

        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     *
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Visa" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VisaNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="VisaType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;enumeration value="Unknown"/&gt;
     *                         &lt;enumeration value="SE"/&gt;
     *                         &lt;enumeration value="DE"/&gt;
     *                         &lt;enumeration value="ME"/&gt;
     *                         &lt;enumeration value="ES"/&gt;
     *                         &lt;enumeration value="ET"/&gt;
     *                         &lt;enumeration value="SH"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="VisaDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="VisaExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *                   &lt;element name="VisaCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="VisaCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
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
    @XmlType(name = "", propOrder = {
        "visa"
    })
    public static class Visas {

        @XmlElement(name = "Visa")
        protected List<Visa> visa;

        /**
         * Gets the value of the visa property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the visa property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVisa().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Visa }
         *
         *
         */
        public List<Visa> getVisa() {
            if (visa == null) {
                visa = new ArrayList<Visa>();
            }
            return this.visa;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VisaNationality" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VisaNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="VisaType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;enumeration value="Unknown"/&gt;
         *               &lt;enumeration value="SE"/&gt;
         *               &lt;enumeration value="DE"/&gt;
         *               &lt;enumeration value="ME"/&gt;
         *               &lt;enumeration value="ES"/&gt;
         *               &lt;enumeration value="ET"/&gt;
         *               &lt;enumeration value="SH"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="VisaDateIssued" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="VisaExpiration" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
         *         &lt;element name="VisaCityIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="VisaCountryIssued" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "visaNationality",
            "visaNumber",
            "visaType",
            "visaDateIssued",
            "visaExpiration",
            "visaCityIssued",
            "visaCountryIssued"
        })
        public static class Visa {

            @XmlElement(name = "VisaNationality", required = true)
            protected String visaNationality;
            @XmlElement(name = "VisaNumber", required = true)
            protected String visaNumber;
            @XmlElement(name = "VisaType")
            protected String visaType;
            @XmlElementRef(name = "VisaDateIssued", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> visaDateIssued;
            @XmlElementRef(name = "VisaExpiration", type = JAXBElement.class, required = false)
            protected JAXBElement<XMLGregorianCalendar> visaExpiration;
            @XmlElement(name = "VisaCityIssued")
            protected String visaCityIssued;
            @XmlElement(name = "VisaCountryIssued")
            protected String visaCountryIssued;

            /**
             * Obtiene el valor de la propiedad visaNationality.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisaNationality() {
                return visaNationality;
            }

            /**
             * Define el valor de la propiedad visaNationality.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisaNationality(String value) {
                this.visaNationality = value;
            }

            /**
             * Obtiene el valor de la propiedad visaNumber.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisaNumber() {
                return visaNumber;
            }

            /**
             * Define el valor de la propiedad visaNumber.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisaNumber(String value) {
                this.visaNumber = value;
            }

            /**
             * Obtiene el valor de la propiedad visaType.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisaType() {
                return visaType;
            }

            /**
             * Define el valor de la propiedad visaType.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisaType(String value) {
                this.visaType = value;
            }

            /**
             * Obtiene el valor de la propiedad visaDateIssued.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getVisaDateIssued() {
                return visaDateIssued;
            }

            /**
             * Define el valor de la propiedad visaDateIssued.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setVisaDateIssued(JAXBElement<XMLGregorianCalendar> value) {
                this.visaDateIssued = value;
            }

            /**
             * Obtiene el valor de la propiedad visaExpiration.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public JAXBElement<XMLGregorianCalendar> getVisaExpiration() {
                return visaExpiration;
            }

            /**
             * Define el valor de la propiedad visaExpiration.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
             *     
             */
            public void setVisaExpiration(JAXBElement<XMLGregorianCalendar> value) {
                this.visaExpiration = value;
            }

            /**
             * Obtiene el valor de la propiedad visaCityIssued.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisaCityIssued() {
                return visaCityIssued;
            }

            /**
             * Define el valor de la propiedad visaCityIssued.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisaCityIssued(String value) {
                this.visaCityIssued = value;
            }

            /**
             * Obtiene el valor de la propiedad visaCountryIssued.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisaCountryIssued() {
                return visaCountryIssued;
            }

            /**
             * Define el valor de la propiedad visaCountryIssued.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisaCountryIssued(String value) {
                this.visaCountryIssued = value;
            }

        }

    }

}
