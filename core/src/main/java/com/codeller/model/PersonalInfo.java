package com.codeller.model;

import java.util.List;


/**
 * Interface PersonalInfo is used for representing description of an object,
 * which refers to the Personal Information.
 * 
 * @author Orest Volkov
 * 
 */
public interface PersonalInfo<E extends Education> extends Info, Item {
	/**
	 * Method getFirstName() is used for getting first name of the given object.
	 * 
	 * @return String - first name of the given objectcla
	 */
	String getFirstName();

	/**
	 * Method getFirstName() is used for setting first name to the given object.
	 * 
	 * @param firstName
	 *            String - first name of the given object
	 */
	void setFirstName(String firstName);

	/**
	 * Method getLastName() is used for getting last name of the given object.
	 * 
	 * @return String - last name of the given object
	 */
	String getLastName();

	/**
	 * Method setLastName(String lastName) is used for setting last name to the
	 * given object.
	 * 
	 * @param lastName
	 *            String - last name of the given object
	 */
	void setLastName(String lastName);

	/**
	 * Method for getting gender of the given object
	 * 
	 * @return Gender - gender of the given object
	 */
	Gender getGender();

	/**
	 * Method for setting the gender to the given object
	 * 
	 * @param gender
	 *            - gender of the given object
	 */
	void setGender(Gender gender);

	/**
	 * Method for obtaining user's educations
	 * 
	 * @return List<Education> education
	 */
	List<E> getEducations();

	/**
	 * Method for setting educations for user
	 * 
	 * @param List
	 *            <Education> educations
	 */
	void setEducations(List<E> educations);

	/**
	 * Method for adding an educations to user's education list
	 * 
	 * @param Education
	 *            education
	 */
	void addEducation(E education);
}
