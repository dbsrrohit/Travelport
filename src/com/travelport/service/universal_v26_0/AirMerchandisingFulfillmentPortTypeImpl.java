
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.universal_v26_0;

import java.util.logging.Logger;

/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.310-06:00
 * Generated source version: 2.7.10
 * 
 */

@javax.jws.WebService(
                      serviceName = "AirService",
                      portName = "AirMerchandisingFulfillmentPort",
                      targetNamespace = "http://www.travelport.com/service/universal_v26_0",
                      wsdlLocation = "file:/C:/Travelport/SamplesAutoMation/AutoWork/travelport-uapi-tutorial/wsdl/universal_v26_0/UniversalRecord.wsdl",
                      endpointInterface = "com.travelport.service.universal_v26_0.AirMerchandisingFulfillmentPortType")
                      
public class AirMerchandisingFulfillmentPortTypeImpl implements AirMerchandisingFulfillmentPortType {

    private static final Logger LOG = Logger.getLogger(AirMerchandisingFulfillmentPortTypeImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.universal_v26_0.AirMerchandisingFulfillmentPortType#service(com.travelport.schema.universal_v26_0.AirMerchandisingFulfillmentReq  parameters ,)com.travelport.schema.universal_v26_0.SupportedVersions  supportedVersions )*
     */
    public com.travelport.schema.universal_v26_0.AirMerchandisingFulfillmentRsp service(com.travelport.schema.universal_v26_0.AirMerchandisingFulfillmentReq parameters,com.travelport.schema.universal_v26_0.SupportedVersions supportedVersions) throws AirFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        System.out.println(supportedVersions);
        try {
            com.travelport.schema.universal_v26_0.AirMerchandisingFulfillmentRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new AirFaultMessage("AirFaultMessage...");
    }

}