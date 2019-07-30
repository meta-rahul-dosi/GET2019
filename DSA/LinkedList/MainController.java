import java.util.*;
import java.util.Scanner;

/**
 * param
 * 
 * @author Rahul
 *
 */

public class MainController {

	public static void main(String arguments[]) {
		MainController mainObject = new MainController();
		Node object = new Node();

		// operations over linkedlist
		List<Integer> nodeData = new ArrayList<>();
		nodeData = mainObject.input();

		for (int index = 0; index < nodeData.size(); index++)
			object.createNode(nodeData.get(index));

		object.show();

		// operations over sublist
		int leftPosition = object.getLeftPosition();
		int rightPosition = object.getRightPosition();
		int noOfRotations = object.getNoOfRotations();
		object.sublist(leftPosition, rightPosition);
	}

	List<Integer> input() {
		System.out
				.println("enter number of nodes to be inserted in linked list");
		Scanner scanner = new Scanner(System.in);
		int noOfNodes = scanner.nextInt();

		List<Integer> storeData = new ArrayList<>();
		System.out.println("enter data for nodes : ");
		for (int index = 0; index < noOfNodes; index++)
			storeData.add(scanner.nextInt());
		scanner.close();
		return storeData;
	}
}
