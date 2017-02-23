package wsdlcarriage;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.datatype.XMLGregorianCalendar;

import org.ca.types.ObjectFactory;

import org.example.assistance.CarriageRequest;
import org.example.assistance.HelpResponse;
import java.util.Date;

import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

import org.example.assistance.Fault;

@WebService(name = "CarriagePort", targetNamespace = "urn:WSDLCarriage", serviceName = "CarriageService", portName = "CarriagePort", wsdlLocation = "/WEB-INF/wsdl/CarriageService.wsdl")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, parameterStyle = SOAPBinding.ParameterStyle.BARE)
public class CarriagePortImpl {
    public CarriagePortImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "urn:WSDLCarriage/CarriageOperation", output = "urn:WSDLCarriage/CarriagePort/CarriageOperationResponse", fault = { @FaultAction(className =
                        CarriageErrorMessage.class, value = "urn:WSDLCarriage/CarriagePort/CarriageOperation/Fault/CarriageFault") })
    @WebMethod(operationName = "CarriageOperation", action = "urn:WSDLCarriage/CarriageOperation")
    @WebResult(name = "HelpResponse", targetNamespace = "http://www.example.org/assistance", partName = "CarriageOutputMessagePart")
    public HelpResponse carriageOperation(@WebParam(name = "CarriageRequest", partName = "CarriageInputMessagePart", targetNamespace = "http://www.example.org/assistance")
        CarriageRequest CarriageInputMessagePart) throws CarriageErrorMessage {
        HelpResponse response = new HelpResponse();
        try 
        {
            response.setMessage("Carriage has been sent.");
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(new Date());
            response.setTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(gc));
        }
        catch (DatatypeConfigurationException ex)
        {
            Fault fault = new Fault();
            String message = "Cannot retrieve information";
            fault.setMessage(message);
            throw new CarriageErrorMessage(message, fault);
        }
        return response;
    }
}
