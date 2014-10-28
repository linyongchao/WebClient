/**
 * UploadServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service.impl;

public class UploadServiceImplServiceLocator extends org.apache.axis.client.Service implements service.impl.UploadServiceImplService {

	private static final long serialVersionUID = 1L;

	public UploadServiceImplServiceLocator() {
    }


    public UploadServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UploadServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UploadServiceImplPort
    private java.lang.String UploadServiceImplPort_address = "http://112.64.16.63:8080/celloud/uploadService";

    public java.lang.String getUploadServiceImplPortAddress() {
        return UploadServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UploadServiceImplPortWSDDServiceName = "UploadServiceImplPort";

    public java.lang.String getUploadServiceImplPortWSDDServiceName() {
        return UploadServiceImplPortWSDDServiceName;
    }

    public void setUploadServiceImplPortWSDDServiceName(java.lang.String name) {
        UploadServiceImplPortWSDDServiceName = name;
    }

    public service.IUploadService getUploadServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UploadServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUploadServiceImplPort(endpoint);
    }

    public service.IUploadService getUploadServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            service.impl.UploadServiceImplPortBindingStub _stub = new service.impl.UploadServiceImplPortBindingStub(portAddress, this);
            _stub.setPortName(getUploadServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUploadServiceImplPortEndpointAddress(java.lang.String address) {
        UploadServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (service.IUploadService.class.isAssignableFrom(serviceEndpointInterface)) {
                service.impl.UploadServiceImplPortBindingStub _stub = new service.impl.UploadServiceImplPortBindingStub(new java.net.URL(UploadServiceImplPort_address), this);
                _stub.setPortName(getUploadServiceImplPortWSDDServiceName());
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
        if ("UploadServiceImplPort".equals(inputPortName)) {
            return getUploadServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.service.nova.com/", "UploadServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.service.nova.com/", "UploadServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UploadServiceImplPort".equals(portName)) {
            setUploadServiceImplPortEndpointAddress(address);
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
