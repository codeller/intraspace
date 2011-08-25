package com.codeller.model;

import java.util.List;

/**
 * 
 * @author Orest Volkov
 * 
 * @param <E>
 */
public interface Catalog<E> extends Item {
	List<E> getElements();

	void addElement(E e);

	void removeElement(E e);
}
