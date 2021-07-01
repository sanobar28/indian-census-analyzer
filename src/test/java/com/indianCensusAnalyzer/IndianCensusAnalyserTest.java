package com.indianCensusAnalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import exception.CensusAnalyserException;
import service.IndianCensusService;

public class IndianCensusAnalyserTest {
	
	static String INCORRECT = "C:\\Users\\User\\eclipse-workspace\\IndianCensusAnalyzer\\src\\main\\resources\\CensusDataIncorrectDelimiter.csv";
	static String INCORRECT1 = "C:\\Users\\User\\eclipse-workspace\\IndianCensusAnalyzer\\src\\main\\resources\\IndianStateCodeIncorrect.csv";
	static String CSV_LOCATION = "C:\\Users\\User\\eclipse-workspace\\IndianCensusAnalyzer\\src\\main\\resources\\CensusStateCodeCSV.csv";
	static String CSV_CENSUS = "C:\\Users\\User\\eclipse-workspace\\IndianCensusAnalyzer\\src\\main\\resources\\IndianStateCensus.csv";

IndianCensusService census = null;
	
	@Before
	public void setUp() {
		census = new IndianCensusService();
	}

	@Test
	public void  given_IndianCensusCSVFile_ReturnsNumberOfRecords() throws CensusAnalyserException {
		int result = census.getSizeOfCsv(CSV_LOCATION);
		Assert.assertEquals(30, result);
	}
	
	@Test
	public void given_IndianCensusCSVFile_WhenIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv("IndiaStateCensusdddata.csv");
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE, e.type);
		}	
	}
	
	@Test
	public void given_IndianCensusCSVFile_WhenTypeIsIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv("IndianStateCensus.txt");
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE, e.type);
		}	
	}
	
	@Test
	public void given_IndianCensusCSVFile_WhenCorrectButDelimitorIsIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv(INCORRECT);
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.IMPROPER_CSV, e.type);
		}	
	}
	
	@Test
	public void  given_IndianStateCodeCSVFile_ReturnsNumberOfRecords() throws CensusAnalyserException {
		int result = census.getSizeOfIndianStateCodeCsv(CSV_CENSUS);
		Assert.assertEquals(37, result);
	}
	
	@Test
	public void given_IndianStateCodeCSVFile_WhenIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv("IndiaStateCodeeee.csv");
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE, e.type);
		}	
	}
	
	@Test
	public void given_IndianStateCodeCSVFile_WhenTypeIsIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv("CensusStateCodeCSV.txt");
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.INCORRECT_FILE, e.type);
		}	
	}
	
	@Test
	public void given_IndianStateCodeCSVFile_WhenCorrectButDelimitorIsIncorrect_ThrowsCustomException() {
		try {
			@SuppressWarnings("unused")
			int result = census.getSizeOfCsv(INCORRECT1);
		}
		catch(CensusAnalyserException e) {
			Assert.assertEquals(CensusAnalyserException.ExceptionType.IMPROPER_CSV, e.type);
		}	
	}

}
