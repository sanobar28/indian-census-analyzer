package model;

public class IndianCensusCSV {

	public String state;
	public int population;
	public int areaPerSqKm;
	public int densityPerSqKm;
	
	
	public IndianCensusCSV(String state, int population, int areaPerSqKm, int densityPerSqKm) {
		this.state = state;
		this.population = population;
		this.areaPerSqKm = areaPerSqKm;
		this.densityPerSqKm = densityPerSqKm;
	}
	
}
