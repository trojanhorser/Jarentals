package com.jarental.app.dto.place;

import java.util.Date;
import java.util.List;

import com.jarentals.domain.model.Place;
import com.jarentals.domain.model.PlaceImages;

public class PlaceDto {

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
	public Long getAddressId() {
		return addressId;
	}
	public Long getContactId() {
		return contactId;
	}
	public Long getUserId() {
		return userId;
	}
	public Long getPlaceStatusId() {
		return placeStatusId;
	}
	public Date getCreatedWhen() {
		return createdWhen;
	}
	public Date getUpdatedWhen() {
		return updatedWhen;
	}
	public List<PlaceImages> getPlaceImages() {
		return placeImages;
	}
	
	
}	
