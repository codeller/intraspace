package com.codeller.model;

/**
 * Interface PersonalInfo is used for representing description of an object, which refers to Login Information.
 * 
 * @author Orest Volkov
 * 
 */
public interface LoginInfo extends Info, Item {
	/**
	 * Method getUsername() is used for getting user name of the given object.
	 * 
	 * @return String - user's name of the given object.
	 */
	String getUsername();

	/**
	 * Method setUsername() is used for setting user name to the given object.
	 * 
	 * @param username String - user's name of the given object.
	 */
	void setUsername(String username);

	/**
	 * Method getPassword() is used for getting user's password of the given object.
	 * 
	 * @return String - user's password of the given object.
	 */
	String getPassword();

	/**
	 * Method setPassword() is used for setting user's password to the given object.
	 * 
	 * @param password String - user's password of the given object.
	 */
	void setPassword(String password);

	/**
	 * Method getSecretQuestion() is used for getting a Secret Question for the users's account.
	 * 
	 * @return String - Secret Question for the users's account
	 */
	String getSecretQuestion();

	/**
	 * Method setSecretQuestion() is used for setting a Secret Question for the users's account.
	 * 
	 * @param question String - Secret Question for the users's account
	 */
	void setSecretQuestion(String question);

	/**
	 * Method getSecretWord() is used for getting a Secret word for the users's account.
	 * 
	 * @return String - Secret word for the users's account
	 */
	String getSecretWord();

	/**
	 * Method setSecretWord() is used for setting a Secret word for the users's account.
	 * 
	 * @param word
	 */
	void setSecretWord(String word);
}
