package com.travelport.service.universal_v35_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-05-15T12:42:01.855-06:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "SavedTripDeleteService", 
                  wsdlLocation = "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl",
                  targetNamespace = "http://www.travelport.com/service/universal_v35_0") 
public class SavedTripDeleteService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.travelport.com/service/universal_v35_0", "SavedTripDeleteService");
    public final static QName SavedTripDeleteServicePort = new QName("http://www.travelport.com/service/universal_v35_0", "SavedTripDeleteServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SavedTripDeleteService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Travelport_1/SamplesAutoMation/AutoWork/travelport-uapi-tutorial-v35/Wsdl/universal_v35_0/UniversalRecord.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SavedTripDeleteService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SavedTripDeleteService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SavedTripDeleteService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SavedTripDeleteService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SavedTripDeleteService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SavedTripDeleteService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SavedTripDeleteServicePortType
     */
    @WebEndpoint(name = "SavedTripDeleteServicePort")
    public SavedTripDeleteServicePortType getSavedTripDeleteServicePort() {
        return super.getPort(SavedTripDeleteServicePort, SavedTripDeleteServicePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SavedTripDeleteServicePortType
     */
    @WebEndpoint(name = "SavedTripDeleteServicePort")
    public SavedTripDeleteServicePortType getSavedTripDeleteServicePort(WebServiceFeature... features) {
        return super.getPort(SavedTripDeleteServicePort, SavedTripDeleteServicePortType.class, features);
    }

}