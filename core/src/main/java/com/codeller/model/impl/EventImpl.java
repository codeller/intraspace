package com.codeller.model.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.codeller.model.Event;



/**
 * Implementation of Event interface
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class EventImpl extends BaseItem implements Event {
	/** Creation date of event */
	private Date createDate;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Event#getCreateDate()
	 */
	@Column(name = "create_date")
	public Date getCreateDate() {
		return this.createDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Event#setCreateDate(java.util.Date)
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
