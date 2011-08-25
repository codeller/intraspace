package com.codeller.model;

/**
 * Generic interface describing user. Has four type of information: Personal, Contact,Login and Business
 * 
 * @author Orest Volkov
 * 
 * @param <P> -Personal info -Personal information about object
 * @param <C> - ContactInfo -Contact information about object
 * @param <L> -LoginInfo - Login information about object
 * @param <B> -BusinessInfo -Business information about object
 */
public interface User<P extends PersonalInfo, C extends ContactInfo, L extends LoginInfo, B extends BusinessInfo> {
	/**
	 * Method is used to determine personal Information of the given object.
	 * 
	 * @return P -Personal info -Personal information about object
	 */
	P getPersonalInfo();

	/**
	 * Method is used to specify personal Information of the given object.
	 * 
	 * @param personalInfo - P - Personal information about object
	 */
	void setPersonalInfo(P personalInfo);

	/**
	 * Method is used to determine contact Information of the given object.
	 * 
	 * @return C ContactInfo- Contact information about object
	 */
	C getContactInfo();

	/**
	 * Method is used to specify contact Information of the given object.
	 * 
	 * @param contactInfo C -Contact information about object
	 */
	void setContactInfo(C contactInfo);

	/**
	 * Method is used to determine login Information of the given object.
	 * 
	 * @return L login Info - Login information about object
	 */
	L getLoginInfo();

	/**
	 * Method is used to specify login Information of the given object.
	 * 
	 * @param loginInfo L - Login information about object
	 */
	void setLoginInfo(L loginInfo);

	/**
	 * Method is used to determine business Information of the given object.
	 * 
	 * @return B BusinessInfo - business Information of the given object.
	 */
	B getBusinessInfo();

	/**
	 * Method is used to specify business Information of the given object.
	 * 
	 * @param businessInfo -B - business Information of the given object.
	 */
	void setBusinessInfo(B businessInfo);

}
