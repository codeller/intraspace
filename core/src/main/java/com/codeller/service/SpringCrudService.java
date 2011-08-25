package com.codeller.service;

import java.util.Collection;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.codeller.dao.CrudDao;
import com.codeller.model.Item;

/**
 * Hibernate CRUD service
 * 
 * @author Orest Volkov
 * 
 * @param <T>
 * @param <D>
 */

public abstract class SpringCrudService<T extends Item, D extends CrudDao<T>>
		implements CrudService<T> {
	/**
	 * Gets the dao.
	 * 
	 * @return the dao instance
	 */@Transactional
	public abstract D getDao();

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.service.CrudService#getItem(java.lang.Long)
	 */	
	 @Transactional
	public T getItem(Long id) {
		return getDao().getItemById(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.service.CrudService#getItems()
	 */	
	 @Transactional
	public List<T> getItems() {
		return getDao().getAllItems();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.service.CrudService#addItem(com.legalbistro.model.Item)
	 */
	@Transactional
	public void addItem(T item) {
		getDao().addItem(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.service.CrudService#addItems(java.util.Collection)
	 */
	@Transactional
	public void addItems(Collection<T> items) {
		//getDao().addItems(items);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.service.CrudService#updateItem(com.legalbistro.model.
	 * Item)
	 */
	@Transactional
	public void updateItem(T item) {
		getDao().updateItem(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.service.CrudService#updateItems(java.util.Collection)
	 */
	@Transactional
	public void updateItems(Collection<T> items) {
		for (T item : items) {
			getDao().updateItem(item);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.service.CrudService#deleteItem(com.legalbistro.model.
	 * Item)
	 */
	@Transactional
	public void deleteItem(T item) {
		getDao().deleteItem(item);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.service.CrudService#deleteItem(java.lang.Long)
	 */
	@Transactional
	public void deleteItem(Long id) {
		T itemForDeletion = getDao().getItemById(id);
		if (itemForDeletion != null) {
			getDao().deleteItem(itemForDeletion);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.service.CrudService#deleteItems(java.util.Collection)
	 */
	@Transactional
	public void deleteItems(Collection<T> items) {
		for (T item : items) {
			getDao().deleteItem(item);
		}
	}
}
