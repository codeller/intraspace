package com.codeller.model;

/**
 * Generic Interface describing a message
 * 
 * @author Orest Volkov
 * 
 * @param <A> User - an User
 * @param <I> Info - Information object
 */
public interface Message<A extends User, I extends Info> {
	/**
	 * Method is used to determine Author of the given object.
	 * 
	 * @return A User
	 */
	A getAuthor();

	
	/**
	 * Method is used to determine Information of the given object.
	 * 
	 * @return I Info
	 */
	I getInfo();

	/**
	 * Method is used to determine Header of the given object.
	 * 
	 * @return String -Header
	 */
	String getHeader();
	/**
	 * Method is used to specify Author of the given object.
	 * 
	 * @param A User
	 */
	void setAuthor(A author);
	/**
	 * Method is used to specify Information of the given object.
	 * 
	 * @param I Info
	 */
	void setInfo(I info);
	/**
	 * Method is used to specify Header of the given object.
	 * 
	 * @param String - header
	 */
	void setHeader(String header);
}
