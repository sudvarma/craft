package com.craft.core;

import java.util.Date;

public interface Event {
	
	public long getEventId();

	
	public String getEventName();

	
	public String getEventDescription();

	
	public Date getEventStartDate();

	
	public Date getEventEndDate();

	
	public short getEventStatus();

}
