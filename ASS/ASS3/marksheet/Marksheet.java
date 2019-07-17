public class Marksheet {
	public static void main(String[] args) {
		GradingCalculation grades = new GradingCalculation();
		Marksheet marks = new Marksheet();

		System.out.println("enter no of students : ");
		int numberOFstudents = grades.numberOfStudents();

		System.out.println("enter grades of all student : ");
		int entries[] = new int[numberOFstudents];
		entries = grades.gradeEntries(numberOFstudents);

		marks.print(numberOFstudents, entries);
		System.out.println("avg of grades given is "
				+ grades.average(numberOFstudents, entries));
		System.out.println("maximum grade is "
				+ grades.maximum(numberOFstudents, entries));
		System.out.println("minimum grade is "
				+ grades.minimum(numberOFstudents, entries));
	}

	void print(int number, int[] entries) {
		int index = 0;
		while (index < number) {
			System.out.println("student-" + (index + 1) + "'s grades  "
					+ entries[index]);
			index++;
		}
	}

}
