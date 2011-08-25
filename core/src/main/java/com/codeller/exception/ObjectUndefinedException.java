package com.codeller.exception;

import java.util.Arrays;

/**
 * Exception which should be thrown in cases when searched object does not exists in store
 * 
 * @author Orest Volkov
 * 
 */
public class ObjectUndefinedException extends DataQualityException {

	private static final String DEFAULT_MESSAGE = "Object does not exists in store";
	private static final String NOT_EXISTS_FOR_PROPERTIES_MESSAGE = "Object does not exists in store for search properties: ";

	public ObjectUndefinedException(Object... properties) {
		super(NOT_EXISTS_FOR_PROPERTIES_MESSAGE + Arrays.asList(properties));
	}

}
