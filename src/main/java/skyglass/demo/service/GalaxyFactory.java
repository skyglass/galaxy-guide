package skyglass.demo.service;

import skyglass.demo.model.GalaxyDigit;
import skyglass.demo.model.GalaxyNumber;
import skyglass.demo.model.GalaxyUnit;
import skyglass.demo.model.RomanDigit;

public interface GalaxyFactory {
	
	public void addGalaxyDigit(String symbol, String romanDigit);
	
	public GalaxyDigit getGalaxyDigit(String symbol);
	
	public GalaxyNumber getGalaxyNumber(String... galaxyDigits);
	
	public void addGalaxyUnit(String symbol, int credits, String... galaxyDigits);
	
	public GalaxyUnit getGalaxyUnit(String symbol);
	
	public String getRomanValue(String... galaxyDigits);
	
	public String getCredits(String galaxyUnit, String... galaxyDigits);
	
	

}
