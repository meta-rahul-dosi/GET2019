package LinkedList;

import java.util.*;

public class DetectLoop {

	Node header = null;

	DetectLoop() {

	}

	public void createLinkedList(int[] list) {
		Node node1 = new Node();

		for (int index = 0; index < list.length; index++) {
			Node node = new Node();

			node.data = list[index];
			node.next = null;

			if (header == null) {
				header = node;
			} else {
				node.next = header;
				header = node;
			}
		}

		while (node1.next != null) {
			node1 = node1.next;
		}
		node1.next = header.next.next;
		loopDetector();
	}

	boolean loopDetector() {
		boolean status = true;
		Node fast = header, slow = header;
		;

		do {
			slow = slow.next;
			fast = fast.next.next;
		} while (slow == fast);

		if (slow == fast)
			status = true;

		return status;
	}
}
