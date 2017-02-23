
package org.ca.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Incident complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Incident">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsCrash" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="HasSmoke" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="DoesStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Incident", propOrder = {
    "isCrash",
    "hasSmoke",
    "doesStart"
})
public class Incident {

    @XmlElement(name = "IsCrash")
    protected boolean isCrash;
    @XmlElement(name = "HasSmoke")
    protected boolean hasSmoke;
    @XmlElement(name = "DoesStart")
    protected boolean doesStart;

    /**
     * Gets the value of the isCrash property.
     * 
     */
    public boolean isIsCrash() {
        return isCrash;
    }

    /**
     * Sets the value of the isCrash property.
     * 
     */
    public void setIsCrash(boolean value) {
        this.isCrash = value;
    }

    /**
     * Gets the value of the hasSmoke property.
     * 
     */
    public boolean isHasSmoke() {
        return hasSmoke;
    }

    /**
     * Sets the value of the hasSmoke property.
     * 
     */
    public void setHasSmoke(boolean value) {
        this.hasSmoke = value;
    }

    /**
     * Gets the value of the doesStart property.
     * 
     */
    public boolean isDoesStart() {
        return doesStart;
    }

    /**
     * Sets the value of the doesStart property.
     * 
     */
    public void setDoesStart(boolean value) {
        this.doesStart = value;
    }

}
