package com.pathfinders.storelocator.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pathfinders.storelocator.api.dto.PlacesResponseDTO;
import com.pathfinders.storelocator.service.PlacesService;

/**
 * @author nithin
 *
 */
@RestController("/api/v1")
public class PlacesController {

	@Autowired
	private PlacesService placesService;

	@GetMapping("/places/favorites")
	public ResponseEntity<List<PlacesResponseDTO>> getFavorites() {

		List<PlacesResponseDTO> favoritePlaces = placesService.getFavoritePlaces();
		return ResponseEntity.ok(favoritePlaces);
	}

	@PostMapping("/places/favorite")
	public ResponseEntity<String> savePlaceAsFavorite(String placeId) {

		String newFavoritePlaceId = placesService.addFavoritePlace(placeId);
		return ResponseEntity.ok(newFavoritePlaceId);
	}

}
