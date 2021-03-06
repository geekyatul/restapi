package com.wipro.Rest_Assign_1.controller;

import java.util.List;

import javax.print.attribute.standard.Media;

import com.wipro.Rest_Assign_1.Repository.MovieRepository;
import com.wipro.Rest_Assign_1.model.Movie;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("movies")
public class MovieController {
	
	MovieRepository movieRepository=new MovieRepository();
	
	
	   @GET
	   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,MediaType.TEXT_XML})
       public List<Movie> allMovies()
       {
		   System.out.println("hello I will give all movie information ");
		   System.out.println(movieRepository.allMovies());
    	   return movieRepository.allMovies();
       }
	   

	   

	   
	   @GET
	   @Path("/{id}")
	   @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	   public Movie movie(@PathParam("id") String movieId)
	   {  
		   System.out.println("hello I will give movie information ");
		   System.out.println(movieRepository.movie(movieId));
            return movieRepository.movie(movieId);		   
	   }

}
