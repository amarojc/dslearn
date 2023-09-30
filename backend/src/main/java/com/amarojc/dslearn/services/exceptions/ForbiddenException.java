package com.amarojc.dslearn.services.exceptions;

/*
 * Classe será utilizada para retornar o error 403
 * Token válido, mas perfil sem acesso ao recurso.
 *
 */
public class ForbiddenException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ForbiddenException(String msg) {
		super(msg);
	}

}
