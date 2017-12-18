package com.payd.app.repository.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Member {
	
	//private Long guid;
	private Integer memberId;
	private String firstName;
	private String lastName;
	private String middleName;
	private LocalDate dateOfBirth;
	private String emailId;
	private Employer employer;
	
	@Id
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getEmail() {
		return emailId;
	}
	public void setEmail(String emailId) {
		this.emailId = emailId;
	}
	
	@ManyToOne
	@JoinColumn(name="employer_Id",nullable = false)
	public Employer getEmployer() {
		return employer;
	}
	public void setEmployer(Employer employer) {
		this.employer = employer;
	}
	
}
