
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.travelport.service.hotel_v42_0;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T15:54:12.020-06:00
 * Generated source version: 3.1.5
 * 
 */

@javax.jws.WebService(
                      serviceName = "HotelService",
                      portName = "HotelSuperShopperServicePort",
                      targetNamespace = "http://www.travelport.com/service/hotel_v42_0",
                      wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v42/Wsdl/hotel_v42_0/Hotel.wsdl",
                      endpointInterface = "com.travelport.service.hotel_v42_0.HotelSuperShopperServicePortType")
                      
public class HotelSuperShopperServicePortImpl implements HotelSuperShopperServicePortType {

    private static final Logger LOG = Logger.getLogger(HotelSuperShopperServicePortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.travelport.service.hotel_v42_0.HotelSuperShopperServicePortType#service(com.travelport.schema.hotel_v42_0.HotelSuperShopperReq  parameters )*
     */
    public com.travelport.schema.hotel_v42_0.HotelSuperShopperRsp service(com.travelport.schema.hotel_v42_0.HotelSuperShopperReq parameters) throws HotelFaultMessage    { 
        LOG.info("Executing operation service");
        System.out.println(parameters);
        try {
            com.travelport.schema.hotel_v42_0.HotelSuperShopperRsp _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        //throw new HotelFaultMessage("HotelFaultMessage...");
    }

}
