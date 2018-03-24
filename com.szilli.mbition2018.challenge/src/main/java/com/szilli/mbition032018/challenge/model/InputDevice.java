package com.szilli.mbition032018.challenge.model;

public class InputDevice {
	private String name;
	private int numberOfTimesUsed;
	public InputDevice() {
	}
	public InputDevice(String deviceAction, int numberOfTimesUsed) {
		this.name = deviceAction;
		this.numberOfTimesUsed = numberOfTimesUsed;
	}
	public String getDeviceName() {
		return name;
	}
	public void setDeviceName(String deviceName) {
		this.name = deviceName;
	}
	public int getNumberOfTimesUsed() {
		return numberOfTimesUsed;
	}
	public void setNumberOfTimesUsed(int numberOfTimesUsed) {
		this.numberOfTimesUsed = numberOfTimesUsed;
	}
	
}
