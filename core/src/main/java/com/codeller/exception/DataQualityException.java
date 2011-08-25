package com.codeller.exception;

/**
 * Exception class that is native for data quality exceptions
 * 
 * @author Orest Volkov
 * 
 */
public class DataQualityException extends BusinessException {

	public DataQualityException(String message) {
		super(message);
	}

	public DataQualityException(String message, Throwable cause) {
		super(message, cause);
	}

}
