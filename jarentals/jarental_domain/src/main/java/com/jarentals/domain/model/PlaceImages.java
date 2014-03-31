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
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setPlaceId(Long placeId) {
		this.placeId = placeId;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public void setCreatedWhen(Date createdWhen) {
		this.createdWhen = createdWhen;
	}
	public void setUpdatedWhen(Date updatedWhen) {
		this.updatedWhen = updatedWhen;
	}

}
