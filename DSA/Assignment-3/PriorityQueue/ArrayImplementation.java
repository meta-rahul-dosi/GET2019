package PriorityQueue;

import java.util.*;

public class ArrayImplementation implements PriorityQueue {

	private Scanner scanner = new Scanner(System.in);
	public int array[];
	private int index = 0;
	private int front = 0, rear = -1;

	ArrayImplementation(int size) {
		array = new int[size];
	}

	public void insert(int data, int priority) {
		if (rear == -1) {
			array[index++] = data;
			rear++;
		} else {

			while (priority <= rear) {
				int temp = data;
				array[priority++ - 1] = data;
				data = temp;
			}
			array[rear + 1] = data;
			array[index++] = data;
			rear++;
		}
	}

	public int getHighestPriorityElement() {
		return array[0];
	}

	public void deleteHighestPriorityElement() {
		int total = 0;
		while (total <= rear) {
			array[total] = array[total + 1];
			total--;
		}
		array[rear] = 0;
		rear--;
	}
}
