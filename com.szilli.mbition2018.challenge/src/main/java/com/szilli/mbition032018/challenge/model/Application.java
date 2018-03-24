package com.szilli.mbition032018.challenge.model;

public class Application {

	private String name;
	private float timeSpent;

	public Application() {
	}

	public Application(String name, float timeSpent) {
		this.name = name;
		this.timeSpent = timeSpent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getTimeSpent() {
		return timeSpent;
	}

	public void setTimeSpent(float timeSpent) {
		this.timeSpent = timeSpent;
	}

}
