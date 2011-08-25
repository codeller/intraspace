package com.codeller.model.social.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.codeller.model.User;
import com.codeller.model.impl.PostImpl;
import com.codeller.model.social.SocialConnection;

/**
 * Implementation of SocialConnection interface
 * 
 * @author Orest Volkov
 * 
 */
@Entity
@Table(name="social_connections")
public class SocialConnectionImpl extends PostImpl implements SocialConnection {
	/**
	 * user's first side of social connection
	 */
	private User firstSide;
	/**
	 * user's second side of social connection
	 */
	private User secondSide;
	
	/**
	 * @see SocialConnection#getFirstSide()
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "first_user_id")
	public User getFirstSide() {
		return firstSide;
	}
	
	/**
	 * @param firstSide
	 */
	public void setFirstSide(User firstSide) {
		this.firstSide = firstSide;
	}
	
	/**
	 * @see SocialConnection#getSecondSide()
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@Column(name = "second_user_id")
	public User getSecondSide() {
		return secondSide;
	}
	
	/**
	 * @param secondSide
	 */
	public void setSecondSide(User secondSide) {
		this.secondSide = secondSide;
	}
}
