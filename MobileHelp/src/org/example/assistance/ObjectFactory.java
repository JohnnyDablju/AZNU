
package org.example.assistance;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.assistance package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.assistance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarriageRequest }
     * 
     */
    public CarriageRequest createCarriageRequest() {
        return new CarriageRequest();
    }

    /**
     * Create an instance of {@link MobileHelpRequest }
     * 
     */
    public MobileHelpRequest createMobileHelpRequest() {
        return new MobileHelpRequest();
    }

    /**
     * Create an instance of {@link EntitlementResponse }
     * 
     */
    public EntitlementResponse createEntitlementResponse() {
        return new EntitlementResponse();
    }

    /**
     * Create an instance of {@link HelpResponse }
     * 
     */
    public HelpResponse createHelpResponse() {
        return new HelpResponse();
    }

    /**
     * Create an instance of {@link EntitlementRequest }
     * 
     */
    public EntitlementRequest createEntitlementRequest() {
        return new EntitlementRequest();
    }

    /**
     * Create an instance of {@link AssistanceResponse }
     * 
     */
    public AssistanceResponse createAssistanceResponse() {
        return new AssistanceResponse();
    }

    /**
     * Create an instance of {@link AssistanceRequest }
     * 
     */
    public AssistanceRequest createAssistanceRequest() {
        return new AssistanceRequest();
    }

    /**
     * Create an instance of {@link Fault }
     * 
     */
    public Fault createFault() {
        return new Fault();
    }

}
