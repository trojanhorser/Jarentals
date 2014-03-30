package com.jarentals.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User class
 * 
 * @author Denis Bell
 *
 */
@Entity
@Table(name = "Place")
public class Place {
	
	
	private static final long serialVersionUID = -2952735933715107252L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id;
	@Column(name="address_id")
	private Long addressId;
	@Column(name="contact_id")
	private Long contactId;
	@Column(name="user_id")
	private Long userId;
	@Column(name="placeStatusId")
	private Long placeStatusId;
	@Column(name="created_when")
	private Date createdWhen;
	@Column(name="updated_when")
	private Date updatedWhen;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPlaceStatusId() {
		return placeStatusId;
	}
	public void setPlaceStatusId(Long placeStatusId) {
		this.placeStatusId = placeStatusId;
	}
	public Date getCreatedWhen() {
		return createdWhen;
	}
	public void setCreatedWhen(Date createdWhen) {
		this.createdWhen = createdWhen;
	}
	public Date getUpdatedWhen() {
		return updatedWhen;
	}
	public void setUpdatedWhen(Date updatedWhen) {
		this.updatedWhen = updatedWhen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}	
}
