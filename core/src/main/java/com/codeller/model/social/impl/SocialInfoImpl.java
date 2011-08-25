package com.codeller.model.social.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.codeller.model.PhotoAlbum;
import com.codeller.model.impl.PersistableInfo;
import com.codeller.model.impl.PhotoAlbumImpl;
import com.codeller.model.social.SocialConnection;
import com.codeller.model.social.SocialGroup;
import com.codeller.model.social.SocialInfo;

/**
 * Implementation of SocialInfo interface
 * 
 * @author Orest Volkov
 * 
 */
@Entity
@Table(name = "social_info")
public class SocialInfoImpl extends PersistableInfo implements SocialInfo {

	/**
	 * list of user's albums
	 */
	private List<PhotoAlbum> albums;
	/**
	 * list of user's social connections
	 */
	private List<SocialConnection> socialConnections;
	/**
	 * list of user's social groups
	 */
	private List<SocialGroup> socialGroups;

	/**
	 * @see SocialInfo#getAlbums()
	 */
	@OneToMany(fetch = FetchType.LAZY, targetEntity = PhotoAlbumImpl.class)
	@Column(name = "album_id")
	public List<PhotoAlbum> getPhotoAlbums() {
		return albums;
	}

	/**
	 * Setter for albums property
	 * 
	 * @param albums
	 */
	public void setPhotoAlbums(List<PhotoAlbum> albums) {
		this.albums = albums;
	}

	/**
	 * @see SocialInfo#addAlbum(PhotoAlbum)
	 */
	public void addAlbum(PhotoAlbum album) {
		albums.add(album);
	}

	/**
	 * @see SocialInfo#removeAlbum(PhotoAlbum)
	 */
	public void removeAlbum(PhotoAlbum album) {
		albums.remove(album);
	}

	/**
	 * @see SocialInfo#getConnections()
	 */
	@OneToMany(fetch = FetchType.LAZY, targetEntity = SocialConnectionImpl.class)
	@Column(name = "social_connection_id")
	public List<SocialConnection> getConnections() {
		return socialConnections;
	}

	/**
	 * @param socialConnections
	 */
	public void setConnections(List<SocialConnection> socialConnections) {
		this.socialConnections = socialConnections;
	}

	/**
	 * @see SocialInfo#addConnection(SocialConnection)
	 */
	public void addConnection(SocialConnection socialConnection) {
		socialConnections.add(socialConnection);
	}

	/**
	 * @see SocialInfo#removeConnection(SocialConnection)
	 */
	@Override
	public void removeConnection(SocialConnection socialConnection) {
		socialConnections.remove(socialConnection);
	}

	/**
	 * @see SocialInfo#getGroups()
	 */
	@OneToMany(fetch = FetchType.LAZY, targetEntity = SocialGroupImpl.class)
	@Column(name = "social_group_id")
	public List<SocialGroup> getSocialGroups() {
		return socialGroups;
	}

	/**
	 * @param socialGroups
	 */
	public void setSocialGroups(List<SocialGroup> socialGroups) {
		this.socialGroups = socialGroups;
	}

	/**
	 * @see SocialInfo#addGroup(SocialGroup)
	 */
	public void addSocialGroup(SocialGroup socialGroup) {
		socialGroups.add(socialGroup);
	}

	/**
	 * @see SocialInfo#removeGroup(SocialGroup)
	 */
	public void removeSocialGroup(SocialGroup socialGroup) {
		socialGroups.remove(socialGroup);
	}

}
