import java.util.Scanner;
import java.lang.*;

public class Polynomial {

	static Scanner scanner = new Scanner(System.in);
	Node header = null;

	public static void main(String argument[]) {
		Polynomial poly = new Polynomial();

		System.out.println("lets create polynomial\n");
		
		System.out.println("enter no of terms");
		
		int noOfTerms = scanner.nextInt();
		poly.createPolynomial(noOfTerms);
	}

	void createPolynomial(int numberOfTerms) {
		Node node = new Node();
	}
	
	void visualize(int coefficient, List<Character> variables, List<Integer> powers)
	{
		Node node = new Node();
		
		while
		node
	}

	 int returnDegree() {
	}
}
