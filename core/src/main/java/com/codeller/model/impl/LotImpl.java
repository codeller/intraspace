package com.codeller.model.impl;

import javax.persistence.MappedSuperclass;

import com.codeller.model.Info;
import com.codeller.model.User;

/**
 * Lot implementation class
 * 
 * @author Orest Volkov
 * 
 * @param <U> User
 * @param <I> Information
 */
@MappedSuperclass
public class LotImpl<U extends User, I extends Info> extends DealPostImpl<U, I> {

}
