package com.codeller.model.impl;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.codeller.model.Info;

/**
 * Class which represents simple persistable info implementation
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class PersistableInfo extends BaseItem implements Info {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Info#getInfo()
	 */
	@Column(name = "info")
	public String getInfo() {

		return info;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Info#setInfo(java.lang.String)
	 */
	public void setInfo(String info) {
		this.info = info;

	}

	/**
	 * Description
	 */
	private String info;

}
