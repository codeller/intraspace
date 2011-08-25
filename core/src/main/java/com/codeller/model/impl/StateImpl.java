package com.codeller.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.codeller.model.Country;
import com.codeller.model.State;

/**
 * Implementation of interface which describes State
 * 
 * @author Orest Volkov
 * 
 */
@Entity
@Table(name = "states")
public class StateImpl extends BaseItem implements State {
	private String name;
	private Country country;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.State#getName()
	 */
	@Column
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.State#getCountry()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, targetEntity = CountryImpl.class)
	@JoinColumn(name = "country_id", referencedColumnName = "id")
	public Country getCountry() {
		return this.country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.State#setName(java.lang.String)
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.model.State#setCountry(com.legalbistro.model.Country)
	 */
	public void setCountry(Country country) {
		this.country = country;
	}

}
