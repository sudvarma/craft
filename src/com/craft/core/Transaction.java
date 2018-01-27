package com.craft.core;

import java.util.Date;

public interface Transaction {
	
	public long fromUserId();
	
	public long toEventId();
	
	public long amount();
	
	public Date getDateTime();

}
