package com.craft.persist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.craft.core.Event;

public class EventStorage implements Storage
{
	
	Map<Long,Event> eventsList = new ConcurrentHashMap<Long,Event>();
	
	public void addUser(Long id, Event e)
	{
		eventsList.put(id,e);
	}

	public Event getUser(Long id)
	{
		return eventsList.get(id);
	}	
}
