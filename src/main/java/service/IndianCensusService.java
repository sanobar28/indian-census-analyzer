package service;

import java.util.List;

import exception.CensusAnalyserException;
import model.IndiaStateCodeCSV;
import model.IndianCensusCSV;

public class IndianCensusService {
	
	private List<IndianCensusCSV> censuslist ;
	private List<IndiaStateCodeCSV> stateCodeList;
	/**
	 * @param csvFilePath
	 * @return number of entries in census csv file.
	 * @throws CustomCsvException
	 */
	public int getSizeOfCsv(String csvFilePath) throws CensusAnalyserException {
		censuslist = Helper.readIndianStateCensusCsv(csvFilePath );
		return censuslist.size();
	}
	
	/**
	 * @param csvFileParth
	 * @return number of entries in State code csv file
	 * @throws CustomCsvException
	 */
	public int getSizeOfIndianStateCodeCsv(String csvFileParth) throws CensusAnalyserException {
		stateCodeList = Helper.readIndianStateCodeCsv(csvFileParth);
		return stateCodeList.size();
	}

}
