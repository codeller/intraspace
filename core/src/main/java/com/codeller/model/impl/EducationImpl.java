package com.codeller.model.impl;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.codeller.model.Degree;
import com.codeller.model.Education;

@Entity
@Table(name="educations")
public class EducationImpl extends BaseItem implements Education{
	private String highSchool;
	private Degree degree;
	
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Education#getHighSchool()
	 */
	@Column(name="high_school")
	public String getHighSchool() {		
		return this.highSchool;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Education#setHighSchool(java.lang.String)
	 */
	public void setHighSchool(String highSchool) {
		this.highSchool=highSchool;
	}

	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Education#getDegree()
	 */
	@Enumerated(EnumType.STRING)
	@Column(name="degree")
	public Degree getDegree() {
		return this.degree;
	}

	/*
	 * (non-Javadoc)
	 * @see com.legalbistro.model.Education#setDegree(com.legalbistro.model.Degree)
	 */
	public void setDegree(Degree degree) {
		this.degree=degree;		
	}

}
