package com.codeller.model;

/**
 * Interface Bid describes Bids
 * 
 * @author Orest Volkov
 * 
 */
public interface Bid<A extends User<?, ?, ?, ?>, I extends Info> extends
		DealPost<A, I> {

}
