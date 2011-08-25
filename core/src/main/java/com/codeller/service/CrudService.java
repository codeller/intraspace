package com.codeller.service;

import java.util.Collection;
import java.util.List;

import com.codeller.exception.ObjectUndefinedException;
import com.codeller.model.Item;

/**
 * CRUD service
 * 
 * @author Orest Volkov
 * 
 * @param <T>
 */

public interface CrudService<T extends Item> extends Service<T> {
	/**
	 * Method obtains an item from data store by a particular identifier
	 * 
	 * @param Id
	 *            Item id
	 * @return T Method returns an item
	 */
	public T getItem(Long Id) throws ObjectUndefinedException;

	/**
	 * Method for obtaining all persisting items from data store
	 * 
	 * @return List<T> Method returns a list of items from data store
	 */
	public List<T> getItems();

	/**
	 * Method for adding item into a data store
	 * 
	 * @param item
	 *            Item that should be inserted
	 */
	public void addItem(T item);

	/**
	 * Method for adding a collection of new items into database
	 * 
	 * @param item
	 *            Item that should be added into database
	 */
	public void addItems(Collection<T> items);

	/**
	 * Method for updating an item
	 * 
	 * @param item
	 *            Item that should be saved
	 */
	public void updateItem(T item);

	/**
	 * Method for updating a collection of items in a data store
	 * 
	 * @param items
	 *            Collection of items that should be saved
	 */
	public void updateItems(Collection<T> items);

	/**
	 * Method for deletion an item from data store by particular id
	 * 
	 * @param id
	 *            Unique identifier of the item that should be deleted
	 */
	public void deleteItem(Long id);

	/**
	 * Method item deletion from data store
	 * 
	 * @param item
	 *            Item that should be deleted
	 */
	public void deleteItem(T item);

	/**
	 * Method for batch deletion from data store
	 * 
	 * @param items
	 *            Collection of items to be deleted
	 */
	public void deleteItems(Collection<T> items);
}
