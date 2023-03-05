package com.example.nosql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.nosql.repository.CarMongoRepository;
import com.example.nosql.repository.CarSearchRepository;

@Controller
public class CarController {

	public CarController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	CarMongoRepository carRepository;
	
	@Autowired
	CarSearchRepository carSearchRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAllAttributes("carList",carRepository.findAll());
		return "home";
	}

}
