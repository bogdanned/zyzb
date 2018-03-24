/**********************************************************************************
 * LogfileAnalyzerProperties.java
 *
 * @author Shrinivas Zilli (szilli@bekast.de)
 * Created on Mar 24, 2018
 *
 * Copyright (c) 2018 Bekast IT Consulting GmbH, All rights reserved.
 **********************************************************************************/
package com.szilli.mbition032018.challenge.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The Class LogfileAnalyzerProperties.
 */
@Component
@ConfigurationProperties("mbition.loganalyzer")
public class LogfileAnalyzerProperties {

	/** The log file name. */
	private String logFileName;
	
	private String outputTimeSpentPerAppFileName;
	
	private String outputSearchedStringFileName;
	private String outputMovingStateFileName;
	private String outputInputDeviceusageFileName;
	

	/**
	 * Gets the log file name.
	 *
	 * @return the log file name
	 */
	public String getLogFileName() {
		return logFileName;
	}

	/**
	 * Sets the log file name.
	 *
	 * @param logFileName the new log file name
	 */
	public void setLogFileName(String logFileName) {
		this.logFileName = logFileName;
	}

	public String getOutputTimeSpentPerAppFileName() {
		return outputTimeSpentPerAppFileName;
	}

	public void setOutputTimeSpentPerAppFileName(String outputTimeSpentPerAppFileName) {
		this.outputTimeSpentPerAppFileName = outputTimeSpentPerAppFileName;
	}

	public String getOutputSearchedStringFileName() {
		return outputSearchedStringFileName;
	}

	public void setOutputSearchedStringFileName(String outputSearchedStringFileName) {
		this.outputSearchedStringFileName = outputSearchedStringFileName;
	}

	public String getOutputMovingStateFileName() {
		return outputMovingStateFileName;
	}

	public void setOutputMovingStateFileName(String outputMovingStateFileName) {
		this.outputMovingStateFileName = outputMovingStateFileName;
	}

	public String getOutputInputDeviceusageFileName() {
		return outputInputDeviceusageFileName;
	}

	public void setOutputInputDeviceusageFileName(String outputInputDeviceusageFileName) {
		this.outputInputDeviceusageFileName = outputInputDeviceusageFileName;
	}


}
