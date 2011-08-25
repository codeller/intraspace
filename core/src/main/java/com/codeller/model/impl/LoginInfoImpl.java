package com.codeller.model.impl;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.codeller.model.LoginInfo;

/**
 * Class LoginInfoImpl implements interface LoginInfo
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class LoginInfoImpl extends PersistableInfo implements LoginInfo {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#getPassword()
	 */
	@Column(name = "password")
	public String getPassword() {

		return password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#getSecretQuestion()
	 */
	@Column(name = "secret_question")
	public String getSecretQuestion() {

		return secretQuestion;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#getSecretWord()
	 */
	@Column(name = "secret_word")
	public String getSecretWord() {

		return secretWord;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#getUsername()
	 */
	@Column(name = "username")
	public String getUsername() {

		return username;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#setPassword(java.lang.String)
	 */
	public void setPassword(String password) {
		this.password = password;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#setSecretQuestion(java.lang.String)
	 */
	public void setSecretQuestion(String question) {
		this.secretQuestion = question;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#setSecretWord(java.lang.String)
	 */
	public void setSecretWord(String word) {
		this.secretWord = word;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.LoginInfo#setUsername(java.lang.String)
	 */
	public void setUsername(String username) {
		this.username = username;

	}

	/**
	 * User's name (Login)
	 */
	private String username;
	/**
	 * Secret word for user account (for cases when user forgot password)
	 */
	private String secretWord;
	/**
	 * Secret question for user account (for cases when user forgot password. Answer is secret word)
	 */
	private String secretQuestion;
	/**
	 * Password for user's account
	 */
	private String password;

}
