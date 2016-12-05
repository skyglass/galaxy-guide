package skyglass.demo.model;

public class GalaxyNumber {
	
	private GalaxyDigit[] galaxyDigits;
	
	public GalaxyNumber(GalaxyDigit[] galaxyDigits) {
		this.galaxyDigits = galaxyDigits;
	}
	
	public GalaxyDigit[] getGalaxyDigits() {
		return galaxyDigits;
	}
	
	public String getRomanValue() {
		StringBuilder sb = new StringBuilder();
		for (GalaxyDigit galaxyDigit: galaxyDigits) {
			sb.append(galaxyDigit.getRomanDigit().getSymbol());
		}
		return sb.toString();
	}	

}
