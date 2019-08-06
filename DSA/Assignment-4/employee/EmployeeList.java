package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeList {

	/**
	 * sorts the employee by their name
	 * 
	 * @param listOfEmployees
	 * @return
	 */
	public List<Employee> sortByEmployeeName(List<Employee> listOfEmployees) {
		Comparator<Employee> comparator = Comparator
				.comparing(employee -> (employee.getEmployeeName()));
		listOfEmployees.sort(comparator);
		return listOfEmployees;
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(201, "Rahul", "Jaipur");
		Employee e2 = new Employee(202, "Krsna", "Vrndavana");
		Employee e3 = new Employee(202, "Radha", "Vraja");
		Employee e4 = new Employee(204, "Rama", "Ayodhya");
		Employee e5 = new Employee(205, "Balram", "Gokul");

		List<Employee> listOfEmployees = new ArrayList<Employee>();
		listOfEmployees.add(e5);
		listOfEmployees.add(e3);
		listOfEmployees.add(e2);
		listOfEmployees.add(e4);
		listOfEmployees.add(e1);

		EmployeeList ed = new EmployeeList();
		List listOfEmployessSortedByEmployeeName = ed
				.sortByEmployeeName(listOfEmployees);
		System.out.println(listOfEmployessSortedByEmployeeName);
		System.out.println(" Finish");
	}
}
