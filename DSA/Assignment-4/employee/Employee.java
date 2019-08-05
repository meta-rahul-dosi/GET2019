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
		Node tempHeader = header;
		String temp;

		for (int index = 0; index < noOfEmployees - 1; index++) {
			for (int innerIndex = 0; innerIndex < noOfEmployees - 1 - index; innerIndex++) {
				Node node = new Node();
				String name1 = node.name;
				String name2 = node.next.name;
				int comparison = name1.compareTo(name2);
				
				if(comparison < 0)
				{
				    temp = node.next.name;
					node.next.name = node.name;
					node.name = temp;
				}
			}
		}
	}
}

