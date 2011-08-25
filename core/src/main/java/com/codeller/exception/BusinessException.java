package com.codeller.exception;

/**
 * Exception class that is native for business exceptions
 * 
 * @author Orest Volkov
 * 
 */
public class BusinessException extends Throwable {

	public BusinessException(String message) {
		super(message);
	}

	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}
}
