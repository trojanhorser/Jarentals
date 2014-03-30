package com.jarentals.app.service.place;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.jarentals.domain.model.Place;
import com.jarentals.domain.repository.PlaceRepository;

@Service
public class PlaceServiceImpl implements PlaceService {

	private PlaceRepository placeRepository;
	private Pageable pageRequest;
	
	@Override
	public List<Place> getAllPlaces(int start, int end) {	
	    pageRequest = new PageRequest(start,end);
		return placeRepository.findAllPlaces(pageRequest);
	}

	public PlaceRepository getPlaceRepository() {
		return placeRepository;
	}

	@Autowired
	public void setPlaceRepository(PlaceRepository placeRepository) {
		this.placeRepository = placeRepository;
	}
}
