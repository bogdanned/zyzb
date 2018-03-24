/**********************************************************************************
 * LogInfo.java
 *
 * @author Shrinivas Zilli (szilli@bekast.de)
 * Created on Mar 24, 2018
 *
 * Copyright (c) 2018 Bekast IT Consulting GmbH, All rights reserved.
 **********************************************************************************/
package com.szilli.mbition032018.challenge.model;

import java.util.List;

/**
 * The Class LogInfo.
 */
public class LogInfo{

	
	/** The searched strings. */
	private List<SearchedString> searchedStrings;
	
	/** The applications. */
	private List<Application> applications;
	
	/** The moving status. */
	private List<MovingStatus> movingStatuses;
	
	/** The input device. */
	private List<InputDevice> inputDevices;
	
	private MovingStatus currentStatus;
	private SearchedString maxSearchedKeyword;
	private InputDevice lastUsedInputDevice;
	
	public List<MovingStatus> getMovingStatuses() {
		return movingStatuses;
	}

	public void setMovingStatuses(List<MovingStatus> movingStatuses) {
		this.movingStatuses = movingStatuses;
	}

	public List<InputDevice> getInputDevices() {
		return inputDevices;
	}

	public void setInputDevices(List<InputDevice> inputDevices) {
		this.inputDevices = inputDevices;
	}

	/**
	 * Gets the searched strings.
	 *
	 * @return the searched strings
	 */
	public List<SearchedString> getSearchedStrings() {
		return searchedStrings;
	}
	
	/**
	 * Sets the searched strings.
	 *
	 * @param searchedStrings the new searched strings
	 */
	public void setSearchedStrings(List<SearchedString> searchedStrings) {
		this.searchedStrings = searchedStrings;
	}
	
	/**
	 * Gets the applications.
	 *
	 * @return the applications
	 */
	public List<Application> getApplications() {
		return applications;
	}
	
	/**
	 * Sets the applications.
	 *
	 * @param applications the new applications
	 */
	public void setApplications(List<Application> applications) {
		this.applications = applications;
	}

	public MovingStatus getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(MovingStatus currentStatus) {
		this.currentStatus = currentStatus;
	}

	public SearchedString getMaxSearchedKeyword() {
		return maxSearchedKeyword;
	}

	public void setMaxSearchedKeyword(SearchedString maxSearchedKeyword) {
		this.maxSearchedKeyword = maxSearchedKeyword;
	}

	public InputDevice getLastUsedInputDevice() {
		return lastUsedInputDevice;
	}

	public void setLastUsedInputDevice(InputDevice lastUsedInputDevice) {
		this.lastUsedInputDevice = lastUsedInputDevice;
	}
	



}
