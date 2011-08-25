package com.codeller.model;

/**
 * Interface PostalAddress is used for describing a postal address
 * 
 * @author Orest Volkov
 * 
 */
public interface PostalAddress {
	/**
	 * Method is used to determine Street number of the given object
	 * 
	 * @return -String Street number of the given object
	 */
	String getStreetNumber();

	/**
	 * Method is used to specify Street number of the given object
	 * 
	 * @param streetNumber -String, Street number of the given object
	 */
	void setStreetNumber(String streetNumber);

	/**
	 * Method is used to determine Street name of the given object
	 * 
	 * @return String-Street name of the given object
	 */
	String getStreetName();

	/**
	 * Method is used to specify Street name of the given object
	 * 
	 * @param streetName -String, Street name of the given object
	 */
	void setStreetName(String streetName);

	/**
	 * Method is used to determine country of the given object
	 * 
	 * @return String -country of the given object
	 */
	State getState();

	/**
	 * Method is used to specify country of the given object
	 * 
	 * @param country String -country
	 */
	void setState(State state);

	/**
	 * Method is used to determine zip-code of the given object
	 * 
	 * @return String - zip-code of the given object
	 */
	String getZipCode();

	/**
	 * Method is used to specify zip-code of the given object
	 * 
	 * @param zipCode -String, zip-code of the given object
	 */
	void setZipCode(String zipCode);
}
