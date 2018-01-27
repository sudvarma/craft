package com.craft.impl;

import java.util.Date;

import com.craft.core.Event;

public class EventImpl implements Event 
{
	long eventId = -1;
	String eventName = "";
	String eventDesc = "";
	Date startDate = null;
	Date endDate = null;
	short status = 0;
	
	public EventImpl(long eventId, String eventName,
					 String eventDesc)
	{
		this(eventId,eventName,eventDesc,null,null);
	}
	
	public EventImpl(long eventId, String eventName,
					 String eventDesc,
					 Date startDate, Date endDate)
	{
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventDesc = eventDesc;	
		this.startDate = startDate;
		this.endDate = endDate;
	}


	@Override
	public long getEventId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}	
	
	@Override
	public String getEventName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}	

	@Override
	public String getEventDescription() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setEventDescription(String eventDesc) {
		this.eventDesc = eventDesc;
	}	

	@Override
	public Date getEventStartDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setEventStartDate(Date startDate) {
		this.startDate = startDate;
	}	

	@Override
	public Date getEventEndDate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setEventEndDate(Date endDate) {
		this.endDate = endDate;
	}	

	@Override
	public short getEventStatus() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void setEventStatus(short status) {
		this.status = status;
	}		

}
