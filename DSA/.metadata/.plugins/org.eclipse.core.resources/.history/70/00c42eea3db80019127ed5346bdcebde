package College;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Students {

	private Map<String, Integer> programs = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	private StudentNode front = null, rear = null;
	private int index = 0;

	List<String> studentsList() {
		List<String> list = new ArrayList<>();
		list.add("ram");
		list.add("hayagriva");
		list.add("krsna");
		list.add("keshav");
		return list;
	}

	void formQueue(List<String> list) {

		for (int index = 0; index < list.size(); index++) {

			StudentNode node = new StudentNode();

			node.name = list.get(index++);

			for (int innerIndex = 0; innerIndex < 5; innerIndex++) {
				node.programs[index] = scanner.nextLine();
			}
			node.next = null;

			if (front == null)
				front = null;
			else {

			}
		}
	}

	void admissionProcess() {

	}
}

