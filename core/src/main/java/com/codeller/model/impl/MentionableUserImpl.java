package com.codeller.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.codeller.model.BusinessInfo;
import com.codeller.model.ContactInfo;
import com.codeller.model.FeedBack;
import com.codeller.model.LoginInfo;
import com.codeller.model.MentionableUser;
import com.codeller.model.PersonalInfo;

/**
 * Implementation of MentionableUser interface
 * 
 * @author Orest Volkov
 * 
 * @param <P> user personal info
 * @param <C> user contact info
 * @param <L> user legal info
 * @param <B> user business info
 */
@MappedSuperclass
public class MentionableUserImpl<P extends PersonalInfo, C extends ContactInfo, L extends LoginInfo, B extends BusinessInfo, F extends FeedBack>
		extends UserImpl<P, C, L, B> implements MentionableUser<P, C, L, B, F> {
	private List<F> feedBacks;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.MentionableUser#getFeedBacks()
	 */
	@OneToMany( cascade = { CascadeType.ALL })
	@JoinColumn(name = "feedback_id")
	public List<F> getFeedBacks() {
		return this.feedBacks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.MentionableUser#setFeedBacks(java.util.List)
	 */
	public void setFeedBacks(List<F> feedBacks) {
		this.feedBacks = feedBacks;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.MentionableUser#addFeedBack(com.legalbistro.model.FeedBack)
	 */
	public void addFeedBack(F feedBack) {
		this.feedBacks.add(feedBack);
	}
}
