package com.codeller.model.base;

import com.codeller.model.Post;

/**
 * Class which describes log entity.
 * 
 * @author Orest Volkov
 * 
 */
public interface LogMessage extends Post {
	/**
	 * Level of logging. For example ERROR/WARN/INFO
	 * 
	 * @return Method returns enum value of logging level.
	 */
	LogLevel getLevel();

	/**
	 * Method returns scope or domain of logging. For example login/logout/case adding.
	 * 
	 * @return Method returns string from lookup table which contains domain of log item.
	 */
	String getLogType();// TODO review name

	/**
	 * Method for getting ip address of client request.
	 * 
	 * @return Method returns string which contains ip address
	 */
	String getIP();

	/**
	 * Method for obtaining browser info string.
	 * 
	 * @return Method returns string which contains browser and system description.
	 */
	String getBrowserString();
}
