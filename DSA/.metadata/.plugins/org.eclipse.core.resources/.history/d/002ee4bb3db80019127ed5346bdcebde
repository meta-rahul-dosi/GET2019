package College;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

import java.io.File;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.Label;
import jxl.write.WriteException;

public class MainClass {

	private Scanner scanner = new Scanner(System.in);
	private StudentNode front = null, rear = null;

	public static void main(String argument[]) {
		College college = new College();
		Students students = new Students();
		MainClass mainClass = new MainClass();

		Map<String, Integer> programs = new HashMap<>();
		List<String> list;

		System.out.println("Total number of programs available is "
				+ college.noOfPrograms());

		System.out.println("Programs with corresponding capacity : ");
		programs = college.Programs();
		System.out.println(Arrays.asList(programs));

		System.out.println("Ranked Students are ");
		list = students.studentsList();
		System.out.println(students.studentsList());

		students.formQueue(list);
		
		students.admissionProcess();
	}
}

