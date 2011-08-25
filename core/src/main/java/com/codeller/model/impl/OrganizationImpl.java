package com.codeller.model.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionOfElements;

import com.codeller.model.Organization;
import com.codeller.model.PostalAddress;

@Entity
@Table(name="organizations")
public class OrganizationImpl extends BaseItem implements Organization {

	private String name;
	private List<PostalAddress> addresses;
	private List<String> phoneNumbers;
	
	@Column(name = "street_name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@OneToMany(fetch = FetchType.LAZY, targetEntity=PersistablePostalAddress.class)
	@Column(name = "address_id")	
	public List<PostalAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<PostalAddress> addresses) {
		this.addresses = addresses;
	}
	
	@CollectionOfElements
	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}
	
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	

	
	


}
