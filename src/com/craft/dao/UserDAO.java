package com.craft.dao;

import com.craft.core.User;
import com.craft.persist.UserStorage;

public class UserDAO extends BaseDAO
{
	
	public long createUser(User user)
	{
		long userid = -1;
		UserStorage us = getUserStorage();
		userid = user.getUserId();
		us.addUser(userid, user);
		return userid;
	}
	
}
