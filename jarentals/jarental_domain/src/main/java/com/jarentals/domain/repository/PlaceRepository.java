package com.jarentals.domain.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jarentals.domain.model.Place;

public interface PlaceRepository extends JpaRepository<Place, Long>{
	
	@Query("SELECT p FROM Place p")
	List<Place> findAllPlaces(Pageable page);
}
