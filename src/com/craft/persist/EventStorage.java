package com.craft.persist;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

import com.craft.core.Event;
import com.craft.core.User;

public class EventStorage implements Storage
{
	
	Map<Long,Event> eventsList = new ConcurrentHashMap<Long,Event>();
	Map<Long,ConcurrentSkipListSet<User>> eventUsersList = new ConcurrentHashMap<Long,ConcurrentSkipListSet<User>>();
	
	public void addEvent(Long id, Event e)
	{
		eventsList.put(id,e);
		eventUsersList.put(id, new ConcurrentSkipListSet<User>());
	}

	public Event getEvent(Long id)
	{
		return eventsList.get(id);
	}	
	
	public void addUser(Event e, User u)
	{
		eventUsersList.get(e.getEventId()).add(u);
	}
}
