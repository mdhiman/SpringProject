package com.example.catalogue.resources;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.catalogue.models.CatalogueItem;
import com.example.catalogue.models.Movie;
import com.example.catalogue.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/catalogue")
public class CatalogueResource {

	public CatalogueResource() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}")
	@HystrixCommand(fallbackMethod = "getFallbackCatalogue")
	public List<CatalogueItem> getCatalogue(@PathVariable("userId") String userId){
		UserRating userRating = restTemplate.getForObject("http://rating-data/ratingsdata/user/"+userId, UserRating.class);
		
		return userRating.getRatings().stream()
				.map(rating->{
					Movie movie = restTemplate.getForObject("http://movie-info/movies/"+rating.getMovieId(), Movie.class);
					return new CatalogueItem(movie.getName(), movie.getDescription(),rating.getRating());
				}).collect(Collectors.toList());
	}
	
	public List<CatalogueItem> getFallbackCatalogue(@PathVariable("userId") String userId){
		
		return Arrays.asList(new CatalogueItem("No Movie Info ath this time", "", 0));
		
	}

}
