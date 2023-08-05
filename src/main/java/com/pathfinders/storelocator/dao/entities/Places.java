package com.pathfinders.storelocator.dao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "places", schema = "public")
public class Places {
	
	@Id
	@Column(name = "places_id", nullable = false, unique = true)
	private String placesId;
	
	@Column(name = "isFavorite", nullable = true)
	private boolean isFavorite;

}
