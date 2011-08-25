package com.codeller.model.impl;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.codeller.model.Item;

/**
 * Implementation of Event interface
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class BaseItem implements Item {
	/** Event unique identifier */
	private Long id;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Item#getId()
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return this.id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Item#setId(java.lang.Long)
	 */
	public void setId(Long id) {
		this.id = id;
	}
}
