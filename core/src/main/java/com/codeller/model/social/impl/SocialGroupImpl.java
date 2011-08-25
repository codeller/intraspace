package com.codeller.model.social.impl;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.codeller.model.User;
import com.codeller.model.impl.PostableCatalog;
import com.codeller.model.social.SocialGroup;

/**
 * Implementation of SocialGroup interface
 * 
 * @author Orest Volkov
 */
@Entity
@Table(name = "social_groups")
public class SocialGroupImpl extends PostableCatalog<User> implements
		SocialGroup {

}
