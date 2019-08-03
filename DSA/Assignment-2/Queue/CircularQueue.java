package Queue;

public class CircularQueue implements Queue {

	private int[] queueStore = new int[10];
	private int queueIndex = 0, front = 0, rear = 0;

	public static void main(String[] args) {
		QueueOperations object = new QueueOperations();
		object.add(5);
		object.add(6);
		object.add(7);
		object.add(8);
		object.delete();
		object.delete();
		object.printQueue();
		System.out.println("is it empty ? " + object.isEmpty());
		System.out.println("is it full ? " + object.isFull());
	}

	public void add(int data) {
		rear = queueIndex;
		queueStore[queueIndex++] = data;

	}

	public void delete() {
		int timer = 0;
		while (timer < rear) {
			queueStore[timer] = queueStore[++timer];
		}
		queueStore[timer] = 0;
		rear = rear - 1;
	}

	void printQueue() {
		for (int index = 0; index <= rear; index++) {
			System.out.println((queueStore[index]));
		}
	}

	public boolean isEmpty() {
		boolean emptyness = false;
		if (front == rear)
			emptyness = true;
		return emptyness;
	}

	public boolean isFull() {
		boolean filled = false;
		if (rear == queueStore.length - 1 && front == 0)
			filled = true;
		return filled;
	}
}
