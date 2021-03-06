package com.oracle.xmlns.carassistanceaznu.mediator.mediatorcomponent;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://soabpm-vm:7001//soa-infra/services/default/Mediator/MediatorComponent_ep?WSDL",
  targetNamespace="http://xmlns.oracle.com/CarAssistanceAznu/Mediator/MediatorComponent",
  name="execute_ptt")
@XmlSeeAlso(
  { org.ca.types.ObjectFactory.class, org.example.assistance.ObjectFactory.class })
public interface Execute_ptt
{
  @WebMethod(action="execute")
  @SOAPBinding(parameterStyle=ParameterStyle.BARE)
  @Action(input="execute", output="http://xmlns.oracle.com/CarAssistanceAznu/Mediator/MediatorComponent/execute_ptt/executeResponse")
  @WebResult(targetNamespace="http://www.example.org/assistance",
    partName="reply", name="AssistanceResponse")
  public org.example.assistance.AssistanceResponse execute(@WebParam(targetNamespace="http://www.example.org/assistance",
      partName="request", name="AssistanceRequest")
    org.example.assistance.AssistanceRequest request);
}
