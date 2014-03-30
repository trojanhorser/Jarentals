package com.jarentals.app.controller.place;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jarentals.app.service.place.PlaceService;
import com.jarentals.domain.model.Place;
import com.jarentals.domain.model.User;

@Controller
public class PlaceController {

	PlaceService placeService;
	
	@RequestMapping("/place")
	public @ResponseBody List<Place> getAllPlaces(@RequestParam("start") int start,@RequestParam("end") int end) {
		
		List<Place> places = placeService.getAllPlaces(start, end); 
		
		if(places == null || places.size() == 0 ){
			return (List<Place>) new ResponseEntity<List<Place>>(new ArrayList<Place>(),HttpStatus.OK);
		}
		return null;
	}
	
	@Autowired
	public void setPlaceService(PlaceService placeService) {
		this.placeService = placeService;
	}
}
