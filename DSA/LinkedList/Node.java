import java.util.*;

/**
 * params
 * 
 * @author Rahul
 *
 */
public class Node {

	private int data;
	private Node next;
	private Node header = null, sublistHeader = null, sublistFooter = null;
	private Scanner scanner = new Scanner(System.in);
	
	void createNode(int inputData) {
		Node node = new Node();
		Node node1 = new Node();
		node.data = inputData;
		node.next = null;

		if (header == null)
			header = node;
		else {
			node1 = header;
		}
		while (node1.next != null) {
			node1 = node1.next;
		}
		node1.next = node;
	}

	void show() {
		Node node = new Node();
		node = header;
		System.out.println("Linked List is ");
		while (node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}

	int getLeftPosition() {
		System.out.println("enter left position of sublist : ");
		int left = scanner.nextInt();
		return left;
	}

	int getRightPosition() {
		System.out.println("enter right position of sublist : ");
		Scanner scanner = new Scanner(System.in);
		int right = scanner.nextInt();
		System.out.println(right);
		
		return right;
	}

	int getNoOfRotations() {
		System.out.println("enter no of rotations to be made : ");
		Scanner scanner = new Scanner(System.in);
		int numberOfRotations = scanner.nextInt();
		scanner.close();
		return numberOfRotations;
	}

	int[] sublist(int leftEnd, int rightEnd) {
		int [] array = new int[rightEnd-leftEnd+1];
		Node node = new Node();
		node = header;
		int index = 1, arrayIndex = 0;

		if (header == null) {
			System.out.println("\noOps ! empty linked list");
			return null;
		}

		System.out.println("\nSublist is ");
		while (index++ < leftEnd)
			node = node.next;
		sublistHeader = node;
		index = leftEnd;
		while (index++ <= rightEnd) {
			array[arrayIndex++]=node.data;
			System.out.println(node.data);
			node = node.next;
		}
		sublistFooter = node;
		return array;
	}
	
	void rotationSublist(int number, List<Integer> nodeData)
	{
		Node node = new Node();
		node = sublistHeader;
		System.out.println("\n\n");
		while(node != sublistFooter)
		{
			System.out.println(node.data);
			node = node.next;
		}
	  
		for(int index = 1; index <= 2; index++)
		{
			
		}
	}
}


