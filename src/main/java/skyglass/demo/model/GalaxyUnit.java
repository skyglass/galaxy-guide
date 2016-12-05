package skyglass.demo.model;

public class GalaxyUnit {
	
	private GalaxyNumber galaxyNumber;
	
	private String symbol;
	
	private int credits;
	
	public GalaxyUnit(String symbol, GalaxyNumber galaxyNumber, int credits) {
		this.symbol = symbol;
		this.galaxyNumber = galaxyNumber;
		this.credits = credits;
	}
	
	public GalaxyNumber getGalaxyNumber() {
		return galaxyNumber;
	}

	public String getSymbol() {
		return symbol;
	}	
	
	public int getCredits() {
		return credits;
	}
	
	

}
