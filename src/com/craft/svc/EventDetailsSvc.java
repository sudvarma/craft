package com.craft.svc;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/events/{eventid}")
public class EventDetailsSvc {
	
	@GET
	@Produces("application/json; charset=utf-8")
	public String getEventDetails(@PathParam("eventid") String eventid)
	{
		System.out.println("Inside getEventDetails eventid " + eventid);
		return "Inside getEventDetails";
	}
	
	@PUT
	public void settleUpEventDetails(@PathParam("eventid") String eventid)
	{
	
		System.out.println("Inside settleUpEventDetails eventid " + eventid);
	}

	@DELETE
	public void deleteEventDetails(@PathParam("eventid") String eventid)
	{
		System.out.println("Inside deleteEventDetails eventid " + eventid);
	}
	
}
