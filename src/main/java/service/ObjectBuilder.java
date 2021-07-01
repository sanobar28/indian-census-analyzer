package service;

import model.IndiaStateCodeCSV;
import model.IndianCensusCSV;

public class ObjectBuilder {

	 
		public static IndianCensusCSV createObjectOfIndianCensus(String[] data) {
			String state = data[0];
			int population = Integer.parseInt(data[1]);
			int areaPerSqKm = Integer.parseInt(data[2]);
			int densityPerSqKm = Integer.parseInt(data[3]);
			
			return new IndianCensusCSV(state,population,areaPerSqKm,densityPerSqKm);
		}
		
		/**
		 * @param data
		 * @return object of State code pojo
		 */
		public static IndiaStateCodeCSV createObjectOfIndianStateCode(String[] data) {
			int serialNumber = Integer.parseInt(data[0]);
			String stateName = data[1];
			int tin = Integer.parseInt(data[2]);
			String stateCode = data[3];
			
			return new IndiaStateCodeCSV(serialNumber,stateName,tin,stateCode);
			
		}

}
