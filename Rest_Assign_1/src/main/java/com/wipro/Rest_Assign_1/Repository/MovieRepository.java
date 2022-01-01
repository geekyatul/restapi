package com.wipro.Rest_Assign_1.Repository;

import java.util.ArrayList;
import java.util.List;

import com.wipro.Rest_Assign_1.model.Movie;

public class MovieRepository {

    List<Movie> movies;
    
    public MovieRepository()
    {
    	movies=new ArrayList<>();
    	Movie m1=new Movie("M001","Aamir Khan","PK",40000000.0f);
    	Movie m2=new Movie("M002","Dhanush","Asuran",60000000.0f);
    	Movie m3=new Movie("M003","Ranvir Singh","Gully Boy",70000000.0f);
    	Movie m4=new Movie("M004","Akshay Kumar","PadMan",30000000.0f);
    	
    	movies.add(m1);
    	movies.add(m2);
    	movies.add(m3);
    	movies.add(m4);
    	
    }
    
    public List<Movie> allMovies()
    {
    	return movies;
    }
    
    public Movie movie(String id)
    {
    	for(Movie m:movies)
    	{
    		if(m.getMovieId().equalsIgnoreCase(id))
    		{
    			return m;
    		}
    	}
    	return null;
    }
	
	
}
