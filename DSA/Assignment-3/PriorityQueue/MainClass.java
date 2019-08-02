package PriorityQueue;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		MainClass main = new MainClass();

		System.out.println("provide maximum size of queue ");
		int size = main.inputSize();

		ArrayImplementation array = new ArrayImplementation(size);

		array.insert(5, 1);
		array.insert(12, 2);
		array.insert(9, 1);
		array.insert(6, 3);
		array.insert(16, 2);

		System.out.println(Arrays.toString(array.array));
	}

	int inputSize() {
		return scanner.nextInt();

	}
}
