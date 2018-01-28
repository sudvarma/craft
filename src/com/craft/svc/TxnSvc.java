package com.craft.svc;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/events/{eventid}/users/{userid}/txns")
public class TxnSvc {

	@GET
	@Produces("text/html; charset=utf-8")
	public String getTxnDetails(@PathParam("eventid") String eventid,
								@PathParam("userid") String userid)
	{
		System.out.println("Inside getTxnDetails eventid " + eventid + " userid " + userid);
		return "Inside getTxnDetails";
	}
	
	@POST
	public void addTxn(@PathParam("eventid") String eventid,
					   @PathParam("userid") String userid)
	{
		
		System.out.println("Inside addTxn eventid " + eventid + " userid " + userid);
	}
}
