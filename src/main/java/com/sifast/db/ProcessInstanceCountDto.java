package com.sifast.db;

public class ProcessInstanceCountDto {

	private String key;

	private int instanceCount;

	private String endEventName;

	private String endEventId;

	public String getEndEventId() {
		return endEventId;
	}

	public void setEndEventId(String endEventId) {
		this.endEventId = endEventId;
	}

	public String getEndEventName() {
		return endEventName;
	}

	public void setEndEventName(String endEventName) {
		this.endEventName = endEventName;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public int getInstanceCount() {
		return instanceCount;
	}

	public void setInstanceCount(int instanceCount) {
		this.instanceCount = instanceCount;
	}
}
