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

import com.jarental.app.dto.place.PlaceDto;
import com.jarentals.app.service.place.PlaceService;

@Controller
public class PlaceController {

	PlaceService placeService;
	
	@RequestMapping("/place")
	public @ResponseBody  ResponseEntity<List<PlaceDto>> getAllPlaces(@RequestParam("start") int start,@RequestParam("end") int end) {
		
		List<PlaceDto> places = placeService.getAllPlaces(start, end); 
		
		if(places == null || places.size() == 0 ){
			return new ResponseEntity<List<PlaceDto>>(new ArrayList<PlaceDto>(),HttpStatus.OK);
		}else{
			return new ResponseEntity<List<PlaceDto>>(places,HttpStatus.OK);
		}
	}
	
	@Autowired
	public void setPlaceService(PlaceService placeService) {
		this.placeService = placeService;
	}
}
