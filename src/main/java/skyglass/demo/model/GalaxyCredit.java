package skyglass.demo.model;

public class GalaxyCredit {
	
	private GalaxyUnit galaxyUnit;
	
	private GalaxyNumber galaxyNumber;
	
	public GalaxyCredit(GalaxyUnit galaxyUnit, GalaxyNumber galaxyNumber) {
		this.galaxyUnit = galaxyUnit;	
		this.galaxyNumber = galaxyNumber;
	}
	
	public GalaxyUnit getGalaxyUnit() {
		return galaxyUnit;
	}

	public GalaxyNumber getGalaxyNumber() {
		return galaxyNumber;
	}
	
	public String getCredits() {
		return "( " 
				+ galaxyNumber.getRomanValue() 
				+ " / " + galaxyUnit.getGalaxyNumber().getRomanValue()
				+ " )"
				+ " * "
				+ String.valueOf(galaxyUnit.getCredits());
	}

}
