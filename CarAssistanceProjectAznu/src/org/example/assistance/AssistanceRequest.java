
package org.example.assistance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.ca.types.Car;
import org.ca.types.Incident;
import org.ca.types.Location;
import org.ca.types.Person;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Location" type="{http://www.ca.org/types}Location"/>
 *         &lt;element name="Car" type="{http://www.ca.org/types}Car"/>
 *         &lt;element name="Person" type="{http://www.ca.org/types}Person"/>
 *         &lt;element name="Incident" type="{http://www.ca.org/types}Incident"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "location",
    "car",
    "person",
    "incident"
})
@XmlRootElement(name = "AssistanceRequest")
public class AssistanceRequest {

    @XmlElement(name = "Location", required = true)
    protected Location location;
    @XmlElement(name = "Car", required = true)
    protected Car car;
    @XmlElement(name = "Person", required = true)
    protected Person person;
    @XmlElement(name = "Incident", required = true)
    protected Incident incident;

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the car property.
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
     * Sets the value of the car property.
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
     * Gets the value of the person property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getPerson() {
        return person;
    }

    /**
     * Sets the value of the person property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setPerson(Person value) {
        this.person = value;
    }

    /**
     * Gets the value of the incident property.
     * 
     * @return
     *     possible object is
     *     {@link Incident }
     *     
     */
    public Incident getIncident() {
        return incident;
    }

    /**
     * Sets the value of the incident property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incident }
     *     
     */
    public void setIncident(Incident value) {
        this.incident = value;
    }

}
