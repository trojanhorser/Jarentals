package com.jarentals.app.service.place;

import java.util.List;

import com.jarentals.domain.model.Place;

public interface PlaceService {

	public List<Place> getAllPlaces(int start, int end);

}
