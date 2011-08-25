package com.codeller.model;

/**
 * Interface which describes country
 * 
 * @author Orest Volkov
 * 
 */
public interface Country extends Item {
	/**
	 * Method for obtaining country name
	 * 
	 * @return String
	 */
	String getName();

	/**
	 * Method for setting country name
	 * 
	 * @param String
	 *            name
	 */
	void setName(String name);
}
