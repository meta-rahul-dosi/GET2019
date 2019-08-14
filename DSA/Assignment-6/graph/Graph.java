package graph;

import java.util.List;
import java.util.ArrayList;

public class Graph implements UndirectedGraph {

	private List<Node> connections = new ArrayList<Node>();

	public class Node {
		int destination;
		int weight;
		Node next;
	}

	Graph(int destination, int weight) {
		Node node = new Node();
		node.destination = destination;
		node.weight = weight;
		node.next = null;
	}

	void formGraph() {

	}
}
