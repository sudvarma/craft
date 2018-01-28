package com.craft.svc;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MultivaluedMap;

@Path("/events/{eventid}/users")
public class UserSvc {
	
	@GET
	@Produces("application/json; charset=utf-8")
	public String getUsers(@PathParam("eventid") String eventid)
	{
		System.out.println("Inside getUsers eventid " + eventid);
		return "Inside getUsers";
	}

	@POST
	@Consumes("application/x-www-form-urlencoded")
	public void createUser(@PathParam("eventid") String eventid,
						   MultivaluedMap<String, String> formParams)
	{
		System.out.println("Inside createUser eventid " + eventid);
	}
}
