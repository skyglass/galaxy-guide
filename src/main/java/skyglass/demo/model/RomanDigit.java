package skyglass.demo.model;

public enum RomanDigit {
	
	I("I", 1),
	V("V", 5),
	X("X", 10),
	L("L", 50),
	C("C", 100),
	D("D", 500),
	M("M", 1000);
	
	
	private String symbol;
	
	private int value;
	
	private RomanDigit(String symbol, int value) {
		this.symbol = symbol;
		this.value = value;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public int getValue() {
		return value;
	}

}
