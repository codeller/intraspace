package com.codeller.model.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeller.model.PhotoAlbum;

/**
 * Implementation of PhotoAlbum interface
 * @author Orest Volkov
 */
@Entity
@Table(name="photo_albums")
public class PhotoAlbumImpl extends PostableCatalog implements PhotoAlbum{

	
}
