package com.craft.dao;

import com.craft.core.Event;
import com.craft.core.User;
import com.craft.persist.EventStorage;

public class EventUsersDAO extends BaseDAO {
	
	public void addUserToEvent(Event event, User user)
	{
			UserDAO udao = new UserDAO();
			udao.createUser(user);
			
			EventStorage es = getEventStorage();
			es.addUser(event, user);
	}
}
