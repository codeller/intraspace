package com.codeller.model;

import java.util.List;

/**
 * Interface ContactInfo is used for representing description of an object, which refers to the Contact Information.
 * 
 * @author Orest Volkov
 * 
 */
public interface ContactInfo<A extends PostalAddress> extends Info, Item {
	/**
	 * Method is used for getting List of e-mails of the given user.
	 * 
	 * @return List<String> List of e-mails of the given user.
	 */
	List<String> getEmails();

	/**
	 * Method is used for setting List of e-mails to the given user.
	 * 
	 * @param emails
	 */
	void setEmails(List<String> emails);

	/**
	 * Method is used for getting List of Phone Numbers of the given user.
	 * 
	 * @return List<String> -Phone Numbers of the given user.
	 */
	List<String> getPhoneNumbers();

	/**
	 * Method is used for assigning List of phone numbers to the certain user.
	 * 
	 * @param phoneNumbers List<String> -Phone Numbers of the given user.
	 */
	void setPhoneNumbers(List<String> phoneNumbers);

	/**
	 * Method is used for getting PostalAdress of the given object.
	 * 
	 * @return List<PostalAddress> -List of postal addresses
	 */
	List<A> getAddresses();

	/**
	 * Method is used for setting lists of the addresses to the given object.
	 * 
	 * @param postalAddress -List of postal addresses of the user
	 */
	void setAddresses(List<A> addresses);

}
