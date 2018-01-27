package com.craft.impl;

import java.util.Date;

import com.craft.core.Transaction;

public class TxnImpl implements Transaction 
{
	
	public long userId = -1;
	
	public long eventId = -1;
	
	public long amount = -1;
	
	public Date dateTime = null;

	@Override
	public long fromUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public long toEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	@Override
	public long amount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Override
	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	
}
