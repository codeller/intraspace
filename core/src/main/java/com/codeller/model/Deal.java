package com.codeller.model;

import java.math.BigDecimal;

/**
 * Interface Deal describes cost of deal
 * 
 * @author Orest Volkov
 * 
 */
public interface Deal {
	/**
	 * Method is used to determine cost of deal
	 * 
	 * @return BigDecimal -cost of deal
	 */
	BigDecimal getPrice();

	/**
	 * Method is used to specify cost of deal
	 * 
	 * @param price BigDecimal -cost of deal
	 */
	void setPrice(BigDecimal price);
}
