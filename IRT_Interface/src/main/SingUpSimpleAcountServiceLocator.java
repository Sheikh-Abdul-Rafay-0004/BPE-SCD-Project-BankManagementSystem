/**
 * SingUpSimpleAcountServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SingUpSimpleAcountServiceLocator extends org.apache.axis.client.Service implements main.SingUpSimpleAcountService {

    public SingUpSimpleAcountServiceLocator() {
    }


    public SingUpSimpleAcountServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SingUpSimpleAcountServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SingUpSimpleAcount
    private java.lang.String SingUpSimpleAcount_address = "http://localhost:8080/IRT_BANK/services/SingUpSimpleAcount";

    public java.lang.String getSingUpSimpleAcountAddress() {
        return SingUpSimpleAcount_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SingUpSimpleAcountWSDDServiceName = "SingUpSimpleAcount";

    public java.lang.String getSingUpSimpleAcountWSDDServiceName() {
        return SingUpSimpleAcountWSDDServiceName;
    }

    public void setSingUpSimpleAcountWSDDServiceName(java.lang.String name) {
        SingUpSimpleAcountWSDDServiceName = name;
    }

    public main.SingUpSimpleAcount getSingUpSimpleAcount() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SingUpSimpleAcount_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSingUpSimpleAcount(endpoint);
    }

    public main.SingUpSimpleAcount getSingUpSimpleAcount(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SingUpSimpleAcountSoapBindingStub _stub = new main.SingUpSimpleAcountSoapBindingStub(portAddress, this);
            _stub.setPortName(getSingUpSimpleAcountWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSingUpSimpleAcountEndpointAddress(java.lang.String address) {
        SingUpSimpleAcount_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.SingUpSimpleAcount.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SingUpSimpleAcountSoapBindingStub _stub = new main.SingUpSimpleAcountSoapBindingStub(new java.net.URL(SingUpSimpleAcount_address), this);
                _stub.setPortName(getSingUpSimpleAcountWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SingUpSimpleAcount".equals(inputPortName)) {
            return getSingUpSimpleAcount();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SingUpSimpleAcountService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "SingUpSimpleAcount"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SingUpSimpleAcount".equals(portName)) {
            setSingUpSimpleAcountEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
