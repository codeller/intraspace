package com.codeller.model.impl;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.codeller.model.DealPost;
import com.codeller.model.Info;
import com.codeller.model.User;

/**
 * Class DealPostImpl describes deal
 * 
 * @author Orest Volkov
 * 
 * @param <U> User
 * @param <I> Info -Information
 */
@MappedSuperclass
public class DealPostImpl<U extends User, I extends Info> extends PersistableMessage<U, I> implements DealPost<U, I> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Deal#getPrice()
	 */
	@Column(name = "price")
	public BigDecimal getPrice() {

		return price;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Deal#setPrice(java.math.BigDecimal)
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Event#getUpdateDate()
	 */
	@Column(name = "update_date")
	public Date getUpdateDate() {
		return this.updateDate;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Event#setUpdateDate(java.util.Date)
	 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

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

	/**
	 * Price of the deal
	 */
	private BigDecimal price;
	private Date updateDate;
	private Date createDate;
}
