package com.pathfinders.storelocator.api.dto;

import lombok.Data;

@Data
public class PlacesResponseDTO {
	
	private String placesId;
	
	public PlacesResponseDTO(String placesId) {
		this.placesId = placesId;
	}

}
