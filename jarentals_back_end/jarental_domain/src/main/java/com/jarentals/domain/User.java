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
	private String first_name;
	
	@Column
	private String last_name;
	
	@Column
	private Date created_when;
	
	@Column
	private Date updated_when;
	
	@Column
	private String user_email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public Date getCreated_when() {
		return created_when;
	}

	public void setCreated_when(Date created_when) {
		this.created_when = created_when;
	}

	public Date getUpdated_when() {
		return updated_when;
	}

	public void setUpdated_when(Date updated_when) {
		this.updated_when = updated_when;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	
}
