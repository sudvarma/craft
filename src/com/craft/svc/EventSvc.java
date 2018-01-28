package com.craft.svc;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;


@Path("/events")
public class EventSvc {
	
	@POST
	@Consumes("application/x-www-form-urlencoded")
	public void createEvent(MultivaluedMap<String, String> formParams)
	{
		System.out.println("Inside createEvent");	
	}
	
	@GET
	@Produces("application/json; charset=utf-8")
	public String getEvents()
	{
		System.out.println("Inside getEvents");
		return "Inside get events";
	}
}
