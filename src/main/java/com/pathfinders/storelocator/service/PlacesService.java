package com.pathfinders.storelocator.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathfinders.storelocator.api.dto.PlacesResponseDTO;
import com.pathfinders.storelocator.dao.entities.Places;
import com.pathfinders.storelocator.repo.PlacesRepository;

@Service
public class PlacesService {
	
	@Autowired
	private PlacesRepository placesRepo;

	public List<PlacesResponseDTO> getFavoritePlaces() {
		
		List<Places> places = (List<Places>) placesRepo.findAll();
		return places.stream().map(place -> new PlacesResponseDTO(place.getPlacesId())).collect(Collectors.toList());
	}

	public String addFavoritePlace(String placeId) {
		
		Places place = new Places();
		place.setPlacesId(placeId);
		place.setFavorite(true);
		return placesRepo.save(place).getPlacesId();
	}
}
