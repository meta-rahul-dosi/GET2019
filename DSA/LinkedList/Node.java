import java.util.Scanner;

public class Node {

	int data;
	Node next;

Node createNode()
{
	System.out.println("enter data for this new  node : ");
	Node obj = new Node();
	Scanner scanner = new Scanner(System.in);
	int inputData = scanner.nextInt();
	obj.data = inputData;
	obj.next = NULL;
}

}