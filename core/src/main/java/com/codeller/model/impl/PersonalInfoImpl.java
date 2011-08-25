package com.codeller.model.impl;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.codeller.model.Gender;
import com.codeller.model.PersonalInfo;

/**
 * Class PersonalInfoImpl implements interface PersonalInfo
 * 
 * @author Orest Volkov
 * 
 */
@MappedSuperclass
public class PersonalInfoImpl extends PersistableInfo implements
		PersonalInfo<EducationImpl> {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#getFirstName()
	 */
	@Column(name = "first_name")
	public String getFirstName() {

		return firstName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#getLastName()
	 */
	@Column(name = "last_name")
	public String getLastName() {

		return lastName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#getGender()
	 */
	@Column(name = "gender")
	@Enumerated(EnumType.STRING)
	public Gender getGender() {
		return this.gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#setFirstName(java.lang.String)
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#setLastName(java.lang.String)
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.model.PersonalInfo#setGender(com.legalbistro.model.Gender
	 * )
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#getEducations()
	 */
	@OneToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL }, targetEntity = EducationImpl.class)
	@Column(name = "education_id")
	public List<EducationImpl> getEducations() {
		return this.educations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.legalbistro.model.PersonalInfo#setEducations(java.util.List)
	 */
	public void setEducations(List<EducationImpl> educations) {
		this.educations = educations;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.legalbistro.model.PersonalInfo#addEducation(com.legalbistro.model
	 * .Education)
	 */
	public void addEducation(EducationImpl education) {
		this.educations.add(education);
	}

	/**
	 * User's Last name
	 */
	private String lastName;
	/**
	 * User's first name
	 */
	private String firstName;
	/**
	 * User's gender
	 */
	private Gender gender;
	/**
	 * User's educations
	 */
	private List<EducationImpl> educations;
}
