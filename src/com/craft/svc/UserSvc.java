package com.craft.svc;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/events/{eventid}/users")
public class UserSvc {
	
	@GET
	@Produces("text/html; charset=utf-8")
	public String getUsers(@PathParam("eventid") String eventid)
	{
		System.out.println("Inside getUsers eventid " + eventid);
		return "Inside getUsers";
	}

	@POST
	public void createUser(@PathParam("eventid") String eventid)
	{
		System.out.println("Inside createUser eventid " + eventid);
	}
}
