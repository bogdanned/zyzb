/**********************************************************************************
 * LogfileAnalyzerController.java
 *
 * @author Shrinivas Zilli (szilli@bekast.de)
 * Created on Mar 24, 2018
 *
 * Copyright (c) 2018 Bekast IT Consulting GmbH, All rights reserved.
 **********************************************************************************/

package com.szilli.mbition032018.challenge.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.szilli.mbition032018.challenge.model.LogInfo;
import com.szilli.mbition032018.challenge.service.LogfileAnalyzer;

/**
 * The Class LogfileAnalyzerController.
 */
@RestController
public class LogfileAnalyzerController {
  
  /** The log file analyzer. */
  @Autowired
  private LogfileAnalyzer logFileAnalyzer;


  /**
   * Gets the log info.
   *
   * @return the log info
   */
  @RequestMapping(method = RequestMethod.GET, value = "/mbition2018/loginfo")
  public Set<LogInfo> getLogInfo() {
    return logFileAnalyzer.getLogInfo();
  }

}
