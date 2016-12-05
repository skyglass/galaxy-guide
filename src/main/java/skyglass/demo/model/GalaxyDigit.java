package skyglass.demo.model;

public class GalaxyDigit {
	
	private String symbol;
	
	private RomanDigit romanDigit;
	
	public GalaxyDigit(String symbol, RomanDigit romanDigit) {
		this.symbol = symbol;
		this.romanDigit = romanDigit;
	}
	
	public String getSymbol() {
		return symbol;
	}

	public RomanDigit getRomanDigit() {
		return romanDigit;
	}	

}
