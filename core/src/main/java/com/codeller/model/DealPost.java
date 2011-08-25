package com.codeller.model;


/**
 * Interface presents a Post that describes a deal
 * 
 * @author Orest Volkov
 * 
 */
public interface DealPost<U extends User, I extends Info> extends Post<U, I>, Deal {

}
