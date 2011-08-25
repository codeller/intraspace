package com.codeller.model;

/**
 * Main snapshot is used for creating a base object that reffers to versions @see com.legalbistro.model#Main.java
 * 
 * @author Orest Volkov
 * 
 */
public interface MainSnanpshot {

	/**
	 * Method for getting main space of current snapshot.
	 * 
	 * @return Method returns main object of current state
	 */
	Main getMain();

	/**
	 * Method for actualizing main for versioned object.
	 * 
	 * @param main Main space for object
	 */
	void setMain(Main main);
}
