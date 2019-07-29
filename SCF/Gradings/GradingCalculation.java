import java.util.Scanner;

public class GradingCalculation {
	public int numberOfStudents() {
		Scanner inputObj = new Scanner(System.in);
		int n = inputObj.nextInt();
		return n;
	}

	int[] gradeEntries(int n) {
		Scanner obj = new Scanner(System.in);
		int entries[] = new int[n];
		for (int i = 0; i < n; i++) {
			entries[i] = obj.nextInt();
		}
		obj.close();
		return entries;
	}

	float average(int n, int[] entries) {
		float avg = 0;
		for (int i = 0; i < n; i++)
			avg += entries[i];
		return avg / n;
	}

	int maximum(int n, int[] entries) {
		int max = 0;
		for (int i = 0; i < n - 1; i++) {
			if (entries[i] < entries[i + 1])
				max = entries[i + 1];
			else
				max = entries[i];
		}
		return max;
	}

	int minimum(int n, int[] entries) {
		int min = 0;
		for (int i = 0; i < n - 1; i++) {
			if (entries[i] < entries[i + 1])
				min = entries[i];
			else
				min = entries[i + 1];
		}
		return min;
	}
}

