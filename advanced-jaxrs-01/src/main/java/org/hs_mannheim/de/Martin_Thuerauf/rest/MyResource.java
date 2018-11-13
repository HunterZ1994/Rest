package org.hs_mannheim.de.Martin_Thuerauf.rest;

//import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("{pathParam}/test")
//@Singleton
public class MyResource {
	
	
	@PathParam("pathParam") String pathParamExample;
	@QueryParam("query") String queryParamExample;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testmethod() {
		return "It works! Path param used " + pathParamExample+" and the Query param used " + queryParamExample;
	}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String testMethod() {
//		return "It Works!";
//	}

	
}
