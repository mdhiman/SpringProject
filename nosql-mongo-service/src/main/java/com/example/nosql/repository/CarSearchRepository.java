package com.example.nosql.repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.example.nosql.models.Car;

@Repository
public class CarSearchRepository {

	public CarSearchRepository() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public Collection<Car> searchCars(String text){
		return mongoTemplate.find(Query.query(new Criteria().);
		
	}

}
