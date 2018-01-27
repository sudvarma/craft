package com.craft.impl;

import com.craft.core.User;

public class UserImpl implements User 
{
	long userId = -1;
	String userName = "";
	
	public UserImpl(long userId, String userName)
	{
		this.userId = userId;
		this.userName = userName;
	}

	@Override
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
