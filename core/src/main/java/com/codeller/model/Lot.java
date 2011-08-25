package com.codeller.model;

/**
 * Interface Bid describes a lot(potential contract)
 * 
 * @author Orest Volkov
 * 
 */
public interface Lot<A extends User<?,?,?,?>,I extends Info> extends DealPost<A, I> {// TODO should extends with client and info

}
