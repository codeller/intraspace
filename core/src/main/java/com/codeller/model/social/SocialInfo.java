package com.codeller.model.social;

import java.util.List;

import com.codeller.model.Info;
import com.codeller.model.PhotoAlbum;

/**
 * Description class which describes social information about an user.
 * 
 * @author Orest Volkov
 */
public interface SocialInfo extends Info {

	/**
	 * Method for obtaining photo albums of user.
	 * 
	 * @return Method returns list of photo albums objects
	 */
	List<PhotoAlbum> getPhotoAlbums();

	/**
	 * Method for adding photo album to user's album catalog.
	 * 
	 * @param album Photo album which should be added to albums
	 */
	void addAlbum(PhotoAlbum album);

	/**
	 * Method for deleting album from user's album catalog.
	 * 
	 * @param album Album which should be deleted
	 */
	void removeAlbum(PhotoAlbum album);

	/**
	 * Method for obtaining user's relations.
	 * 
	 * @return Method returns list of user's social connections
	 */
	List<SocialConnection> getConnections();

	/**
	 * Adds the connection to user relations.
	 * 
	 * @param connection Connection which should be added
	 */
	void addConnection(SocialConnection connection);

	/**
	 * Removes the connection from user relations.
	 * 
	 * @param connection Connection which should be added
	 */
	void removeConnection(SocialConnection connection);

	/**
	 * Gets the social groups in which user related.
	 * 
	 * @return Method returns list of the social groups which user joined
	 */
	List<SocialGroup> getSocialGroups();

	/**
	 * Adds the social group to user's social group list.
	 * 
	 * @param group Group which should be added
	 */
	void addSocialGroup(SocialGroup group);

	/**
	 * Removes the social group from user's social group list.
	 * 
	 * @param group Group which should be deleted
	 */
	void removeSocialGroup(SocialGroup group);
}
