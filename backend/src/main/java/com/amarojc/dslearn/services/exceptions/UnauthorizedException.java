package com.amarojc.dslearn.services.exceptions;

/*
 * Classe será utilizada para retornar o error 401
 * Token não autorizado
 */
public class UnauthorizedException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public UnauthorizedException(String msg) {
		super(msg);
	}

}
