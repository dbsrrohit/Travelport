
package com.travelport.schema.vehicle_v42_0;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import com.sun.xml.bind.Locatable;
import com.sun.xml.bind.annotation.XmlLocation;
import com.travelport.schema.common_v42_0.PhoneNumber;
import com.travelport.schema.common_v42_0.TypeStructuredAddress;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.cxf.xjc.runtime.JAXBToStringStyle;
import org.xml.sax.Locator;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}LocationAddress" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/common_v42_0}PhoneNumber" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.travelport.com/schema/vehicle_v42_0}OperationTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShuttleInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="CounterLocation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="PreferredOption" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "locationAddress",
    "phoneNumber",
    "operationTime",
    "shuttleInfo"
})
@XmlRootElement(name = "LocationInfo")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
public class LocationInfo
    implements Locatable
{

    @XmlElement(name = "LocationAddress", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected List<TypeStructuredAddress> locationAddress;
    @XmlElement(name = "PhoneNumber", namespace = "http://www.travelport.com/schema/common_v42_0")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected List<PhoneNumber> phoneNumber;
    @XmlElement(name = "OperationTime")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected List<String> operationTime;
    @XmlElement(name = "ShuttleInfo")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String shuttleInfo;
    @XmlAttribute(name = "Name", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String name;
    @XmlAttribute(name = "CounterLocation")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected String counterLocation;
    @XmlAttribute(name = "PreferredOption")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Boolean preferredOption;
    @XmlLocation
    @XmlTransient
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    protected Locator locator;

    /**
     * Gets the value of the locationAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeStructuredAddress }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public List<TypeStructuredAddress> getLocationAddress() {
        if (locationAddress == null) {
            locationAddress = new ArrayList<TypeStructuredAddress>();
        }
        return this.locationAddress;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumber }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public List<PhoneNumber> getPhoneNumber() {
        if (phoneNumber == null) {
            phoneNumber = new ArrayList<PhoneNumber>();
        }
        return this.phoneNumber;
    }

    /**
     * Gets the value of the operationTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public List<String> getOperationTime() {
        if (operationTime == null) {
            operationTime = new ArrayList<String>();
        }
        return this.operationTime;
    }

    /**
     * Gets the value of the shuttleInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getShuttleInfo() {
        return shuttleInfo;
    }

    /**
     * Sets the value of the shuttleInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setShuttleInfo(String value) {
        this.shuttleInfo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the counterLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String getCounterLocation() {
        return counterLocation;
    }

    /**
     * Sets the value of the counterLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setCounterLocation(String value) {
        this.counterLocation = value;
    }

    /**
     * Gets the value of the preferredOption property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Boolean isPreferredOption() {
        return preferredOption;
    }

    /**
     * Sets the value of the preferredOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setPreferredOption(Boolean value) {
        this.preferredOption = value;
    }

    /**
     * Generates a String representation of the contents of this type.
     * This is an extension method, produced by the 'ts' xjc plugin
     * 
     */
    @Override
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public String toString() {
        return ToStringBuilder.reflectionToString(this, JAXBToStringStyle.MULTI_LINE_STYLE);
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public Locator sourceLocation() {
        return locator;
    }

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2017-07-31T03:56:32-06:00", comment = "JAXB RI v2.2.11")
    public void setSourceLocation(Locator newLocator) {
        locator = newLocator;
    }

}
