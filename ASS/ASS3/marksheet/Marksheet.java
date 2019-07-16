import java.util.*;
import java.lang.*;

public class Marksheet {
	public static void main(String[] args) {
		GradingCalculation g = new GradingCalculation();
		Marksheet m = new Marksheet();

		System.out.println("enter no of students : ");
		int n = g.numberOfStudents();

		System.out.println("enter grades of all student : ");
		int entries[] = new int[n];
		entries = g.gradeEntries(n);

		m.print(n, entries);
		System.out.println("avg of grades given is " + g.average(n, entries));
		System.out.println("maximum grade is " + g.maximum(n, entries));
		System.out.println("minimum grade is " + g.minimum(n, entries));
	}

	void print(int n, int[] entries) {
		int i = 0;
		while (i < n) {
			System.out.println("student-" + (i + 1) + "'s grades  "
					+ entries[i]);
			i++;
		}
	}

}
