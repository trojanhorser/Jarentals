package com.jarentals.app.test.PlaceServiceUnitTest;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.jarentals.app.service.place.PlaceServiceImpl;
import com.jarentals.domain.model.Place;
import com.jarentals.domain.repository.PlaceRepository;

public class PlaceServiceUnitTest {

	@Mock
	private PlaceRepository placeRepository;
	private PlaceServiceImpl placeService;
	private Pageable request = new PageRequest(0, 10);
	private List<Place> places;
	private int start;
	private int end;

//	@Before
//	public void setUp() {
//		MockitoAnnotations.initMocks(this);
//		// Set up mock data which will be returned by the repo
//		places = createListOfPlaces(10);
//		placeService = new PlaceServiceImpl();
//		placeService.setPlaceRepository(placeRepository);
//	}
//
//	@Test
//	public void testGetAllPlaces_Should_Return_All_Places_From_The_Repo() {
//		when(placeRepository.findAllPlaces(request)).thenReturn(places);
//		List<Place> returnePlaces = placeService.getAllPlaces(start, end);
//		verify(placeRepository).findAllPlaces(request);
//		assertEquals(returnePlaces.size(), places.size());
//	}
//
//	private List<Place> createListOfPlaces(int amount) {
//		List<Place> places = new ArrayList<Place>();
//
//		for (int x = 0; x < amount; x++) {
//			Place place = new Place();
//			places.add(place);
//		}
//		return places;
//	}
}