package com.codeller.model.social;

import com.codeller.model.Post;
import com.codeller.model.Relation;
import com.codeller.model.User;

/**
 * Class describes connection - simple relation between users.
 * 
 * @author ovolkov
 * 
 */
public interface SocialConnection extends Post, Relation {

	/**
	 * Method for getting first participant(author of relation) of relation.
	 * 
	 * @return Method returns the first side of relation
	 */
	User getFirstSide();

	/**
	 * Method gets the second side(slave side) of connection.
	 * 
	 * @return Method returns the second side of relation
	 */
	User getSecondSide();

}
