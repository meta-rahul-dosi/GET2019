package quickSort;

public class Employee {

	Node header = null;

	/**
	 * this function adds a new node to existing linked list with incoming
	 * attributes
	 * @param name, age , salary
	 */
	void addEmployee(String name, int age, float salary) {
		Node node = new Node();
		node.setName(name);
		node.getName();
		node.setAge(age);
		node.getAge();
		node.setSalary(salary);
		node.getSalary();

		LinkedList(node);

	}

	void LinkedList(Node node) {
		if (header == null)
			header = node;
		else {
			node.next = header;
			header = node;
		}
	}

	// printing List
	void printList() {
		Node node1 = new Node();
		node1 = header;
		while (node1 != null) {
			System.out.println(node1.name);
			node1 = node1.next;
		}
	}
	
	
	
}
