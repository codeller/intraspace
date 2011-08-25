package com.codeller.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import com.codeller.model.BusinessInfo;
import com.codeller.model.ContactInfo;
import com.codeller.model.LoginInfo;
import com.codeller.model.PersonalInfo;
import com.codeller.model.User;

/**
 * Implementation of User interface
 * 
 * @author Orest Volkov
 * 
 * @param <P> - User Personal Info
 * @param <C> - User Contact Info
 * @param <L> - User Login Info
 * @param <B> - User Business Info
 */
@MappedSuperclass
public class UserImpl<P extends PersonalInfo, C extends ContactInfo, L extends LoginInfo, B extends BusinessInfo> extends BaseItem implements User<P, C, L, B> {
	/** Personal information about user */
	private P personalInfo;
	/** Contact information about user */
	private C contactInfo;
	/** Login information about user */
	private L loginInfo;
	/** Business information about user */
	private B businessInfo;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#getPersonalInfo()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "personal_info_id")
	public P getPersonalInfo() {
		return this.personalInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#setPersonalInfo(com.legalbistro.model.PersonalInfo )
	 */
	public void setPersonalInfo(P personalInfo) {
		this.personalInfo = personalInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#getContactInfo()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "contact_info_id")
	public C getContactInfo() {
		return this.contactInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#setContactInfo(com.legalbistro.model.ContactInfo )
	 */
	public void setContactInfo(C contactInfo) {
		this.contactInfo = contactInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#getLoginInfo()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "login_info_id")
	public L getLoginInfo() {
		return this.loginInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#setLoginInfo(com.legalbistro.model.LoginInfo)
	 */
	public void setLoginInfo(L loginInfo) {
		this.loginInfo = loginInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#getBusinessInfo()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "business_info_id")
	public B getBusinessInfo() {
		return this.businessInfo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.User#setBusinessInfo(com.legalbistro.model.BusinessInfo )
	 */
	public void setBusinessInfo(B businessInfo) {
		this.businessInfo = businessInfo;
	}
}
