import java.util.*;
import java.lang.*;

/**
 * params
 * 
 * @author Rahul
 *
 */
public class Node {

	int data;
	Node next;
	Node header = null;

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
		Scanner scanner = new Scanner(System.in);
		int left = scanner.nextInt();
		scanner.close();
		return left;
	}

	int getRightPosition() {
		System.out.println("enter right position of sublist : ");
		Scanner scanner = new Scanner(System.in);
		int right = scanner.nextInt();
		scanner.close();
		return right;
	}

	int getNoOfRotations() {
		System.out.println("enter no of rotations to be made : ");
		Scanner scanner = new Scanner(System.in);
		int numberOfRotations = scanner.nextInt();
		scanner.close();
		return numberOfRotations;
	}

	void sublist(int leftEnd, int rightEnd) {
		Node node = new Node();
		node = header;
		int index = 1;

		if (header == null) {
			System.out.println("\noOps ! empty linked list");
			return;
		}

		System.out.println("\nSublist is ");
		while (index++ < leftEnd)
			node = node.next;

		index = leftEnd;
		while (index++ <= rightEnd) {
			System.out.println(node.data);
			node = node.next;
		}
	}
}
