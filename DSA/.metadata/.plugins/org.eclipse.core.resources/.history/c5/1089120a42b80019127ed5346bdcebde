package employee;

import java.util.*;
import java.lang.*;

public class Employee {

	private Node header = null;
	private int noOfEmployees = 0;

	void createRecord(int empId, String name, String address) {
		Node emp = new Node();

		emp.setEmpId(empId);
		emp.getEmpId();
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

		// for (int outerIndex = 0; outerIndex < noOfEmployees - 1;
		// outerIndex++) {
		// for (int innerIndex = 0; innerIndex < noOfEmployees - 1- outerIndex;
		// innerIndex++) {
		Node node = new Node();
		node = header;
		
		int lengthOfFirstName =node.name.length();
		int lengthOfSecondName =node.next.name.length();
        int index = 0;
		if(lengthOfFirstName > lengthOfSecondName)
		{
			boolean flag = true;
			int(flag == false)
			{
			if(node.name.charAt(index) > node.next.name.charAt(index))	
			{
			
			}
			else if(node.name.charAt(index) < node.name.next.charAt(index))
			{
				
			}
			else
				index++;
		}
		
		}
	}
}
