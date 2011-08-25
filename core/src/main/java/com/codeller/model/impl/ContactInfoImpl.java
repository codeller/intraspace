package com.codeller.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CollectionOfElements;

import com.codeller.model.ContactInfo;

/**
 * Class ContactInfoImpl implements ContactInfo interface
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class ContactInfoImpl extends PersistableInfo implements ContactInfo<PersistablePostalAddress> {	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#getAddresses()
	 */
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinTable(name="contact_info_postal_addresses")
	@Column(name = "address_id")	
	public List<PersistablePostalAddress> getAddresses() {

		return addresses;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#getEmails()
	 */
	@CollectionOfElements
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	public List<String> getEmails() {

		return emails;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#getPhoneNumbers()
	 */
	@CollectionOfElements
	@Cascade(org.hibernate.annotations.CascadeType.ALL)
	public List<String> getPhoneNumbers() {

		return phoneNumbers;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#setAdresses(java.util.List)
	 */
	public void setAddresses(List<PersistablePostalAddress> addresses) {
		this.addresses = addresses;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#setEmails(java.util.List)
	 */
	public void setEmails(List<String> emails) {
		this.emails = emails;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.ContactInfo#setPhoneNumbers(java.util.List)
	 */
	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;

	}

	/**
	 * List of user phone numbers
	 */
	private List<String> phoneNumbers;
	/**
	 * List of user emails numbers
	 */
	private List<String> emails;
	/**
	 * List of user postal address
	 */
	private List<PersistablePostalAddress> addresses;	
}
