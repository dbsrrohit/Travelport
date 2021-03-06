
package com.travelport.service.util_v42_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.1.5
 * 2017-07-31T16:06:30.466-06:00
 * Generated source version: 3.1.5
 */

@WebFault(name = "ErrorInfo", targetNamespace = "http://www.travelport.com/schema/common_v42_0")
public class UtilFaultMessage extends Exception {
    
    private com.travelport.schema.common_v42_0.ErrorInfo errorInfo;

    public UtilFaultMessage() {
        super();
    }
    
    public UtilFaultMessage(String message) {
        super(message);
    }
    
    public UtilFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UtilFaultMessage(String message, com.travelport.schema.common_v42_0.ErrorInfo errorInfo) {
        super(message);
        this.errorInfo = errorInfo;
    }

    public UtilFaultMessage(String message, com.travelport.schema.common_v42_0.ErrorInfo errorInfo, Throwable cause) {
        super(message, cause);
        this.errorInfo = errorInfo;
    }

    public com.travelport.schema.common_v42_0.ErrorInfo getFaultInfo() {
        return this.errorInfo;
    }
}
