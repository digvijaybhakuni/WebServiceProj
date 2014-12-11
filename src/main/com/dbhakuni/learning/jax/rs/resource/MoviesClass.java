package com.dbhakuni.learning.jax.rs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbhakuni.learning.dao.MyMoviesDataDAO;

@Path("/movies/")
@Component
public class MoviesClass {

	public MoviesClass() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	MyMoviesDataDAO myMoviesDataDAO;
	
	@GET @Path("/all") @Produces(MediaType.APPLICATION_JSON)
	public Response getAllMovies(){
		return Response.ok(myMoviesDataDAO.getAllMoviesList()).build();
	}

}
