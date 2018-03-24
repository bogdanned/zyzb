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
	private MovingStatus movingStatus;
	
	/** The input device. */
	private InputDevice inputDevice;
	
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
	
	/**
	 * Gets the moving status.
	 *
	 * @return the moving status
	 */
	public MovingStatus getMovingStatus() {
		return movingStatus;
	}
	
	/**
	 * Sets the moving status.
	 *
	 * @param movingStatus the new moving status
	 */
	public void setMovingStatus(MovingStatus movingStatus) {
		this.movingStatus = movingStatus;
	}
	
	/**
	 * Gets the input device.
	 *
	 * @return the input device
	 */
	public InputDevice getInputDevice() {
		return inputDevice;
	}
	
	/**
	 * Sets the input device.
	 *
	 * @param inputDevice the new input device
	 */
	public void setInputDevice(InputDevice inputDevice) {
		this.inputDevice = inputDevice;
	}



}
