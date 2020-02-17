package com.cpg.calldeatils;

public class Call {
	private int callId;
	private long calledNumber;
	private float duration;
	
	
	public long getCalledNumber() {
		return calledNumber;
	}


	public void setCalledNumber(long calledNumber) {
		this.calledNumber = calledNumber;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public void setCallId(int callId) {
		this.callId = callId;
	}

	public int getCallId()
	{
		return callId;
	}

	public void parseData(String details)
	{
			 String[] data=details.split(":");
			 setCallId(Integer.parseInt(data[0]));
			 setCalledNumber(Long.parseLong(data[1]));
			 setDuration(Float.parseFloat(data[2]));
	}
}
