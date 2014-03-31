package com.jarentals.app.service.place;

import java.util.List;

import com.jarental.app.dto.place.PlaceDto;
import com.jarentals.domain.model.Place;

public interface PlaceService {

	public List<PlaceDto> getAllPlaces(int start, int end);

}
