package com.craft.dao;

import com.craft.core.Event;
import com.craft.persist.EventStorage;

public class EventDAO extends BaseDAO
{
	
	public long createEvent(Event event)
	{
		long eventid = -1;
		try
		{
			EventStorage es = getEventStorage();
			eventid = event.getEventId();
			es.addEvent(eventid, event);
			
		} catch(Exception e) {
			
			System.out.println(e);
		}
		return eventid;
	}
}
