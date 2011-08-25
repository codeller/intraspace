package com.codeller.model;

/**
 * Interface which describes an administrative unity of the first level
 * (state,region,province etc)
 * 
 * @author Orest Volkov
 * 
 */
public interface State extends Item {
	/**
	 * Method for obtaining state name
	 * 
	 * @return String
	 */
	String getName();

	/**
	 * Method for setting state name
	 * 
	 * @param name
	 */
	void setName(String name);

	/**
	 * Method for obtaining country which state is belonged to
	 * 
	 * @return Country country
	 */
	Country getCountry();

	/**
	 * Method for setting country which state is belonged to
	 * 
	 * @param Country
	 *            country
	 */
	void setCountry(Country country);
}
