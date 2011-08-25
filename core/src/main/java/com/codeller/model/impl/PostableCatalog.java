package com.codeller.model.impl;

import java.util.List;

import javax.persistence.MappedSuperclass;

import com.codeller.model.Catalog;

/**
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class PostableCatalog<E> extends PostImpl implements Catalog<E> {

	@Override
	public List<E> getElements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addElement(E e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeElement(E e) {
		// TODO Auto-generated method stub
		
	}




}
