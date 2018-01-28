package com.craft.svc;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/events")
public class EventSvc {
	
	@POST
	public void createEvent()
	{
		System.out.println("Inside createEvent");		
	}
	
	@GET
	@Produces("text/html; charset=utf-8")
	public String getEvents()
	{
		System.out.println("Inside getEvents");
		return "Inside get events";
	}
}
