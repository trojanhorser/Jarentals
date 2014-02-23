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
import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * User class
 * 
 * @author Denis Bell
 *
 */
@Entity
public class User {

	private static final long serialVersionUID = -2952735933715107252L;
	@Id
	@Column(unique = true) private Long id;
	
	@Column
	private String fb_id;
	@Column
	private String username;
	@Column
	private String password;
	@Column
	private String email;
	@Column
	private int role_id;
	@Column
	private Date created_when;
	@Column
	private Date updated_when;
	@Column
	private int user_status_id;
	
	
	public User() {
		this(null);
	}

	/**
	 * Creates a new user instance.
	 */
	public User(Long id) {
		this.setId(id);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFb_id() {
		return fb_id;
	}

	public void setFb_id(String fb_id) {
		this.fb_id = fb_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
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

	public int getUser_status_id() {
		return user_status_id;
	}

	public void setUser_status_id(int user_status_id) {
		this.user_status_id = user_status_id;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
