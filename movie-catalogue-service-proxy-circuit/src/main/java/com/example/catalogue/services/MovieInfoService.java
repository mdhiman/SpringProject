package com.example.catalogue.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.example.catalogue.models.CatalogueItem;
import com.example.catalogue.models.Movie;
import com.example.catalogue.models.Rating;
import com.example.catalogue.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class MovieInfoService {

	public MovieInfoService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackCatalogueItem")
	public CatalogueItem getCatalogueItem(Rating rating) {
		Movie movie = restTemplate.getForObject("http://movie-info/movies/"+rating.getMovieId(), Movie.class);
		return new CatalogueItem(movie.getName(),movie.getDescription(),rating.getRating());
	}
	
	public CatalogueItem getFallbackCatalogueItem(Rating rating){
		
		return new CatalogueItem("Movie name not found", "", rating.getRating());
		
	}

}
