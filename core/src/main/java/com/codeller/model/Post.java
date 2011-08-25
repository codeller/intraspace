package com.codeller.model;

/**
 * Interface Post presents a user's post
 * 
 * @author Orest Volkov
 * 
 */
public interface Post<U extends User, I extends Info> extends Message<U, I>, Event, Item {

}