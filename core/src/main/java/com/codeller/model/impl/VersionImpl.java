package com.codeller.model.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeller.model.Version;

/**
 * The Class VersionImpl.
 */
@Entity
@Table(name = "versions")
public class VersionImpl extends BaseItem implements Version {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Version#getFrom()
	 */
	@Column(name = "to_date")
	public Date getFrom() {
		return fromDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Version#getTo()
	 */
	@Column(name = "from_date")
	public Date getTo() {
		return toDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Version#setFrom(java.util.Date)
	 */
	public void setFrom(Date fromDate) {
		this.fromDate = fromDate;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Version#setTo(java.util.Date)
	 */
	public void setTo(Date toDate) {
		this.toDate = toDate;

	}

	/** The to date. */
	private Date toDate;

	/** The from date. */
	private Date fromDate;

}
