package com.codeller.exception;

/**
 * Exception class that is native for data validation exceptions
 * 
 * @author Orest Volkov
 * 
 */
public class DataValidationException extends BusinessException {

	public DataValidationException(String message) {
		super(message);
	}

	public DataValidationException(String message, Throwable cause) {
		super(message, cause);
	}

}
