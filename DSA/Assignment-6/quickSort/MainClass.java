package quickSort;

public class MainClass {

	public static void main(String[] args) {

		Employee employee = new Employee();
		employee.addEmployee("ram", 39, 3450994f);
		employee.addEmployee("radha", 24, 4450994f);
		employee.addEmployee("anirudh", 33, 5450994f);
		employee.addEmployee("keshav", 25, 4450994f);
		
		employee.printList();
	}
}
