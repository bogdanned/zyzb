package com.szilli.mbition032018.challenge.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		logInfo.setMaxSearchedKeyword(new SearchedString("Denmark", 6,"GLOBAL"));
		
		List<MovingStatus> movingStatuses = getMovingStatuses();
		logInfo.setMovingStatuses(movingStatuses);
		logInfo.setCurrentStatus(new MovingStatus("VEHICLE_PARKED", 1));
		
		
		List<InputDevice> inputDevices = getInputDevices();
		logInfo.setInputDevices(inputDevices);
		logInfo.setLastUsedInputDevice(new InputDevice("TOUCHSCREEN", 24));
		
		return logInfo;
	}

	private List<InputDevice> getInputDevices() {
		
		List<InputDevice> inputDevices = new ArrayList<>();
		inputDevices.add(new InputDevice("HARDKEY", 24));
		inputDevices.add(new InputDevice("OFN", 24));
		inputDevices.add(new InputDevice("TOUCHPAD", 24));
		inputDevices.add(new InputDevice("TOUCHSCREEN", 24));
		
		return inputDevices;
	}

	private List<MovingStatus> getMovingStatuses() {
		List<MovingStatus> movingStatuses = new ArrayList<>();
		movingStatuses.add(new MovingStatus("VEHICLE_PARKED", 1));
		movingStatuses.add(new MovingStatus("VEHICLE_NOT_MOVING", 2));
		movingStatuses.add(new MovingStatus("VEHICLE_SLOW_SPEED", 3));
		movingStatuses.add(new MovingStatus("VEHICLE_MOVING", 1));
		
		return movingStatuses;
	}

	private List<SearchedString> getSearchedStrings() {
		List<SearchedString> searchedStrings = new ArrayList<>();
//		PHONE _SEARCH
		searchedStrings.add(new SearchedString("Denmark", 5,"PHONE"));
		searchedStrings.add(new SearchedString("John", 2,"PHONE"));
		searchedStrings.add(new SearchedString("Leipzig", 3,"PHONE"));
		searchedStrings.add(new SearchedString("Mike", 5,"PHONE"));
		searchedStrings.add(new SearchedString("Simon", 3,"PHONE"));

		// FM _SEARCH
		searchedStrings.add(new SearchedString("Berlin", 3,"FM"));
		searchedStrings.add(new SearchedString("Dresden", 3,"FM"));
		searchedStrings.add(new SearchedString("Munich", 6,"FM"));
		searchedStrings.add(new SearchedString("Stuttgart", 5,"FM"));

		// GLOBAL _SEARCH
		searchedStrings.add(new SearchedString("Denmark", 6,"GLOBAL"));
		searchedStrings.add(new SearchedString("Essen", 3,"GLOBAL"));
		searchedStrings.add(new SearchedString("Gabriel", 2,"GLOBAL"));
		searchedStrings.add(new SearchedString("Mike", 3,"GLOBAL"));
		searchedStrings.add(new SearchedString("Norway", 3,"GLOBAL"));
		searchedStrings.add(new SearchedString("Sweden", 1,"GLOBAL"));
		return searchedStrings;
	}

	private List<Application> getApplications() {

		try {
			List<String> logFileContents = IOUtils.readLines(
					resourceLoader.getResource("classpath:" + appProperties.getLogFileName()).getInputStream());
			for (String logfileLine : logFileContents) {
				// TODO:Loop and create application and put in list
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BLUETOOTH=11.248
		// CARINFO_CARDATA=10.695
		// COMFORT_MASSAGE=21.189
		// FM_DAB=53.384
		// PHONE=63.615
		// SETTINGS_SHORTCUTS=12.857
		// HOME_SCREEN_ACTIVATED=115.817
		List<Application> lstApplications = new ArrayList<Application>();

		lstApplications.add(new Application("BLUETOOTH", 11.248f));
		lstApplications.add(new Application("CARINFO_CARDATA", 10.695f));
		lstApplications.add(new Application("COMFORT_MASSAGE", 21.189f));
		lstApplications.add(new Application("FM_DAB", 53.384f));
		lstApplications.add(new Application("PHONE", 63.615f));
		lstApplications.add(new Application("SETTINGS_SHORTCUTS", 12.857f));
		lstApplications.add(new Application("HOME_SCREEN_ACTIVATED", 115.817f));
		lstApplications.add(new Application("GLOBAL", 1f));

		return lstApplications;
	}

}
