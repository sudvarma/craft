package com.craft.dao;

import com.craft.core.CraftConstants;
import com.craft.core.CraftCtxt;
import com.craft.persist.EventStorage;
import com.craft.persist.UserStorage;
import com.craft.persist.UserTxnStorage;

public abstract class BaseDAO {
	
	public EventStorage getEventStorage()
	{
		return (EventStorage) CraftCtxt.getInstance().getStorage(CraftConstants.EVENT_STORAGE);
	}		

	public UserStorage getUserStorage()
	{
		return (UserStorage) CraftCtxt.getInstance().getStorage(CraftConstants.USER_STORAGE);
	}		

	public UserTxnStorage getUserTxnStorage()
	{
		return (UserTxnStorage) CraftCtxt.getInstance().getStorage(CraftConstants.USER_TXN_STORAGE);
	}		
	
}
