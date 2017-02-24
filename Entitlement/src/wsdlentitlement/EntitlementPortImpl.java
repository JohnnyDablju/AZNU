package wsdlentitlement;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

import org.ca.types.Car;
import org.ca.types.ObjectFactory;

import org.example.assistance.EntitlementRequest;
import org.example.assistance.EntitlementResponse;
import org.example.assistance.Fault;

@WebService(name = "EntitlementPort", targetNamespace = "urn:WSDLEntitlement", serviceName = "EntitlementService", portName = "EntitlementPort", wsdlLocation = "/WEB-INF/wsdl/EntitlementService.wsdl")
public class EntitlementPortImpl {
    public EntitlementPortImpl() {
    }

    @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
    @Action(input = "urn:WSDLEntitlement/EntitlementOperation", output = "urn:WSDLEntitlement/EntitlementPort/EntitlementOperationResponse", fault = { @FaultAction(className =
                        EntitlementErrorMessage.class, value = "urn:WSDLEntitlement/EntitlementPort/EntitlementOperation/Fault/EntitlementFault") })
    @WebMethod(operationName = "EntitlementOperation", action = "urn:WSDLEntitlement/EntitlementOperation")
    @WebResult(name = "EntitlementResponse", targetNamespace = "http://www.example.org/assistance", partName = "EntitlementOutputMessagePart")
    public EntitlementResponse entitlementOperation(@WebParam(name = "EntitlementRequest", partName = "EntitlementInputMessagePart", targetNamespace = "http://www.example.org/assistance")
        EntitlementRequest EntitlementInputMessagePart) throws EntitlementErrorMessage {
        Car car = EntitlementInputMessagePart.getCar();
        String licensePlate = car.getLicensePlate();
        String make = car.getMake().trim().toLowerCase();
        if (make.equals("seat"))
        {
            Fault fault = new Fault();
            String message = "Cannot retrieve information";
            fault.setMessage(message);
            throw new EntitlementErrorMessage(message, fault);
        }
        
        EntitlementResponse response = new EntitlementResponse();
        if (licensePlate.toLowerCase().startsWith("po"))
        {
            response.setHasEntitlement(true);
        }
        else 
        {
            response.setHasEntitlement(false);
        }
        return response;
    }
}
