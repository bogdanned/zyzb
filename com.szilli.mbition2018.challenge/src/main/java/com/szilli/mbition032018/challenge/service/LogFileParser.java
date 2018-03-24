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
import com.szilli.mbition032018.challenge.model.LogInfo;

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
	 * @return
	 */
	public LogInfo parseLogInfo() {
		LogInfo logInfo = new LogInfo();
		
		List<Application> lstApplications = getApplications();
		
		return logInfo;
	}


	private List<Application> getApplications() {
		
		try {
			List<String> logFileContents = IOUtils.readLines(resourceLoader.getResource("classpath:"+appProperties.getLogFileName()).getInputStream());
			for(String logfileLine:logFileContents) {
				//TODO:Loop and create application and put in list
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		BLUETOOTH=11.248
//				CARINFO_CARDATA=10.695
//				COMFORT_MASSAGE=21.189
//				FM_DAB=53.384
//				PHONE=63.615
//				SETTINGS_SHORTCUTS=12.857
//				HOME_SCREEN_ACTIVATED=115.817
		List<Application> lstApplications = new ArrayList<Application>();
		
		lstApplications.add(new Application("BLUETOOTH",11.248f));
		lstApplications.add(new Application("BLUETOOTH",11.248f));
		lstApplications.add(new Application("BLUETOOTH",11.248f));
		
		
		
		return lstApplications;
	}
	
}
