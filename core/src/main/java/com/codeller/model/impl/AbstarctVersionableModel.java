package com.codeller.model.impl;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.codeller.model.Main;
import com.codeller.model.Version;

public abstract class AbstarctVersionableModel extends BaseItem implements Main {

	public Version getCurrentVersion() {
		// TODO:ovolkov implement it conform defined rules
		return null;
	}

	public Version getLastVersion() {
		// TODO:ovolkov implement it conform defined rules
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.Versionable#getVersions()
	 */
	@OneToMany(fetch = FetchType.LAZY)
	@Column(name = "version_id")
	public List<Version> getVersions() {
		return versions;
	}

	private List<Version> versions;
}
