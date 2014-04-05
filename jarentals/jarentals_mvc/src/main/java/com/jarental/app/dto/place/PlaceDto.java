package com.jarental.app.dto.place;

import java.util.Date;
import java.util.List;

import com.jarentals.domain.model.Place;
import com.jarentals.domain.model.PlaceImages;

public class PlaceDto {
	

	private static final long serialVersionUID = -2952735933715107252L;
	
	private Long id;
	private Long addressId;
	private Long contactId;
	private Long userId;
	private Long placeStatusId;
	private Date createdWhen;
	private Date updatedWhen;
	private List<PlaceImages> placeImages;
	
	public PlaceDto(Place place){
		this.id = place.getId() ;
		this.addressId = place.getAddressId();
		this.contactId = place.getAddressId();
		this.userId = place.getUserId();
		this.placeStatusId = place.getPlaceStatusId();
		this.createdWhen = place.getCreatedWhen();
		this.updatedWhen = place.getUpdatedWhen();
		this.placeImages = place.getPlaceImages();
	}

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

	public List<PlaceImages> getPlaceImages() {
		return placeImages;
	}

	public void setPlaceImages(List<PlaceImages> placeImages) {
		this.placeImages = placeImages;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}