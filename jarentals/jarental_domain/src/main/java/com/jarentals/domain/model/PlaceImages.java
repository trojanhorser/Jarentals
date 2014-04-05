package com.jarentals.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PlaceImages")
public class PlaceImages {
	
	private static final long serialVersionUID = -2952735337151086252L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long id;
	@Column(name="place_id")
	private Long placeId;
	@Column(name="image_url")
	private String imageUrl;
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


	public Long getPlaceId() {
		return placeId;
	}


	public void setPlaceId(Long placeId) {
		this.placeId = placeId;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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