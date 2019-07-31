import java.util.*;

public class Polynomial {

	private Scanner scanner = new Scanner(System.in);
	private Node header = null;
	private String poly = ""; 
	private int degree=0, previous=0;

	public static void main(String argument[]) {
		Polynomial polynomial = new Polynomial();
		System.out.println("your polynomial is \n");
		
		polynomial.createPolynomial(3,new String[]{"x^","y^"}, new int[]{2,1});
		polynomial.createPolynomial(4,new String[]{"x^","z^"}, new int[]{2,3});
		polynomial.createPolynomial(-2,new String[]{"x^","y^","z^"}, new int[]{4,1,2});	
		
		polynomial.printPolynomial();
		System.out.println(polynomial.returnDegree());
	}

	void createPolynomial(int coeff, String[] variables, int[] powers) {		
		Node node = new Node();
		
		node.coeff = coeff;
		poly = poly + Integer.toString(node.coeff);

		for(int index=0; index < variables.length; index++)
		{
			node.variables.add(variables[index]);
			poly = poly.concat(variables[index]);
			node.powers.add(powers[index]);
			poly = poly + powers[index];
		}
		
		poly = poly + " " + '+' + " ";
		node.next = null;
		
		if(header == null)
			header = node;
		else
			header.next = node;
		
		//printing linked list
		Node node1 = new Node();
		node1 = header;
		while(node1 != null)
		{
			System.out.println(node.coeff);
			node1 = node1.next;
		}
	}
	
	void printPolynomial()
	{
		System.out.println(poly);
	}

	int returnDegree() {
		Node node = new Node();
		
		if(header != null)
		{
			node = header;
			
			while(node != null)
			{
				for(int index=0; index < node.powers.size(); index++)
				{
					previous = degree;
					degree=0;
					degree = degree + node.powers.get(index);
				}
				
				if(degree < previous)
				{
					degree = previous;
				}
				node = node.next;
			}
		}
		return degree;
	}
}


