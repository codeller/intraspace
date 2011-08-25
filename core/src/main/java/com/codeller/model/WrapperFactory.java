package com.codeller.model;

import java.util.Date;

public interface WrapperFactory {
	/**
	 * Methods creates e new Wrapper. Has no parameters
	 * 
	 * @return Main Wrapper - object that reffers to versions.
	 */
	BusinessObject newWrapper();

	/**
	 * 
	 * @param wrapper MainWrapper - object that reffers to versions.
	 * @return MainWrapper - object that reffers to versions.
	 */
	BusinessObject newWrapper(BusinessObject wrapper);

	/**
	 * 
	 * @param wrapper MainWrapper - object that reffers to versions.
	 * @param date Date for returning wrapper by certain Date
	 * @return MainWrapper - object that reffers to versions.
	 */
	BusinessObject getWrapper(Main main, Date date);
}
