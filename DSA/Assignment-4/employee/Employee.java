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

		for (int index = 0; index < noOfEmployees-1; index++) {
			for (int innerIndex = 0; innerIndex < noOfEmployess-1-index; innerIndex++) {
			    Node node = new Node();
			    while()
			    {
			    	node.name.charAt(count) > node.next.name.charAt(count)
			    }			}			
		}
			
		} 
			boolean status = true;
			while (status == false) {
				if (emp.name.charAt(index) == emp.next.name.charAt(index))
					index++;
			}

			emp = emp.next;
		}
	}
}
