package com.ead.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Cartao {
	
	@WebMethod
	public String validarCartao(String numero) {
		if(numero.length()==16) {
			return "Cart�o v�lido: "+numero;
		}
		else {
			return "Cart�o Inv�lido!";
		}
	}

}
