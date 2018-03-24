package com.szilli.mbition032018.challenge.model;

public class InputDevice {
	private String deviceAction;
	private int numberOfTimesUsed;
	public InputDevice() {
	}
	public InputDevice(String deviceAction, int numberOfTimesUsed) {
		this.deviceAction = deviceAction;
		this.numberOfTimesUsed = numberOfTimesUsed;
	}
	public String getDeviceAction() {
		return deviceAction;
	}
	public void setDeviceAction(String deviceAction) {
		this.deviceAction = deviceAction;
	}
	public int getNumberOfTimesUsed() {
		return numberOfTimesUsed;
	}
	public void setNumberOfTimesUsed(int numberOfTimesUsed) {
		this.numberOfTimesUsed = numberOfTimesUsed;
	}
	
}
