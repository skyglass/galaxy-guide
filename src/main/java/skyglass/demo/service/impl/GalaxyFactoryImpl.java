package skyglass.demo.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import skyglass.demo.model.GalaxyCredit;
import skyglass.demo.model.GalaxyDigit;
import skyglass.demo.model.GalaxyNumber;
import skyglass.demo.model.GalaxyUnit;
import skyglass.demo.model.RomanDigit;
import skyglass.demo.service.GalaxyFactory;

public class GalaxyFactoryImpl implements GalaxyFactory {
	
	private Map<String, GalaxyDigit> galaxyDigitMap = new HashMap<String, GalaxyDigit>();
	
	private Map<String, GalaxyUnit> galaxyUnitMap = new HashMap<String, GalaxyUnit>();

	@Override
	public void addGalaxyDigit(String symbol, String romanDigit) {
		galaxyDigitMap.put(symbol, new GalaxyDigit(symbol, RomanDigit.valueOf(romanDigit)));		
	}

	@Override
	public GalaxyDigit getGalaxyDigit(String symbol) {
		return galaxyDigitMap.get(symbol);
	}

	@Override
	public GalaxyNumber getGalaxyNumber(String... galaxyDigits) {
		List<GalaxyDigit> digitList = new ArrayList<GalaxyDigit>();
		for (String galaxyDigit: galaxyDigits) {
			digitList.add(getGalaxyDigit(galaxyDigit));
		}
		return new GalaxyNumber(digitList.toArray(new GalaxyDigit[0]));
	}

	@Override
	public void addGalaxyUnit(String symbol, int credits, String... galaxyDigits) {
		galaxyUnitMap.put(symbol, new GalaxyUnit(symbol, getGalaxyNumber(galaxyDigits), credits));		
	}

	@Override
	public GalaxyUnit getGalaxyUnit(String symbol) {
		return galaxyUnitMap.get(symbol);
	}

	@Override
	public String getRomanValue(String... galaxyDigits) {
		List<GalaxyDigit> digitList = new ArrayList<GalaxyDigit>();
		for (String galaxyDigit: galaxyDigits) {
			digitList.add(getGalaxyDigit(galaxyDigit));
		}
		return new GalaxyNumber(digitList.toArray(new GalaxyDigit[0])).getRomanValue();
	}

	@Override
	public String getCredits(String galaxyUnit, String... galaxyDigits) {
		return new GalaxyCredit(getGalaxyUnit(galaxyUnit), getGalaxyNumber(galaxyDigits)).getCredits();
	}

}
