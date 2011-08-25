package com.codeller.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.codeller.model.Item;
import com.codeller.util.ContextUtil;

/**
 * Implementation of CrudDao interface
 * 
 * @author Orest Volkov
 * 
 */
public abstract class HibernateCrudDao<T extends Item> implements CrudDao<T> {

	protected Class<T> itemClass;

	/**
	 * public constructor
	 * 
	 */
	public HibernateCrudDao() {
		this.itemClass = getPersistentClass();
	}

	/**
	 * Current hibernate session
	 */
	protected SessionFactory getSessionFactory() {
		return ContextUtil.getSessionFactory();
	}

	/**
	 * Method for obtaining current hibernate session
	 * 
	 * @return Method returns an instance of current hibernate connection
	 *         session
	 */
	protected Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	/**
	 * Method for adding object instance into database
	 * 
	 * @param item
	 *            T item for persisting
	 */
	@Transactional
	public void addItem(T item) {
		getSession().save(item);
	}

	/**
	 * Method for updating object instance from database
	 * 
	 * @param item
	 *            T item for updating
	 */
	@Transactional
	public void updateItem(T item) {
		getSession().update(item);
	}

	/**
	 * Method for deleting object instance from database
	 * 
	 * @param item
	 *            T item for deleting
	 */
	@Transactional
	public void deleteItem(T item) {
		getSession().delete(item);
	}

	/**
	 * Method for obtaining all available items from database
	 * 
	 * @return Method returns a collection of items from database
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public List<T> getAllItems() {
		return getSession().createCriteria(itemClass).list();
	}

	/**
	 * Method for obtaining an item from database by the particular id
	 * 
	 * @return Method returns an item Item by given id Long from database
	 */
	@SuppressWarnings("unchecked")
	@Transactional
	public T getItemById(Long id) {
		return (T) getSession().get(itemClass, id);
	}

	/**
	 * Method for obtaining class type of generic parameter(i.e T.class)
	 * 
	 * @return Method returns Class<T> type of first class parameter
	 */
	@SuppressWarnings("unchecked")
	private final Class<T> getPersistentClass() {
		Class<T> persistentClass = null;
		Type genericType = getClass().getGenericSuperclass();
		if (genericType instanceof ParameterizedType) {
			ParameterizedType pType = ((ParameterizedType) genericType);
			// obtaining first generic type class
			persistentClass = (Class<T>) pType.getActualTypeArguments()[0];
		}
		return persistentClass;
	}
}
