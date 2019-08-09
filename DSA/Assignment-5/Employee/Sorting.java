package Employee;

public class Sorting {

	Node headerForSort = null;

	// Java program to sort link list using insertion sort

	void insertionSort(Node header) {
		// Initialize headerForSort linked list

		Node current = header;
		// Traverse the given linked list and insert every node to headerForSort
		while (current != null) {
			// Store next for next iteration
			Node next = current.next;
			// insert current in headerForSort linked list
			sortedInsert(current);
			// Update current
			current = next;
		}
		// Update header to point to headerForSort linked list
		header = headerForSort;
		;
	}

	/*
	 * function to insert a new_node in a list. Note that this function expects
	 * a pointer to head_ref as this can modify the head of the input linked
	 * list (similar to push())
	 */
	void sortedInsert(Node newnode) {
		/* Special case for the head end */
		if (headerForSort == null || headerForSort.salary >= newnode.salary) {
			newnode.next = headerForSort;
			headerForSort = newnode;
		} else {
			Node current = headerForSort;
			/* Locate the node before the point of insertion */
			while (current.next != null && current.next.salary < newnode.salary) {
				current = current.next;
			}
			newnode.next = current.next;
			current.next = newnode;
		}
	}
}
