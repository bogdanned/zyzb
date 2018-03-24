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
public class SearchedString implements Comparable<SearchedString>{
	
	
	/** The keyword searched. */
	private String keywordSearched;
	
	/** The number of times searched. */
	private int numberOfTimesSearched;
	
	private String applicationUsed;
	
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
	public SearchedString(String keywordSearched, int numberOfTimesSearched,String appUsed) {
		this.keywordSearched = keywordSearched;
		this.numberOfTimesSearched = numberOfTimesSearched;
		this.applicationUsed = appUsed;
	}

	/**
	 * Gets the keyword searched.
	 *
	 * @return the keyword searched
	 */
	public String getKeywordSearched() {
		return keywordSearched;
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

	public String getApplicationUsed() {
		return applicationUsed;
	}

	public void setApplicationUsed(String applicationUsed) {
		this.applicationUsed = applicationUsed;
	}

	@Override
	public int compareTo(SearchedString other) {
		if(this.getNumberOfTimesSearched() == other.getNumberOfTimesSearched())
			return 0;
		else if(this.getNumberOfTimesSearched() > other.getNumberOfTimesSearched())
			return -1;
		else			
			return 1;
	}
	
	
}
