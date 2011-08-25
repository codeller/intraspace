package com.codeller.model;

/**
 * Interface Info represents main informational object
 * 
 * @author Orest Volkov
 * 
 */
public interface Info {
	/**
	 * Method getInfo returns the value of Info
	 * 
	 * @return String - value of the object description
	 */
	String getInfo();

	/**
	 * Method setInfo - assigns description to given object
	 * 
	 * @param info String - A String which holds description of the given object
	 */
	void setInfo(String info);

}
