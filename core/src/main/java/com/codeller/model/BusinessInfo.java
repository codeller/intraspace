package com.codeller.model;

/**
 * Interface BusinessInfo is used for representing description of an object,
 * which refers to the business Information.
 * 
 * @author Orest Volkov
 * 
 */
public interface BusinessInfo extends Info, Item {
	/**
	 * Method getOrganization() is used to determine organization of the given
	 * object (ex. user).
	 * 
	 * @return Organization -Organization object
	 */
	Organization getOrganization();

	/**
	 * Method setOrganization() is used to specify organization of the given object (ex. user).
	 * 
	 * @param organization -Organization object
	 */
	void setOrganization(Organization organization);
}
