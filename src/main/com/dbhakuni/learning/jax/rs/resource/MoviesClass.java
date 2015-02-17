package com.dbhakuni.learning.jax.rs.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbhakuni.learning.bean.MoviesVO;
import com.dbhakuni.learning.bean.ResponseVO;
import com.dbhakuni.learning.dao.MyMoviesDataDAO;

@Path("/movies/")
@Component
public class MoviesClass {

	private static final Logger LOGGER = Logger.getLogger(MoviesClass.class);
	public MoviesClass() {
		// TODO Auto-generated constructor stub 
	}
	
	@Autowired(required=false)
	MyMoviesDataDAO myMoviesDataDAO;
	
	@GET @Path("/all") @Produces(MediaType.APPLICATION_JSON)
	public Response getAllMovies(){
		ResponseVO<List<MoviesVO>> responseVO = new ResponseVO<List<MoviesVO>>("200", "List Of Movies", myMoviesDataDAO.getAllMoviesList());
		return Response.ok(responseVO).build();
	}
	
	@GET @Path("/getByid/{id}") @Produces(MediaType.APPLICATION_JSON)
	public Response getMovieById(@PathParam("id")final String id){
		ResponseVO<MoviesVO> responseVO = new ResponseVO<MoviesVO>("200", "Movies Found", myMoviesDataDAO.getMoviesById(new MoviesVO(id)));
		return Response.ok(responseVO).build();
	}

	@POST @Path("/add") @Produces(MediaType.APPLICATION_JSON) @Consumes(MediaType.APPLICATION_JSON)
	public Response addMovies(final MoviesVO moviesVO){
		ResponseVO<MoviesVO> responseVO = new ResponseVO<MoviesVO>("200", "Movies Added", myMoviesDataDAO.addMovies(moviesVO));
		return Response.ok(responseVO).build();
	}
	
	@PUT  @Path("/update") @Produces(MediaType.APPLICATION_JSON) @Consumes(MediaType.APPLICATION_JSON)
	public Response updateMovies(final MoviesVO moviesVO){
		ResponseVO<MoviesVO> responseVO = new ResponseVO<MoviesVO>("200", "Movies Updated", myMoviesDataDAO.updateMovies(moviesVO));
		return Response.ok(responseVO).build();
	}
	
	@DELETE  @Path("/delete/{id}") @Produces(MediaType.APPLICATION_JSON)
	public Response deleteMovies(@PathParam("id")final String id){
		ResponseVO<MoviesVO> responseVO = new ResponseVO<MoviesVO>("200", "Movies Deleted", myMoviesDataDAO.deleteMoviesById(new MoviesVO(id)));
		return Response.ok(responseVO).build();
	}
	
	@GET @Path("/search/{field}/{value}") @Produces(MediaType.APPLICATION_JSON)
	public Response searchOnOneField(@PathParam("field")final String field,@PathParam("value")final String value){
		System.out.printf("[ Field : %s , Value : %s ]", field, value);
		
		return Response.ok(myMoviesDataDAO.getAllMoviesList()).build();
	}
	
	@GET @Path("/test") @Produces(MediaType.APPLICATION_JSON)
	public Response test(){
		LOGGER.info("Into Test Methods");
		return Response.ok(new ResponseVO<MoviesVO>("404", "Test is test", new MoviesVO("446464644677"))).build();
	}
	
	
}
