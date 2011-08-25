package com.codeller.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.codeller.model.BusinessInfo;
import com.codeller.model.Organization;

/**
 * Class BusinessInfoImpl implements BusinessInfo
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class BusinessInfoImpl extends PersistableInfo implements BusinessInfo {
	public BusinessInfoImpl(){
		this.organization=new OrganizationImpl();
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.BusinessInfo#getOrganization()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, targetEntity=OrganizationImpl.class)
	@JoinColumn(name = "organization_id")
	public Organization getOrganization() {

		return organization;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.BusinessInfo#setOrganization(com.legalbistro.model .Organization)
	 */
	public void setOrganization(Organization organization) {
		this.organization = organization;

	}

	/**
	 * The User's Organization
	 */
	private Organization organization;
}
