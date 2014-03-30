package com.jarentals.app.test;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.jarentals.app.controller.place.PlaceController;
import com.jarentals.app.service.place.PlaceService;
import com.jarentals.domain.model.Place;

public class PlaceControllerUnitTest {
	
	@Mock
	private PlaceService placeService;
	private PlaceController placeController;
	private List<Place> place;
	int start = 0;
	int end = 10;
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
		placeController = new PlaceController();
		placeController.setPlaceService(placeService);
		place = createListOfPlaces(10);
	}
	
	@Test
	public void testGetAllPlaces_Should_Retrive_All_Places(){
		when(placeService.getAllPlaces(start, end)).thenReturn(place);
		List<Place> places = placeController.getAllPlaces(start, end);
		verify(placeService).getAllPlaces(start, end);
	}
	
	private List<Place> createListOfPlaces(int amount) {
		List<Place> places = new ArrayList<Place>();

		for (int x = 0; x < amount; x++) {
			Place place = new Place();
			places.add(place);
		}
		return places;
	}
}