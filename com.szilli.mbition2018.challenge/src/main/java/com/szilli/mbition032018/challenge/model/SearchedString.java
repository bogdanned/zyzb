/**********************************************************************************
 * SearchedString.java
 *
 * @author Shrinivas Zilli (szilli@bekast.de)
 * Created on Mar 24, 2018
 *
 * Copyright (c) 2018 Bekast IT Consulting GmbH, All rights reserved.
 **********************************************************************************/
package com.szilli.mbition032018.challenge.model;

/**
 * The Class SearchedString.
 */
public class SearchedString {
	
	private Application application;
	
	/** The keyword searched. */
	private String keywordSearched;
	
	/** The number of times searched. */
	private int numberOfTimesSearched;
	
	/**
	 * Instantiates a new searched string.
	 */
	public SearchedString() {
	}
	
	/**
	 * Instantiates a new searched string.
	 *
	 * @param keywordSearched the keyword searched
	 * @param numberOfTimesSearched the number of times searched
	 */
	public SearchedString(String keywordSearched, int numberOfTimesSearched) {
		this.keywordSearched = keywordSearched;
		this.numberOfTimesSearched = numberOfTimesSearched;
	}

	/**
	 * Gets the keyword searched.
	 *
	 * @return the keyword searched
	 */
	public String getKeywordSearched() {
		return keywordSearched;
	}

	public Application getApplication() {
		return application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}

	/**
	 * Sets the keyword searched.
	 *
	 * @param keywordSearched the new keyword searched
	 */
	public void setKeywordSearched(String keywordSearched) {
		this.keywordSearched = keywordSearched;
	}

	/**
	 * Gets the number of times searched.
	 *
	 * @return the number of times searched
	 */
	public int getNumberOfTimesSearched() {
		return numberOfTimesSearched;
	}

	/**
	 * Sets the number of times searched.
	 *
	 * @param numberOfTimesSearched the new number of times searched
	 */
	public void setNumberOfTimesSearched(int numberOfTimesSearched) {
		this.numberOfTimesSearched = numberOfTimesSearched;
	}
	
	
}
