//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.3 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.04.15 at 10:20:40 AM BST 
//


package net.sourceforge.segment.srx.io.bind;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.lisa.org/srx20}languagerules"/>
 *         &lt;element ref="{http://www.lisa.org/srx20}maprules"/>
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
    "languagerules",
    "maprules"
})
@XmlRootElement(name = "body")
public class Body {

    @XmlElement(required = true)
    protected Languagerules languagerules;
    @XmlElement(required = true)
    protected Maprules maprules;

    /**
     * Gets the value of the languagerules property.
     * 
     * @return
     *     possible object is
     *     {@link Languagerules }
     *     
     */
    public Languagerules getLanguagerules() {
        return languagerules;
    }

    /**
     * Sets the value of the languagerules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Languagerules }
     *     
     */
    public void setLanguagerules(Languagerules value) {
        this.languagerules = value;
    }

    /**
     * Gets the value of the maprules property.
     * 
     * @return
     *     possible object is
     *     {@link Maprules }
     *     
     */
    public Maprules getMaprules() {
        return maprules;
    }

    /**
     * Sets the value of the maprules property.
     * 
     * @param value
     *     allowed object is
     *     {@link Maprules }
     *     
     */
    public void setMaprules(Maprules value) {
        this.maprules = value;
    }

}