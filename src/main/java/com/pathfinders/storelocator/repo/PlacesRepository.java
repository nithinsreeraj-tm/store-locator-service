package com.pathfinders.storelocator.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pathfinders.storelocator.dao.entities.Places;

@Repository
public interface PlacesRepository extends CrudRepository<Places, String>{
	
	

}
