package com.codeller.dao;

import java.util.List;

import com.codeller.model.Item;

/**
 * Generic DAO interface
 * 
 * @author Orest Volkov
 * 
 * @param <T>
 *            Generic type for an item from database
 */
public interface CrudDao<T extends Item> extends Dao<T> {
	/**
	 * Method for getting object instance from database by particular id
	 * 
	 * @param id
	 *            Long Item unique id
	 * @return Method returns an item by given id
	 */
	T getItemById(Long id);

	/**
	 * Method for getting all available items from database.
	 * 
	 * @return Method returns a collection of items from database
	 */
	List<T> getAllItems();

	/**
	 * Method for adding new item into database
	 * 
	 * @param item
	 *            Item for persisting
	 */
	void addItem(T item);

	/**
	 * Method for updating an existing item
	 * 
	 * @param item
	 *            Item for updating
	 */
	void updateItem(T item);

	/**
	 * Method for deleting item from database
	 * 
	 * @param item
	 *            Item for deleting
	 */
	void deleteItem(T item);
}
