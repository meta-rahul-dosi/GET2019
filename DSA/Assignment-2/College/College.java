package College;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class College {

	//Scanner scanner = new Scanner(System.in);

	int noOfPrograms() {
		int number = 1000;
		return number;
	}

	Map<String, Integer> Programs() {
		Map<String, Integer> programs = new HashMap<>();
		programs.put("cs",60);
		programs.put("it",60);
		programs.put("me",60);
		programs.put("ee",60);
		return programs;
	}
}
