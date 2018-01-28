package com.craft.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.craft.persist.EventStorage;
import com.craft.persist.Storage;
import com.craft.persist.UserStorage;
import com.craft.persist.UserTxnStorage;

public class CraftCtxt {
	
	//this could be context listener initialized and stored in initial context
	//for simplicity making it a singleton
	
	private Map<String,Storage> storageSrc = null;
	
	public Storage getStorage(String type)
	{
		return storageSrc.get(type);
	}		
	
	private static CraftCtxt ctxt = null;

	private CraftCtxt()
	{
		storageSrc = new ConcurrentHashMap<String,Storage>();
		storageSrc.put(CraftConstants.EVENT_STORAGE, new EventStorage());
		storageSrc.put(CraftConstants.USER_STORAGE, new UserStorage());
		storageSrc.put(CraftConstants.USER_TXN_STORAGE, new UserTxnStorage());
	}
	
	public static CraftCtxt getInstance()
	{
		if(ctxt==null)
		{
			synchronized(ctxt)
			{
				ctxt = new CraftCtxt();
			}
		}
		else
		{
			return ctxt;
		}
		return null;
	}
	
	
}
