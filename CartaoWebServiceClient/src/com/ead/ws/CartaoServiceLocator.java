/**
 * CartaoServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ead.ws;

public class CartaoServiceLocator extends org.apache.axis.client.Service implements com.ead.ws.CartaoService {

    public CartaoServiceLocator() {
    }


    public CartaoServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CartaoServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Cartao
    private java.lang.String Cartao_address = "http://localhost:8080/CartaoWebService/services/Cartao";

    public java.lang.String getCartaoAddress() {
        return Cartao_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CartaoWSDDServiceName = "Cartao";

    public java.lang.String getCartaoWSDDServiceName() {
        return CartaoWSDDServiceName;
    }

    public void setCartaoWSDDServiceName(java.lang.String name) {
        CartaoWSDDServiceName = name;
    }

    public com.ead.ws.Cartao getCartao() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Cartao_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCartao(endpoint);
    }

    public com.ead.ws.Cartao getCartao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ead.ws.CartaoSoapBindingStub _stub = new com.ead.ws.CartaoSoapBindingStub(portAddress, this);
            _stub.setPortName(getCartaoWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCartaoEndpointAddress(java.lang.String address) {
        Cartao_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ead.ws.Cartao.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ead.ws.CartaoSoapBindingStub _stub = new com.ead.ws.CartaoSoapBindingStub(new java.net.URL(Cartao_address), this);
                _stub.setPortName(getCartaoWSDDServiceName());
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
        if ("Cartao".equals(inputPortName)) {
            return getCartao();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.ead.com", "CartaoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.ead.com", "Cartao"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Cartao".equals(portName)) {
            setCartaoEndpointAddress(address);
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
