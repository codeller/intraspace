package com.codeller.model;

import java.util.List;

/**
 * Interface Organization describes main information about an organization.
 * 
 * @author Orest Volkov
 * 
 */
public interface Organization {
	/**
	 * Method is used to determine name of the organization.
	 * 
	 * @return String - name of the organization.
	 */
	String getName();

	/**
	 * Method is used to specify name of the organization.
	 * 
	 * @param name - String name of the organization.
	 */
	void setName(String name);

	/**
	 * Method is used to determine list of postal addresses of the organization.
	 * 
	 * @return List<PostalAddress> -list of postal addresses of the organization.
	 */
	List<PostalAddress> getAddresses();

	/**
	 * Method is used to specify list of postal addresses of the organization.
	 * 
	 * @param addresses -List<PostalAddress> -list of postal addresses of the organization.
	 */
	void setAddresses(List<PostalAddress> addresses);

	/**
	 * Method is used to determine list of phone numbers of the organization.
	 * 
	 * @return List<String> - list of phone numbers of the organization.
	 */
	List<String> getPhoneNumbers();

	/**
	 * Method is used to specify list of phone numbers of the organization
	 * 
	 * @param phoneNumbers -List<String> - list of phone numbers of the organization.
	 */
	void setPhoneNumbers(List<String> phoneNumbers);

}
