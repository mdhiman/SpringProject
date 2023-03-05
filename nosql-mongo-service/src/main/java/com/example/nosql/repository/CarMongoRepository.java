package com.example.nosql.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.nosql.models.Car;

public interface CarMongoRepository extends CrudRepository<Car, String> {

	

}
