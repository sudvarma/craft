package com.craft.dao;

import com.craft.core.CraftConstants;
import com.craft.core.CraftCtxt;
import com.craft.persist.Storage;

public abstract class BaseDAO {
	
	public Storage getEventStorage()
	{
		return CraftCtxt.getInstance().getStorage(CraftConstants.EVENT_STORAGE);
	}		

	public Storage geUserStorage()
	{
		return CraftCtxt.getInstance().getStorage(CraftConstants.USER_STORAGE);
	}		

	public Storage getUserTxnStorage()
	{
		return CraftCtxt.getInstance().getStorage(CraftConstants.USER_TXN_STORAGE);
	}		
	
}
