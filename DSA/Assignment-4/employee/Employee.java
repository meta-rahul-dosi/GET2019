package employee;

import java.util.*;
import java.lang.*;

public class Employee {

	private Node header = null;
	private int noOfEmployees = 0;

	void createRecord(int empId, String name, String address) {
		Node emp = new Node();

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
		Node emp = new Node();
		emp = header;
		while (emp != null) {
			System.out.println(emp.name);
			emp = emp.next;
			noOfEmployees++;
		}
	}

	void sorting() {
		Node emp = new Node();
		String temp;
		String[] array = new String[noOfEmployees];
		int index = 0;

		while (emp != null) {
			array[index++] = emp.name;
			emp = emp.next;
		}

		for (int outerIndex = 0; outerIndex < noOfEmployees - 1; outerIndex++) {
			for (int innerIndex = 0; innerIndex < noOfEmployees - 1
					- outerIndex; innerIndex++) {
				Node node = new Node();

				int comparisonValue = array[innerIndex]
						.compareTo(array[innerIndex + 1]);
				if (comparisonValue < 0) {
					temp = array[innerIndex];
					array[innerIndex] = array[innerIndex + 1];
					array[innerIndex + 1] = temp;
				}
			}
		}
	}
}

