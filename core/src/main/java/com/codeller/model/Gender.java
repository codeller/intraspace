package com.codeller.model;

import java.util.Arrays;
import java.util.List;

/**
 * Enum is used to specify human genders
 * 
 * @author Orest Volkov
 * 
 */
public enum Gender {
	M, F;
	/**
	 * Holds list of all Gender values
	 */
	private static List<Gender> genders = Arrays.asList(values());

	/**
	 * Method is used to determine list of all Gender values
	 * 
	 * @return List<Gender>
	 */
	public static List<Gender> getAllElements() {
		return genders;
	}
}
