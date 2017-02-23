package wsdlmobilehelp;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import org.ca.types.ObjectFactory;

import org.example.assistance.Fault;
import org.example.assistance.HelpResponse;
import org.example.assistance.MobileHelpRequest;

@WebService(name = "MobileHelpPort", targetNamespace = "urn:WSDLMobileHelp", serviceName = "MobileHelpService", portName = "MobileHelpPort", wsdlLocation = "/WEB-INF/wsdl/MobileHelpService.wsdl")
public class MobileHelpPortImpl {
    public MobileHelpPortImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "urn:WSDLMobileHelp/MobileHelpOperation", output = "urn:WSDLMobileHelp/MobileHelpPort/MobileHelpOperationResponse", fault = { @FaultAction(className =
                        MobileHelpErrorMessage.class, value = "urn:WSDLMobileHelp/MobileHelpPort/MobileHelpOperation/Fault/MobileHelpFault") })
    @WebMethod(operationName = "MobileHelpOperation", action = "urn:WSDLMobileHelp/MobileHelpOperation")
    @WebResult(name = "HelpResponse", targetNamespace = "http://www.example.org/assistance", partName = "MobileHelpOutputMessagePart")
    public HelpResponse mobileHelpOperation(@WebParam(name = "MobileHelpRequest", partName = "MobileHelpInputMessagePart", targetNamespace = "http://www.example.org/assistance")
        MobileHelpRequest MobileHelpInputMessagePart) throws MobileHelpErrorMessage {
        HelpResponse response = new HelpResponse();
        try 
        {
            response.setMessage("Mobile help has been sent.");
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            response.setTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        }
        catch (DatatypeConfigurationException ex)
        {
            Fault fault = new Fault();
            String message = "Cannot retrieve information";
            fault.setMessage(message);
            throw new MobileHelpErrorMessage(message, fault);
        }
        return response;
    }
}
