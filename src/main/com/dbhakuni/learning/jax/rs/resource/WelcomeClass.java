/**
 * 
 */
package com.dbhakuni.learning.jax.rs.resource;

import java.io.File;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbhakuni.learning.bean.StudentVO;
import com.dbhakuni.learning.dao.BasicDataDAO;

/**
 * @author dbhakuni
 *
 */
@Path("/")
@Component
public class WelcomeClass {

	/**
	 * 
	 */
	public WelcomeClass() {
		System.out.println("WelcomeClass :: New Object :: .... ");
	}

	@Autowired
	BasicDataDAO basicDataDAO = null;

	@GET
	@Path("/")
	public Response doWelcome() {

		System.out.println("Welcome...");

		return Response.ok().entity("123").build();

	}

	@GET
	@Path("/name/{n}")
	public Response name(@PathParam("n") String n) {

		System.out.println("Welcome..." + n);

		return Response.ok().entity("Welcome..." + n).build();

	}

	@GET
	@Path("/students")
	@Produces(MediaType.APPLICATION_JSON)
	public Response allStudents() {

		System.out.println("Welcome.. Allstudents... ");
		List<StudentVO> studentVOs = basicDataDAO.getAllStudents();
		return Response.ok().entity(studentVOs).build();

	}

	@POST
	@Path("/student")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response students(StudentVO studentVO) {

		System.out.println("Welcome.. student -> " + studentVO);
		studentVO.setName(studentVO.getName() + " bhakuni ");
		return Response.ok().entity(studentVO).build();

	}
	
	@POST
	@Path("/student/add")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response add(StudentVO studentVO) {

		studentVO = basicDataDAO.add(studentVO);
		return Response.ok().entity(studentVO).build();

	}

	@GET
	@Path("/fileText")
	@Produces("text/plain")
	public Response fileText() {

		System.out.println("Welcome... fileText");

		File file=new File("/home/dbhakuni/Downloads/history-07-17-2014.kml");
		
		return Response
				.ok()
				.entity(file)
				.header("Content-Disposition",
						"attachment; filename=\"file_from_server.log\"")
				.build();

	}
	
	@GET
	@Path("/fileImage")
	@Produces("image/png")
	public Response fileImage() {

		System.out.println("Welcome... fileImage");

		File file=new File("/home/dbhakuni/Downloads/ie-c.png");
		
		return Response
				.ok()
				.entity(file)
				.header("Content-Disposition",
						"attachment; filename=\"image-server.png\"")
				.build();

	}
	
}
