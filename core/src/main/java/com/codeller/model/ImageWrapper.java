package com.codeller.model;

public interface ImageWrapper {
	/**
	 * Method for getting path of thumb on storage
	 * 
	 * @return Method returns string which handle to image thumb
	 */
	String getThumbPath();

	/**
	 * Method for getting path to image.
	 * 
	 * @return Method returns string which handle to file from storage
	 */
	String getPath();
}
