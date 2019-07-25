import java.util.*;

public class Reptile extends Animal {

	private int zoneNo = 0, cageNo = 0;
	int max_no_of_cages = 10;
	int max_no_of_animal = 10;

	private ArrayList<ArrayList<ArrayList<String>>> zones = new ArrayList<>();
	private ArrayList<ArrayList<String>> cages = new ArrayList<>();
	private ArrayList<String> attributes1 = new ArrayList<>();

	private Map<Integer, String> type_identifier = new HashMap<>();

	public void newAnimal(String type, String subtype, String name, String age,
			String weight) {

		if (attributes1.get(0) != subtype) {
			attributes1.add(subtype);
			attributes1.add(name);
			attributes1.add(age);
			attributes1.add(weight);
			cages.add(attributes1);
		}

		else
			makeNewCage();
	}

	void makeNewCage() {

	}
}
