/**
 * 
 */
package com.dbhakuni.learning.jax.rs.resource;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.dbhakuni.learning.bean.StudentVO;

/**
 * @author dbhakuni
 *
 */
@Path("/")
public class WelcomeClass {

	/**
	 * 
	 */
	public WelcomeClass() {
		// TODO Auto-generated constructor stub
	}

	@GET @Path("/")
	public Response doWelcome(){
		
		System.out.println("Welcome...");
		
		return Response.ok().entity("123").build();
		
	}
	
	@GET @Path("/name/{n}")
	public Response name(@PathParam("n")String n){
		
		System.out.println("Welcome..."+n);
		
		return Response.ok().entity("Welcome..."+n).build();
		
	}
	
	@GET @Path("/students")
	@Produces(MediaType.APPLICATION_JSON)
	public Response allStudents(){
		
		System.out.println("Welcome.. Allstudents");
		
		StudentVO studentVO =new StudentVO();
		studentVO.setAge(5);
		studentVO.setName("no name");
		studentVO.setStd("Class I");
		return Response.ok().entity(studentVO).build();
		
	}
	
	@POST @Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response students(StudentVO studentVO){
		
		System.out.println("Welcome.. student -> "+ studentVO);
		
		return Response.ok().entity(studentVO).build();
		
	}
}
