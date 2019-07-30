import java.util.Scanner;
import java.lang.*;

public class Polynomial {

	static Scanner scanner = new Scanner(System.in);
	static Node header = null;

	public static void main(String argument[]) {
		System.out.println("lets create polynomial");
		System.out.println("enter no of terms");
		int noOfTerms = scanner.nextInt();
		createPolynomial(noOfTerms);
	}

	static void createPolynomial(int numberOfTerms) {
		Node node = new Node();

		for (int index = 1; index <= numberOfTerms; index++) {
			System.out.println("enter coefficient : ");
			node.coefficient = scanner.nextInt();

			System.out.println("enter number of variables : ");
			int noVariables = scanner.nextInt();
			System.out.println("enter variables ");
			for (int i = 0; i < noVariables; i++) {
				node.variables.add(scanner.next().charAt(i));
			}
			System.out.println("enter corresponding powers ");
			for (int i = 0; i < noVariables; i++) {
				node.powers.add(scanner.nextInt());
			}
		}

		if (header == null)
			header = node;
		else {
			node.next = header;
			header = node;
		}
	}   

	int returnDegree() {
		int degree = 7;

		return degree;
	}
}


