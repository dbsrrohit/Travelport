
package com.travelport.service.universal_v26_0;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.10
 * 2014-04-08T11:02:25.211-06:00
 * Generated source version: 2.7.10
 */

@WebFault(name = "UniversalModifyErrorInfo", targetNamespace = "http://www.travelport.com/schema/universal_v26_0")
public class UniversalModifyFaultMessage extends Exception {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private com.travelport.schema.universal_v26_0.UniversalModifyErrorInfo universalModifyErrorInfo;

    public UniversalModifyFaultMessage() {
        super();
    }
    
    public UniversalModifyFaultMessage(String message) {
        super(message);
    }
    
    public UniversalModifyFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public UniversalModifyFaultMessage(String message, com.travelport.schema.universal_v26_0.UniversalModifyErrorInfo universalModifyErrorInfo) {
        super(message);
        this.universalModifyErrorInfo = universalModifyErrorInfo;
    }

    public UniversalModifyFaultMessage(String message, com.travelport.schema.universal_v26_0.UniversalModifyErrorInfo universalModifyErrorInfo, Throwable cause) {
        super(message, cause);
        this.universalModifyErrorInfo = universalModifyErrorInfo;
    }

    public com.travelport.schema.universal_v26_0.UniversalModifyErrorInfo getFaultInfo() {
        return this.universalModifyErrorInfo;
    }
}