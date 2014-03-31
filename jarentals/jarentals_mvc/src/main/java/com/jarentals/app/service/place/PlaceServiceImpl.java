package com.jarentals.app.service.place;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jarental.app.dto.place.PlaceDto;
import com.jarentals.domain.model.Place;
import com.jarentals.domain.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {

	private PlaceRepository placeRepository;
	private Pageable pageRequest;
	
	@Override
	public List<PlaceDto> getAllPlaces(int start, int end) {	
	    pageRequest = new PageRequest(start,end);
		List<PlaceDto> placeDtos = new ArrayList<PlaceDto>();
	    List<Place> places = placeRepository.findAllPlaces(pageRequest);
		
	    for(Place place : places ){
	    	placeDtos.add(new PlaceDto(place));
	    }
	    
	    return placeDtos;
	}

	public PlaceRepository getPlaceRepository() {
		return placeRepository;
	}

	@Autowired
	public void setPlaceRepository(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
}
