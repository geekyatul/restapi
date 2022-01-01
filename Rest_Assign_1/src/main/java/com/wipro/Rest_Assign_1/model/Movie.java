package com.wipro.Rest_Assign_1.model;

public class Movie {
	private String movieId;
	private String movieName;
	private String movieActor;
	private float movieCollection;
	public Movie(String movieId, String movieName, String movieActor, float movieCollection) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieActor = movieActor;
		this.movieCollection = movieCollection;
	}
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieActor() {
		return movieActor;
	}
	public void setMovieActor(String movieActor) {
		this.movieActor = movieActor;
	}
	public float getMovieCollection() {
		return movieCollection;
	}
	public void setMovieCollection(float movieCollection) {
		this.movieCollection = movieCollection;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieActor=" + movieActor
				+ ", movieCollection=" + movieCollection + "]";
	}
	
	
	

}
