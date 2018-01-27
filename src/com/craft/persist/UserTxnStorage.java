package com.craft.persist;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

import com.craft.core.Event;
import com.craft.core.Transaction;


public class UserTxnStorage implements Storage
{
	Map<Long,ConcurrentSkipListSet<Transaction>> userTxnsList = new ConcurrentHashMap<Long,ConcurrentSkipListSet<Transaction>>();

	public void addTxn(Event event, Transaction t)
	{
		if(userTxnsList.get(event.getEventId()) == null)
		{
			ConcurrentSkipListSet<Transaction> tlist = new ConcurrentSkipListSet<Transaction>();
			tlist.add(t);
			userTxnsList.put(event.getEventId(),tlist);
		}
		else
		{
			userTxnsList.get(event.getEventId()).add(t);
		}
	}
	
	public Set<Transaction> getTxns(Event e)
	{
		return userTxnsList.get(e.getEventId());
	}
	
}
