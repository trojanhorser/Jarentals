package com.jarentals.domain;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private Date createdwhen;
	
	@Column
	private Date updatedwhen;
	
	@Column
	private String useremail;

	public Long getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getCreatedwhen() {
		return createdwhen;
	}

	public void setCreatedwhen(Date createdwhen) {
		this.createdwhen = createdwhen;
	}

	public Date getUpdatedwhen() {
		return updatedwhen;
	}

	public void setUpdatedwhen(Date updatedwhen) {
		this.updatedwhen = updatedwhen;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	
}
