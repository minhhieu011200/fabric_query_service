package com.example.query_farbric.entities;

import jakarta.validation.constraints.NotNull;


public class EventType<T> extends Entities {
	@NotNull
	private String aggregateId;
	
	@NotNull
	private String eventType;
	
	@NotNull
    private T payload;
	
	private Boolean isProccessed;
	
	public String getAggregateId() {
		return aggregateId;
	}

	public String getEventType() {
		return eventType;
	}

	public T getPayload() {
		return payload;
	}

	public Boolean getIsProccessed() {
		return isProccessed;
	}

	public void setAggregateId(String aggregateId) {
		this.aggregateId = aggregateId;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public void setPayload(T payload) {
		this.payload = payload;
	}

	public void setIsProccessed(Boolean isProccessed) {
		this.isProccessed = isProccessed;
	}


	
	
	
}
