package com.codeller.model;

/**
 * 
 * @author Orest Volkov
 *
 * @param <E>
 * @param <U>
 * @param <I>
 */
public interface PhotoAlbum<E, U extends User, I extends Info> extends Catalog<E>, Post<U, I>{

}
