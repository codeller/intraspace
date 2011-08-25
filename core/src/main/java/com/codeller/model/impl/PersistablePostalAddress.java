package com.codeller.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.codeller.model.PostalAddress;
import com.codeller.model.State;

@Entity
@Table(name = "postal_addresses")
public class PersistablePostalAddress extends BaseItem implements PostalAddress {
	private String streetNumber;
	private String streetName;
	private State state;
	private String zipCode;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#getStreetNumber()
	 */
	@Column(name = "street_number")
	public String getStreetNumber() {
		return this.streetNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.model.PostalAddress#setStreetNumber(java.lang.String)
	 */
	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#getStreetName()
	 */
	@Column(name = "street_name")
	public String getStreetName() {
		return this.streetName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#setStreetName(java.lang.String)
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#getCountry()
	 */
	@ManyToOne(fetch = FetchType.EAGER, targetEntity = StateImpl.class, cascade = CascadeType.MERGE)
	@JoinColumn(name = "state_id", referencedColumnName = "id")
	public State getState() {
		return this.state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#setCountry(java.lang.String)
	 */
	public void setState(State state) {
		this.state = state;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#getZipCode()
	 */
	@Column(name = "zip_code")
	public String getZipCode() {
		return this.zipCode;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PostalAddress#setZipCode(java.lang.String)
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
