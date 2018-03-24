package com.szilli.mbition032018.challenge.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import com.szilli.mbition032018.challenge.config.LogfileAnalyzerProperties;
import com.szilli.mbition032018.challenge.model.Application;
import com.szilli.mbition032018.challenge.model.InputDevice;
import com.szilli.mbition032018.challenge.model.LogInfo;
import com.szilli.mbition032018.challenge.model.MovingStatus;
import com.szilli.mbition032018.challenge.model.SearchedString;

@Component
public class LogFileParser {
	@Autowired
	private ResourceLoader resourceLoader;
	@Autowired
	LogfileAnalyzerProperties appProperties;

	public LogFileParser() {
	}

	/**
	 * parses the log info and sends back the parsed result
	 * 
	 * @return
	 */
	public LogInfo parseLogInfo() {
		LogInfo logInfo = new LogInfo();

		List<Application> applications = getApplications();
		logInfo.setApplications(applications);

		List<SearchedString> searchedStrings = getSearchedStrings();
		logInfo.setSearchedStrings(searchedStrings);
		logInfo.setMaxSearchedKeyword(logInfo.getSearchedStrings().get(0));
		
		List<MovingStatus> movingStatuses = getMovingStatuses();
		logInfo.setMovingStatuses(movingStatuses);
		//TODO: Replace the hardcoded current moving state and read from file
		logInfo.setCurrentStatus(new MovingStatus("VEHICLE_PARKED", 1));
		
		
		List<InputDevice> inputDevices = getInputDevices();
		logInfo.setInputDevices(inputDevices);
		//TODO: Replace the hardcoded currently used input device and read from file
		logInfo.setLastUsedInputDevice(new InputDevice("TOUCHSCREEN", 24));
		
		return logInfo;
	}

	private List<InputDevice> getInputDevices() {
		List<InputDevice> inputDevices = new ArrayList<>();
//		HARDKEY=24
//
//				OFN=0
//				TOUCHPAD=16
//
//				TOUCHSCREEN=118
//
//				Last Input Device Used=TOUCHSCREEN

		try {
			System.out.println("\n"+ appProperties.getOutputInputDeviceusageFileName() +" contents ");
			List<String> logFileContents = IOUtils.readLines(
					resourceLoader.getResource("classpath:" + appProperties.getOutputInputDeviceusageFileName()).getInputStream());
			for (String logfileLine : logFileContents) {
				
				if(logfileLine != null && !logfileLine.startsWith("Last Input Device Used")  && logfileLine.indexOf("=") > 0) {
					String[] strAppDetails = logfileLine.split("=");
					inputDevices.add(new InputDevice(strAppDetails[0], Integer.parseInt(strAppDetails[1])));
				}
				
				System.out.println(logfileLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return inputDevices;
	}

	private List<MovingStatus> getMovingStatuses() {
		List<MovingStatus> movingStatuses = new ArrayList<>();
//		VEHICLE_PARKED=1
//
//				VEHICLE_NOT_MOVING=2
//
//				VEHICLE_SLOW_SPEED=3
//
//				VEHICLE_MOVING=1
//
//				Current Movement status=VEHICLE_PARKED
//

		try {
			System.out.println("\n"+ appProperties.getOutputMovingStateFileName() +" contents ");
			List<String> logFileContents = IOUtils.readLines(
					resourceLoader.getResource("classpath:" + appProperties.getOutputMovingStateFileName()).getInputStream());
			for (String logfileLine : logFileContents) {
				// TODO:Loop and create application and put in list
				
				if(logfileLine != null && !logfileLine.startsWith("Current Movement status")  && logfileLine.indexOf("=") > 0) {
					String[] strAppDetails = logfileLine.split("=");
					movingStatuses.add(new MovingStatus(strAppDetails[0], Integer.parseInt(strAppDetails[1])));
				}
				
				System.out.println(logfileLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return movingStatuses;
	}

	private List<SearchedString> getSearchedStrings() {
//		PHONE_SEARCH
//		Denmark=5
//		John=2
//		Leipzig=3
//		Mike=5
//		Simon=3
//
//		FM_SEARCH
//		Berlin=3
//		Dresden=3
//		Munich=6
//		Stuttgart=5
//
//		GLOBAL _SEARCH
//		Denmark=6
//		Essen=3
//		Gabriel=2
//		Mike=3
//		Norway=3
//		Sweden=1
		List<SearchedString> searchedStrings = new ArrayList<>();
		try {
			System.out.println("\n"+ appProperties.getOutputSearchedStringFileName() +" contents ");
			List<String> logFileContents = IOUtils.readLines(
					resourceLoader.getResource("classpath:" + appProperties.getOutputSearchedStringFileName()).getInputStream());
			String appUsed = "";
			for (String logfileLine : logFileContents) {
				
				if(logfileLine != null && logfileLine.contains("_")) {
					appUsed = logfileLine;
				}
				if(logfileLine != null && logfileLine.indexOf("=") > 0) {
					String[] strAppDetails = logfileLine.split("=");
					searchedStrings.add(new SearchedString(strAppDetails[0], Integer.parseInt(strAppDetails[1]), appUsed));
				}
				System.out.println(logfileLine);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Collections.sort(searchedStrings);
		return searchedStrings;
	}

	private List<Application> getApplications() {

		List<Application> lstApplications = new ArrayList<Application>();
		try {
			System.out.println("\n"+ appProperties.getOutputTimeSpentPerAppFileName() +" contents ");
			List<String> logFileContents = IOUtils.readLines(
					resourceLoader.getResource("classpath:" + appProperties.getOutputTimeSpentPerAppFileName()).getInputStream());
			for (String logfileLine : logFileContents) {
				// TODO:Loop and create application and put in list
				System.out.println(logfileLine);
				if(logfileLine != null && logfileLine.indexOf("=") > 0) {
					String[] strAppDetails = logfileLine.split("=");
					lstApplications.add(new Application(strAppDetails[0], Float.parseFloat(strAppDetails[1])));
				}
					
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lstApplications;
	}

}
