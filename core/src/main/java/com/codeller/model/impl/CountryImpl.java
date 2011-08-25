package com.codeller.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeller.model.Country;

/**
 * Implementation of interface that describes country
 * 
 * @author Orest Volkov
 * 
 */
@Entity
@Table(name = "countries")
public class CountryImpl extends BaseItem implements Country {
	private String name;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Country#getName()
	 */

	@Column
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Country#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

}
