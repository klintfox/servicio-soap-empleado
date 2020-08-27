
package com.servicio.empleado_ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "EmpleadosPortService", targetNamespace = "http://www.servicio.com/empleado-ws", wsdlLocation = "http://localhost:8080/ws/empleados.wsdl")
public class EmpleadosPortService
    extends Service
{

    private final static URL EMPLEADOSPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException EMPLEADOSPORTSERVICE_EXCEPTION;
    private final static QName EMPLEADOSPORTSERVICE_QNAME = new QName("http://www.servicio.com/empleado-ws", "EmpleadosPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/empleados.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EMPLEADOSPORTSERVICE_WSDL_LOCATION = url;
        EMPLEADOSPORTSERVICE_EXCEPTION = e;
    }

    public EmpleadosPortService() {
        super(__getWsdlLocation(), EMPLEADOSPORTSERVICE_QNAME);
    }

    public EmpleadosPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EMPLEADOSPORTSERVICE_QNAME, features);
    }

    public EmpleadosPortService(URL wsdlLocation) {
        super(wsdlLocation, EMPLEADOSPORTSERVICE_QNAME);
    }

    public EmpleadosPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EMPLEADOSPORTSERVICE_QNAME, features);
    }

    public EmpleadosPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpleadosPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns EmpleadosPort
     */
    @WebEndpoint(name = "EmpleadosPortSoap11")
    public EmpleadosPort getEmpleadosPortSoap11() {
        return super.getPort(new QName("http://www.servicio.com/empleado-ws", "EmpleadosPortSoap11"), EmpleadosPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpleadosPort
     */
    @WebEndpoint(name = "EmpleadosPortSoap11")
    public EmpleadosPort getEmpleadosPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.servicio.com/empleado-ws", "EmpleadosPortSoap11"), EmpleadosPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EMPLEADOSPORTSERVICE_EXCEPTION!= null) {
            throw EMPLEADOSPORTSERVICE_EXCEPTION;
        }
        return EMPLEADOSPORTSERVICE_WSDL_LOCATION;
    }

}
