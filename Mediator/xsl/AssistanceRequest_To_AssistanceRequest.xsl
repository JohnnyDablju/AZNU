<?xml version="1.0" encoding="UTF-8" ?>
<?oracle-xsl-mapper
  <!-- SPECIFICATION OF MAP SOURCES AND TARGETS, DO NOT MODIFY. -->
  <mapSources>
    <source type="WSDL">
      <schema location="../MediatorComponent.wsdl"/>
      <rootElement name="AssistanceRequest" namespace="http://www.example.org/assistance"/>
    </source>
  </mapSources>
  <mapTargets>
    <target type="WSDL">
      <schema location="http://soabpm-vm.site:7001/soa-infra/services/default/Process/BPELProcess.wsdl"/>
      <rootElement name="AssistanceRequest" namespace="http://www.example.org/assistance"/>
    </target>
  </mapTargets>
  <!-- GENERATED BY ORACLE XSL MAPPER 11.1.1.7.0(build 130301.0647.0008) AT [THU FEB 23 13:49:53 PST 2017]. -->
?>
<xsl:stylesheet version="1.0"
                xmlns:xp20="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.Xpath20"
                xmlns:bpws="http://schemas.xmlsoap.org/ws/2003/03/business-process/"
                xmlns:bpel="http://docs.oasis-open.org/wsbpel/2.0/process/executable"
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                xmlns:bpm="http://xmlns.oracle.com/bpmn20/extensions"
                xmlns:plnk="http://schemas.xmlsoap.org/ws/2003/05/partner-link/"
                xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/"
                xmlns:ora="http://schemas.oracle.com/xpath/extension"
                xmlns:ns0="http://www.ca.org/types"
                xmlns:socket="http://www.oracle.com/XSL/Transform/java/oracle.tip.adapter.socket.ProtocolTranslator"
                xmlns:mhdr="http://www.oracle.com/XSL/Transform/java/oracle.tip.mediator.service.common.functions.MediatorExtnFunction"
                xmlns:oraext="http://www.oracle.com/XSL/Transform/java/oracle.tip.pc.services.functions.ExtFunc"
                xmlns:dvm="http://www.oracle.com/XSL/Transform/java/oracle.tip.dvm.LookupValue"
                xmlns:hwf="http://xmlns.oracle.com/bpel/workflow/xpath"
                xmlns:client="http://xmlns.oracle.com/CarAssistanceAznu/Process/BPELProcess"
                xmlns:med="http://schemas.oracle.com/mediator/xpath"
                xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
                xmlns:ids="http://xmlns.oracle.com/bpel/services/IdentityService/xpath"
                xmlns:xdk="http://schemas.oracle.com/bpel/extension/xpath/function/xdk"
                xmlns:tns="http://xmlns.oracle.com/CarAssistanceAznu/Mediator/MediatorComponent"
                xmlns:xref="http://www.oracle.com/XSL/Transform/java/oracle.tip.xref.xpath.XRefXPathFunctions"
                xmlns:xsd="http://www.w3.org/2001/XMLSchema"
                xmlns:inp1="http://www.example.org/assistance"
                xmlns:bpmn="http://schemas.oracle.com/bpm/xpath"
                xmlns:ldap="http://schemas.oracle.com/xpath/extension/ldap"
                exclude-result-prefixes="xsi xsl wsdl ns0 tns xsd inp1 plnk client xp20 bpws bpel bpm ora socket mhdr oraext dvm hwf med ids xdk xref bpmn ldap">
  <xsl:template match="/">
    <inp1:AssistanceRequest>
      <inp1:Location>
        <ns0:City>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Location/ns0:City"/>
        </ns0:City>
        <ns0:Street>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Location/ns0:Street"/>
        </ns0:Street>
      </inp1:Location>
      <inp1:Car>
        <ns0:Make>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Car/ns0:Make"/>
        </ns0:Make>
        <ns0:Model>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Car/ns0:Model"/>
        </ns0:Model>
        <ns0:LicensePlate>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Car/ns0:LicensePlate"/>
        </ns0:LicensePlate>
      </inp1:Car>
      <inp1:Person>
        <ns0:FirstName>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Person/ns0:FirstName"/>
        </ns0:FirstName>
        <ns0:LastName>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Person/ns0:LastName"/>
        </ns0:LastName>
      </inp1:Person>
      <inp1:Incident>
        <ns0:IsCrash>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Incident/ns0:IsCrash"/>
        </ns0:IsCrash>
        <ns0:HasSmoke>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Incident/ns0:HasSmoke"/>
        </ns0:HasSmoke>
        <ns0:DoesStart>
          <xsl:value-of select="/inp1:AssistanceRequest/inp1:Incident/ns0:DoesStart"/>
        </ns0:DoesStart>
      </inp1:Incident>
    </inp1:AssistanceRequest>
  </xsl:template>
</xsl:stylesheet>