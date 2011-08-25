package com.codeller.model;

import java.util.List;

/**
 * Interface for ranging objects in time, i.e. object dealing with this interface can have different versions.
 * 
 * @author Orest Volkov
 * 
 */
public interface Main {
	/**
	 * Method for getting all object versions
	 * 
	 * @return List of versions which holds current object
	 */
	List<Version> getVersions();

	/**
	 * Method for getting current version of the object
	 * 
	 * @return Version - current version of the object
	 */
	Version getCurrentVersion();

	/**
	 * Method for getting latest version of the object
	 * 
	 * @return Version - latest version of the object
	 */
	Version getLastVersion();
}
