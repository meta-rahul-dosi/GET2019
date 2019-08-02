package PriorityQueue;

public interface PriorityQueue {

	void insert(int data, int priority);

	int getHighestPriorityElement();

	void deleteHighestPriorityElement();

}
