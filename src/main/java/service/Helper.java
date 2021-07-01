package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import exception.CensusAnalyserException;
import model.IndiaStateCodeCSV;
import model.IndianCensusCSV;

public class Helper<E> {

	
	public static List<IndiaStateCodeCSV> readIndianStateCodeCsv(String csvFilepath) throws CensusAnalyserException{
		List<IndiaStateCodeCSV> returnList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(csvFilepath)))
		{
			@SuppressWarnings("unused")
			String headerLine = reader.readLine();
			String line = reader.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				IndiaStateCodeCSV csvmodel = ObjectBuilder.createObjectOfIndianStateCode(attributes);
				returnList.add(csvmodel);
				line = reader.readLine();
			}
		}
		catch(IOException e) {
			throw new CensusAnalyserException(e.getMessage(),CensusAnalyserException.ExceptionType.INCORRECT_FILE);
		}
		catch(RuntimeException e) {
			throw new CensusAnalyserException(e.getMessage(),CensusAnalyserException.ExceptionType.IMPROPER_CSV);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
	
	
	public static List<IndianCensusCSV> readIndianStateCensusCsv(String csvFilepath) throws CensusAnalyserException{
		List<IndianCensusCSV> returnList = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(csvFilepath)))
		{
			@SuppressWarnings("unused")
			String headerLine = reader.readLine();
			String line = reader.readLine();
			while(line != null) {
				String[] attributes = line.split(",");
				IndianCensusCSV csvmodel = ObjectBuilder.createObjectOfIndianCensus(attributes);
				returnList.add(csvmodel);
				line = reader.readLine();
			}
		}
		catch(IOException e) {
			throw new CensusAnalyserException(e.getMessage(),CensusAnalyserException.ExceptionType.INCORRECT_FILE);
		}
		catch(RuntimeException e) {
			throw new CensusAnalyserException(e.getMessage(),CensusAnalyserException.ExceptionType.IMPROPER_CSV);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return returnList;
	}
}
