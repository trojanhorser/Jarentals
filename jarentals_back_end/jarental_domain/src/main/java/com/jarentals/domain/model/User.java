/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jarentals.domain.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * Sample user class.
 * 
 * @author Oliver Gierke
 * @author Thomas Darimont
 */
@Entity
public class User extends AbstractPersistable<Long> {

	private static final long serialVersionUID = -2952735933715107252L;
	@Id
	@Column(unique = true) private String useremail;

	private String firstname;
	private String lastname;
	private Date createdwhen;
	private Date updatedwhen;

	public User() {
		this(null);
	}

	/**
	 * Creates a new user instance.
	 */
	public User(Long id) {
		this.setId(id);
	}

	

	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
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
	
	
}
