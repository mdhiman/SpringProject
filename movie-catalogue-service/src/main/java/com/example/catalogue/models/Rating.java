package com.example.catalogue.models;

public class Rating {

	public Rating() {
		// TODO Auto-generated constructor stub
	}
	
	private String movieId;
	private Integer rating;
	
	public Rating(String movieId, Integer rating) {
		super();
		this.movieId = movieId;
		this.rating = rating;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	

}
