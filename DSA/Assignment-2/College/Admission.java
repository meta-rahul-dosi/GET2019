import java.util.*;

public class Admission {

	private Map<String, Integer> programs = new HashMap<>();
	private Scanner scanner = new Scanner(System.in);
	private StudentNode front = null, rear = null;

	public static void main(String argument[]) {
		System.out.println("enter");
	}

	int inputSize() {
		int size = scanner.nextInt();
		return size;
	}
}
