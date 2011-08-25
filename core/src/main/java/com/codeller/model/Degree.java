package com.codeller.model;

import java.util.Arrays;
import java.util.List;

/**
 * Enum which describes available education degrees
 * 
 * @author Orest Volkov
 * 
 */
public enum Degree {
	BACHELOR, MASTER, DOCTOR;
	/**
	 * List of available degree values
	 */
	private static List<Degree> degrees = Arrays.asList(values());

	/**
	 * Method for obtaining all available degree values
	 * 
	 * @return List<Degree>
	 */
	public static List<Degree> getAllElements() {
		return degrees;
	}
}
