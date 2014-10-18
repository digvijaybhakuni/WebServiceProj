package com.dbhakuni.learning.jax.rs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;


@Path("/calc")
public class CalculatorClass {

	public CalculatorClass() {
		System.out.println("CalculatorClass :: New Object ");
	}

	@GET @Path("/add")
	@Produces("text/plain")
	public Response add(@MatrixParam("a")int a, @MatrixParam("b")int b){
		return Response.ok().entity(String.valueOf(a+b)).build();
	}
	
	
	@GET @Path("/sub")
	@Produces("text/plain")
	public Response sub(@MatrixParam("a")int a, @MatrixParam("b")int b){
		return Response.ok().entity(String.valueOf(a-b)).build();
	}
	
	
}
