package com.craft.persist;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.craft.core.User;

//these would ideall be stored in database
public class UserStorage implements Storage
{
	Map<Long,User> usersList = new ConcurrentHashMap<Long,User>();
	
	public void addUser(Long id, User u)
	{
		usersList.put(id,u);
	}

	public User getUser(Long id)
	{
		return usersList.get(id);
	}
	
}
