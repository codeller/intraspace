package com.codeller.model;

/**
 * Interface that describes an entity which can be stored in database
 * 
 * @author Orest Volkov
 * 
 */
public interface Item {

	/**
	 * Method for getting an unique id of item
	 * 
	 * @return Method return Long object id
	 */
	Long getId();

	/**
	 * Method for assigning an id to object
	 * 
	 * @param id Long for assigning to item
	 */
	void setId(Long id);
}