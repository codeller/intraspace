package com.codeller.model;

import java.util.Date;

/**
 * Interface Event describes an object event
 * 
 * @author Orest Volkov
 * 
 */
public interface Event {
	/**
	 * Method is used to determine creating date of the event.
	 * 
	 * @return Date - creating date
	 */
	Date getCreateDate();

	/**
	 * Method is used to specify create date of the event.
	 * 
	 * @param createDate -creating date
	 */
	void setCreateDate(Date createDate);
}
