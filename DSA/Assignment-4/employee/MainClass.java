package employee;

public class MainClass {

	public static void main(String[] args) {

		Employee emp = new Employee();

		emp.createRecord(123,"rahul","jaipur");
		emp.createRecord(211,"krsna","vrindavan");
		emp.createRecord(321,"seeta","ayodhya");
		emp.createRecord(432,"radha","vraj");
		emp.createRecord(586,"ram","ayodhya");
		
		emp.recordShow();
		emp.sorting();
		//emp.recordShow();
	}
}

