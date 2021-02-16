/**
 * CartaoService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ead.ws;

public interface CartaoService extends javax.xml.rpc.Service {
    public java.lang.String getCartaoAddress();

    public com.ead.ws.Cartao getCartao() throws javax.xml.rpc.ServiceException;

    public com.ead.ws.Cartao getCartao(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
