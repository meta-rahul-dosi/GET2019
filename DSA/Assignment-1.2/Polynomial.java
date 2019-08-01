import java.util.*;

public class Polynomial {

	private Scanner scanner = new Scanner(System.in);
	private Node header = null;
	private static String poly = "";
	private int degree = 0, power = 0;

	public static void main(String argument[]) {
		Polynomial polynomial = new Polynomial();
		System.out.println("your polynomial is ");

		polynomial.printPolynomial();
		System.out.println("\n\ndegree is" + polynomial.returnDegree());

	}

	Polynomial() {
		createPolynomial(3, new String[] { "x^", "y^" }, new int[] { 2, 3 });
		createPolynomial(4, new String[] { "x^", "z^" }, new int[] { 2, 4 });
		createPolynomial(-2, new String[] { "x^", "y^", "z^" }, new int[] { 4,
				1, 2 });

	}

	void createPolynomial(int coeff, String[] variables, int[] powers) {
		Node node = new Node();

		node.coeff = coeff;
		poly = poly + Integer.toString(node.coeff);

		for (int index = 0; index < variables.length; index++) {
			node.variables.add(variables[index]);
			poly = poly.concat(variables[index]);
			node.powers.add(powers[index]);
			poly = poly + powers[index];
		}

		poly = poly + " " + '+' + " ";
		node.next = null;

		if (header == null)
			header = node;
		else {
			node.next = header;
			header = node;
		}
	}

	void printPolynomial() {
		System.out.println(poly);
	}

	/**
	 * returnDegree method finds power of every term which is sum of every
	 * variable's power in a term params @ returns degree (highest power)
	 */
	int returnDegree() {
		Node node = new Node();

		if (header != null) {
			node = header;

			while (node != null) {
				power = 0;
				for (int index = 0; index < node.powers.size(); index++) {
					power = power + node.powers.get(index);
				}

				if (degree < power) {
					degree = power;
				}
				node = node.next;
			}
		}
		return degree;
	}
}
