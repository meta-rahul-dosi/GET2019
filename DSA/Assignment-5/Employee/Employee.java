package Employee;

public class Employee {

	public static Node header = null;

	Employee() {
	}

	Employee(String name, float salary, int age) {
		Node node = new Node();
		node.setName(name);
		node.getName();
		node.setSalary(salary);
		node.getSalary();
		node.setAge(age);
		node.getAge();
		LinkedList(node);
	}

	public static void main(String arg[]) {
		Sorting sorting = new Sorting();
		Employee emp = new Employee();
		Employee emp1 = new Employee("Ram", 224000, 125);
		Employee emp2 = new Employee("Anirudh", 552000, 195);
		Employee emp3 = new Employee("Vaman", 334000, 145);
		Employee emp4 = new Employee("Nimai", 298700, 25);

		emp.printList();
		System.out.println("after insertion sorting the linked list ");
		sorting.insertionSort(emp.header);
		emp.printList();
	}

	void LinkedList(Node node) {
		// when list is empty
		if (header == null)
			header = node;
		// when list is not empty
		else {
			node.next = header;
			header = node;
		}
	}

	// printing LinkedList
	void printList() {
		Node node = header;
		while (node != null) {
			System.out.println("node: " + node.salary);
			node = node.next;
		}
	}
}
