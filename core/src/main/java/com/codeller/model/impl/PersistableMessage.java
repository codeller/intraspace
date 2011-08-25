package com.codeller.model.impl;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;

import com.codeller.model.Info;
import com.codeller.model.Message;
import com.codeller.model.User;

@MappedSuperclass
public class PersistableMessage<A extends User, I extends Info> extends BaseItem implements Message<A, I> {
	/**
	 * Author
	 */
	private A author;
	/**
	 * Info
	 */
	private I info;
	/**
	 * Header
	 */
	private String header;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#getAuthor()
	 */
	@ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@JoinColumn(name = "author_id")
	public A getAuthor() {
		return this.author;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#setAuthor(com.legalbistro.model.User)
	 */
	public void setAuthor(A author) {
		this.author = author;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#getHeader()
	 */
	@Column(name = "header")
	public String getHeader() {
		return this.header;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#setInfo(com.legalbistro.model.Info)
	 */
	public void setInfo(I info) {
		this.info = info;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#setHeader(java.lang.String)
	 */
	public void setHeader(String header) {
		this.header = header;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Message#getInfo()
	 */

	@OneToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "persistable_id")
	public I getInfo() {
		return this.info;
	}

}
