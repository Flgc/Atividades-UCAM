package com.ead.ws;

public class CartaoProxy implements com.ead.ws.Cartao {
  private String _endpoint = null;
  private com.ead.ws.Cartao cartao = null;
  
  public CartaoProxy() {
    _initCartaoProxy();
  }
  
  public CartaoProxy(String endpoint) {
    _endpoint = endpoint;
    _initCartaoProxy();
  }
  
  private void _initCartaoProxy() {
    try {
      cartao = (new com.ead.ws.CartaoServiceLocator()).getCartao();
      if (cartao != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cartao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cartao)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cartao != null)
      ((javax.xml.rpc.Stub)cartao)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.ead.ws.Cartao getCartao() {
    if (cartao == null)
      _initCartaoProxy();
    return cartao;
  }
  
  public java.lang.String validarCartao(java.lang.String numero) throws java.rmi.RemoteException{
    if (cartao == null)
      _initCartaoProxy();
    return cartao.validarCartao(numero);
  }
  
  
}