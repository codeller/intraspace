package com.codeller.model;

import java.util.Date;

/**
 * Interface is used to define a version.
 * 
 * @author Orest Volkov
 * 
 */
public interface Version {
	/**
	 * Method is used for returning a date when version started
	 * 
	 * @return Date -a date when version started
	 */
	Date getFrom();

	/**
	 * Method is used to specify a start date - i.e. when version started
	 * 
	 * @param fromDate -a date when version started
	 */
	void setFrom(Date fromDate);

	/**
	 * Method is used to determine a date when version ends
	 * 
	 * @return Date -a date when version ends
	 */
	Date getTo();

	/**
	 * Method is used to specify a date when version ends
	 * 
	 * @param toDate - Date, a date when version ends
	 */
	void setTo(Date toDate);

}
