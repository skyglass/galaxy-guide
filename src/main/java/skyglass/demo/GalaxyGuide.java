package skyglass.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import skyglass.demo.service.GalaxyFactory;
import skyglass.demo.service.impl.GalaxyFactoryImpl;

public class GalaxyGuide {
	
	public static void main(String[] args) {
		GalaxyFactory galaxyFactory = new GalaxyFactoryImpl();
		galaxyFactory.addGalaxyDigit("glob", "I");
		galaxyFactory.addGalaxyDigit("prok", "V");
		galaxyFactory.addGalaxyDigit("pish", "X");
		galaxyFactory.addGalaxyDigit("tegj", "L");
		galaxyFactory.addGalaxyUnit("Silver", 34, "glob", "glob");
		galaxyFactory.addGalaxyUnit("Gold", 57800, "glob", "prok");
		galaxyFactory.addGalaxyUnit("Iron", 3910, "pish", "pish");
		
		System.out.println("pish tegj glob glob is "
						+ galaxyFactory.getRomanValue("pish", "tegj", "glob", "glob"));
		
		System.out.println("glob prok Silver is ["
				+ galaxyFactory.getCredits("Silver", "glob", "prok")
				+ "] Credits");
		
		System.out.println("glob prok Gold is ["
				+ galaxyFactory.getCredits("Gold", "glob", "prok")
				+ "] Credits");
		
		System.out.println("glob prok Iron is ["
				+ galaxyFactory.getCredits("Iron", "glob", "prok")
				+ "] Credits");		
		
		System.out.println("I have no idea what you are talking about");			
	}
	
	//TODO: to be implemented
	@SuppressWarnings("unused")
	private static void parseInputFile(GalaxyFactory galaxyFactory) {
		String fileName = "input.txt";

		//read file into stream, try-with-resources
		try (Stream<String> stream = Files.lines(Paths.get(fileName))) {

			stream.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
