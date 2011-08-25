package com.codeller.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.codeller.model.Organization;
import com.codeller.model.PostalAddress;

public class PersistableOrganization extends BaseItem implements Organization{
	private String name;
	private List<PostalAddress> addresses;
	private List<String>phoneNumbers;
	
	@Column(name="name")
	public String getName(){
		return this.name;
	}
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Organization#setName(java.lang.String)
	 */
	public void setName(String name){
		this.name=name;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Organization#getAddresses()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "address_id")
	public List<PostalAddress>getAddresses(){
		return this.addresses;
	}
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Organization#setAddresses(java.util.List)
	 */
	public void setAddresses(List<PostalAddress> addresses){
		this.addresses=addresses;
	}
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Organization#getPhoneNumbers()
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "phone_id")
	public List<String> getPhoneNumbers(){
		return this.phoneNumbers;
	}
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Organization#setPhoneNumbers(java.util.List)
	 */
	public void setPhoneNumbers(List<String> phoneNumbers){
		this.phoneNumbers=phoneNumbers;
	}

}
