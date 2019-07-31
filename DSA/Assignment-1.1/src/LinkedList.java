import java.util.*;

/**
 * param
 * 
 * @author Rahul
 *
 */

public class LinkedList {

	private Scanner scanner = new Scanner(System.in);
	private Node header = null, sublistHeader = null;

	public static void main(String argument[]) {
		LinkedList l = new LinkedList();
		int a[] = { 2, 3, 4, 5, 6, 7 };
		l.afterRotation(a, 2, 5, 2);
	}

	void createLinkedList(int[] inputList) {
		System.out.println("\nLinkedlist is ");
		
		for (int index = 0; index < inputList.length; index++) {
			Node node = new Node();
			Node node1 = new Node();

			node.data = inputList[index];
			node.next = null;
			if (header == null) {
				header = node;
			} else {
				node1 = header;
			}
			while (node1.next != null) {
				node1 = node1.next;
			}
			node1.next = node;
		}
	}

	int[] createSubList(int leftEnd, int rightEnd) {
		int[] sublist = new int[rightEnd - leftEnd + 1];
		Node node = new Node();
		int count = 1, index = 0;

		if (header == null)
			System.out.println("\noOps ! empty linked list");
		else
			sublistHeader = header;

		System.out.println("\nSublist is ");

		while (count++ < leftEnd) {
			sublistHeader = sublistHeader.next;
			node = sublistHeader;
		}
		
		count = leftEnd;
		while (count++ <= rightEnd) {
			sublist[index++] = node.data;
			node = node.next;
		}
		node.next = null;
		return sublist;
	}

	int[] afterRotation(int[] inputList, int leftEnd, int rightEnd, int noOfRotations) 
   {
		int[] result = new int[inputList.length];
		int count = 1;
		createLinkedList(inputList);
		int[] sublist = createSubList(leftEnd, rightEnd);
		Node node = new Node();

		for (int index = 0; index < noOfRotations; index++) {
			int temp = sublist[sublist.length - 1];
			for (int innerIndex = sublist.length - 1; innerIndex > 0; innerIndex--) {
				sublist[innerIndex] = sublist[innerIndex - 1];
			}
			sublist[0] = temp;
		}
		System.out.println(Arrays.toString(sublist));
		
		int resultIndex = 0;
		while (count++ < leftEnd) {
			result[resultIndex] = inputList[resultIndex++];
		}
		
		int index = 0;
		count = leftEnd;
		while (count++ <= rightEnd) {
			result[resultIndex++] = sublist[index++];
		}
		count = rightEnd;
		System.out.println(count);
		while (count++ < inputList.length) {
			result[resultIndex] = inputList[resultIndex++];
		}
			System.out.println(Arrays.toString(result));
		return result;
	}
}


