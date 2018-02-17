
package sk.kopr.ajs.klient;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "SubjectExist", targetNamespace = "urn:X-kopr")
public class SubjectExist_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private SubjectExist faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public SubjectExist_Exception(String message, SubjectExist faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public SubjectExist_Exception(String message, SubjectExist faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: sk.kopr.ajs.klient.SubjectExist
     */
    public SubjectExist getFaultInfo() {
        return faultInfo;
    }

}