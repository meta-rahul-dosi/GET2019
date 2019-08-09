package Employee;

public class Employee {

	public Node header = null;

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

		Employee emp1 = new Employee("Ram", 224000, 125);
		Employee emp2 = new Employee("Anirudh", 224000, 125);
		Employee emp3 = new Employee("Vaman", 224000, 125);
		Employee emp4 = new Employee("Nimai", 224000, 125);
	}

	void LinkedList(Node node) {
		// when list is empty
		if (header == null)
			header = node;
		// when list is not empty
		else {
			node = header;
			header = node.next;
		}

		// printing LinkedList
		node = header;
		while (node != null) {
			System.out.println(node.name);
			node = node.next;
		}
	}
}
