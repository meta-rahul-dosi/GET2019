package employee;

import java.util.*;
import java.lang.*;

public class Employee {
	int empId;
	String name;
	String address;
	Employee next;

	Employee header = null;

	void createRecord(int empId, String name, String address) {
		Employee emp = new Employee();

		emp.empId = empId;
		emp.name = name;
		emp.address = address;
		emp.next = null;

		if (header == null)
			header = emp;
		else {
			emp.next = header;
			header = emp;
		}
	}

	void recordShow() {
		Employee emp = new Employee();
		emp = header;
		while (emp != null) {
			System.out.println(emp.name);
			emp = emp.next;
		}
	}

	void sorting() {
		Employee emp = new Employee();
		Employee tempHeader = header;
		int index = 0;

		while (emp != null) {
			boolean status = true;
			while (status == false) {
				if (emp.name.charAt(index) == emp.next.name.charAt(index))
					index++;
			}

			emp = emp.next;
		}
	}
}
