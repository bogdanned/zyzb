package com.szilli.mbition032018.challenge.model;

public class MovingStatus {
	private String status;
	private int numberOfTimes;
	
	public MovingStatus() {
	}
	
	public MovingStatus(String status,int times) {
		this.status = status;
		this.numberOfTimes = times;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNumberOfTimes() {
		return numberOfTimes;
	}

	public void setNumberOfTimes(int numberOfTimes) {
		this.numberOfTimes = numberOfTimes;
	}
	
	
}
