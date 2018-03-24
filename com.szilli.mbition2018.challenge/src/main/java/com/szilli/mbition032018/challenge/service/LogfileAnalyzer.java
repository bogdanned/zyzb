package com.szilli.mbition032018.challenge.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.szilli.mbition032018.challenge.config.LogfileAnalyzerProperties;
import com.szilli.mbition032018.challenge.model.LogInfo;

@Service
public class LogfileAnalyzer {

	@Autowired
	LogFileParser logFileParser;

	public Set<LogInfo> getLogInfo() {

		Set<LogInfo> lstLogInfos = new HashSet<LogInfo>();
		lstLogInfos.add(logFileParser.parseLogInfo());
		return lstLogInfos;
	}

}
