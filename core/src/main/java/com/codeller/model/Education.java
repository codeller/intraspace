package com.codeller.model;

/**
 * 
 * Intergace describes education of a user
 * 
 */
public interface Education extends Item {
	/**
	 * 
	 * @return highSchool String Name of the high school
	 */
	String getHighSchool();

	/**
	 * 
	 * @param highSchool
	 *            String Name of the high school
	 */
	void setHighSchool(String highSchool);

	/**
	 * Method for obtaining education degree
	 * 
	 * @return Degree - element of enum degree
	 */
	Degree getDegree();

	/**
	 * Method for setting education degree
	 * 
	 * @param Degree
	 *            degree - element of enum Degree
	 */
	void setDegree(Degree degree);
}