package graph;

import java.util.*;

public class GraphOperations implements Graph {

	private List<Node> graph = new ArrayList<Node>();

	void formVertex0() {
		// for vertex 0
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		node1.vertex = 1;
		node1.weight = 3;
		node2.vertex = 2;
		node2.weight = 7;
		node3.vertex = 3;
		node3.weight = 2;
		graph.add(node1);
		node1.next = node2;
		node2.next = node3;
		node3.next = null;
	}

	void formVertex1() {
		// for vertex 1
		Node node1 = new Node();
		node1.vertex = 0;
		node1.weight = 3;
		node1.next = null;
		graph.add(node1);
	}

	void formVertex2() {
		// for vertex 2
		Node node1 = new Node();
		Node node2 = new Node();
		node1.vertex = 0;
		node1.weight = 7;
		node2.vertex = 3;
		node2.weight = 4;
		graph.add(node1);
		node1.next = node2;
		node2.next = null;
	}

	void formVertex3() {
		// for vertex 3
		Node node1 = new Node();
		Node node2 = new Node();
		node1.vertex = 0;
		node1.weight = 2;
		node2.vertex = 2;
		node2.weight = 4;
		graph.add(node1);
		node1.next = node2;
		node2.next = null;
	}

	@Override
	public boolean isConnected() {
		boolean status = false;
		for (int index = 0; index <= 3; index++) {
			if (graph.get(index) == null) {
				status = true;
				break;
			}
		}
		return status;
	}

	@Override
	public List<Integer> reachable(int vertex) {
		Node node = graph.get(vertex);
		List<Integer> desiredVertices = new ArrayList<>();
		while (node != null) {
			desiredVertices.add(node.vertex);
			node = node.next;
		}
		return desiredVertices;
	}

	@Override
	public List<Integer> shortestPath(int source, int destination) {
		List<Integer> path = new ArrayList<Integer>();

		return path;
	}

	@Override
	public void mst() {

		List<Integer> mst = new ArrayList<>();

		int[][] weight = new int[][] { { 0, 3, 7, 2 }, { 3, 0, 0, 0 },
				{ 7, 0, 0, 4 }, { 2, 0, 4, 0 } };

		int[][] mstSet = new int[4][4];

		int noOfNodes = 4;

		int temp[] = new int[4];
		temp[0] = 0;

		while (temp.length != noOfNodes) {
			int tempIndex = 0;
			int times = 0;
			while (++times <= temp.length) {
				for (int i = temp[tempIndex]; i < temp.length; i = temp[tempIndex++]) {
					for (int j = 0; j <= 3; j++)
						weight[i][j] = 9;
				}
			}
		}
	}
}
