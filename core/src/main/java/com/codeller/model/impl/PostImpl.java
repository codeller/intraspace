package com.codeller.model.impl;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.codeller.model.Event;
import com.codeller.model.Info;
import com.codeller.model.User;
/**
 * PostImpl is used to define user's post: when it was created or updated
 * @author Orest Volkov 
 *
 * @param <A> Author of post of User type
 * @param <I> I Information of Info type
 */
/*
 * 
 */
@MappedSuperclass
public class PostImpl<A extends User, I extends Info> extends PersistableMessage<A, I> implements Event{
   /*
    * (non-Javadoc)
    * @see com.legalbistro.model.Event#getCreateDate()
    */
	@Column(name="create_date")
	public Date getCreateDate() {
		
		return createDate;
	}
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Event#getUpdateDate()
	 */
    @Column(name="update_date")
	public Date getUpdateDate() {
		
		return updateDate;
	}
   /*
    * (non-Javadoc)
    * @see com.legalbistro.model.Event#setCreateDate(java.util.Date)
    */
	public void setCreateDate(Date createDate) {
		this.createDate=createDate;
		
	}
/*
 * (non-Javadoc)
 * @see com.legalbistro.model.Event#setUpdateDate(java.util.Date)
 */
	public void setUpdateDate(Date updateDate) {
		this.updateDate=updateDate;
		
	}
  /**
   * Date when post was created
   */
	private Date createDate;
	/**
	 * Date when post was updated
	 */
	private Date updateDate;

}
