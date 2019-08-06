package College;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.util.Date; 
import org.apache.poi.hssf.usermodel.HSSFCell; 
import org.apache.poi.hssf.usermodel.HSSFRow; 
import org.apache.poi.hssf.usermodel.HSSFSheet; import org.apache.poi.hssf.usermodel.HSSFWorkbook; import org.apache.poi.ss.usermodel.Cell; import org.apache.poi.ss.usermodel.CellStyle; 
import org.apache.poi.ss.usermodel.DataFormat; 
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Students {

	private Map<String, Integer> programs = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	private StudentNode front = null, rear = null;
	private int index = 0;

	List<String> studentsList() {
		List<String> list = new ArrayList<>();
		list.add("ram");
		list.add("hayagriva");
		list.add("krsna");
		list.add("keshav");
		return list;
	}

	void formQueue(List<String> list) {

		for (int index = 0; index < list.size(); index++) {

			StudentNode node = new StudentNode();

			node.name = list.get(index++);

			for (int innerIndex = 0; innerIndex < 5; innerIndex++) {
				node.programs[index] = scanner.nextLine();
			}
			node.next = null;

			if (front == null)
				front = null;
			else {

			}
		}
	}

	void admissionProcess() {

	}
}

