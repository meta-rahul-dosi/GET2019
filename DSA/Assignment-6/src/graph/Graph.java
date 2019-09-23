package graph;

import java.util.HashSet;
import java.util.Set;

public class Graph implements GraphInterface {

	private LinkedList adjLists[];
	private boolean isVisitedVertices[];
	private Stack stack = null;
	private int noOfVertices = 0;

	/**
	 * constructor to initialize the graph parameters
	 * 
	 * @param noOfVertices
	 */
	public Graph(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		this.stack = new Stack();
		adjLists = new LinkedList[noOfVertices];
		this.isVisitedVertices = new boolean[noOfVertices];

		// Initialize with adjacency list
		for (int i = 0; i < noOfVertices; i++) {
			adjLists[i] = new LinkedList();
		}
	}

	/**
	 * function to add edge in corresponding adjacency list
	 * 
	 * @param vertice1
	 * @param vertice2
	 * @param weight
	 */
	void addEdge(int vertice1, int vertice2, int weight) {
		adjLists[vertice1].addNode(vertice2, weight);
		adjLists[vertice2].addNode(vertice1, weight);
	}

	/**
	 * function to check weather the graph is connected or not
	 * 
	 * @param vertex
	 *            , vertex no.
	 * @return true, if connected o/w false is returned
	 */
	@Override
	public boolean isConnected(int vertex) {

		isVisitedVertices[vertex] = true;
		System.out.print(vertex + " ");

		GraphNode iterator = adjLists[vertex].getFront();

		stack.push(vertex);

		int currentVertices = 0;

		// DFS traversal using stack
		while (!stack.isEmpty()) {
			// pop the first node on stack
			currentVertices = stack.pop();

			// mark as visited
			isVisitedVertices[currentVertices] = true;

			// getting the iterator of the corresponding list
			iterator = adjLists[currentVertices].getFront();

			// iterate the current list until null and push the nodes that are
			// not yet visited
			while (iterator != null) {
				if (isVisitedVertices[iterator.getVertex()] == false) {
					stack.push(iterator.getVertex());
				}
				iterator = iterator.next;
			}
		}

		// iterate over the isVisitedArray and check weather the any of node is
		// not visited or not
		// if not return false o/w return true
		for (int currentIsVisitedVerticesIndex = 0; currentIsVisitedVerticesIndex < isVisitedVertices.length; currentIsVisitedVerticesIndex++) {
			if (isVisitedVertices[currentIsVisitedVerticesIndex] == false) {
				return false;
			}
		}
		return true;
	}

	/**
	 * function to get all the reachable nodes from given node
	 * 
	 * @param vertice
	 * @return, returns linkedList of all the reachable nodes
	 */
	@Override
	public Set reachable(int vertice) {
		Set<Integer> reachableNodes = new HashSet<Integer>();
		GraphNode iterator = adjLists[vertice].getFront();

		while (iterator != null) {
			reachableNodes.add(iterator.getVertex());
			iterator = iterator.next;
		}
		return reachableNodes;
	}

	/**
	 * function to show graph
	 */
	public void showGraph() {
		for (int i = 0; i < adjLists.length; i++) {
			adjLists[i].showList();
		}
	}

	/**
	 * we use this function to get adjacency matrix representation of graph
	 * 
	 * @return adjacency matrix
	 */
	public int[][] adjMat() {
		int WeightMatrix[][] = new int[this.noOfVertices][this.noOfVertices];
		GraphNode iterator = null;

		for (int row = 0; row < this.noOfVertices; row++) {
			for (int column = 0; column < this.noOfVertices; column++) {
				WeightMatrix[row][column] = 0;
			}
		}

		for (int currentVertexIndex = 0; currentVertexIndex < this.noOfVertices; currentVertexIndex++) {
			iterator = adjLists[currentVertexIndex].getFront();
			while (iterator != null) {
				WeightMatrix[currentVertexIndex][iterator.getVertex()] = iterator
						.getWeight();
				WeightMatrix[iterator.getVertex()][currentVertexIndex] = iterator
						.getWeight();
				iterator = iterator.next;
			}
		}

		for (int i = 0; i < WeightMatrix.length; i++) {
			for (int j = 0; j < WeightMatrix.length; j++) {
				System.out.print(WeightMatrix[i][j]);
			}
			System.out.println();
		}
		return WeightMatrix;
	}

	/**
	 * function to return distance matrix
	 * 
	 * @param src
	 * @return return distance matrix
	 */
	public int[][] dijkstra(int src) {

		int[][] WeightMatrix = adjMat();
		int distance[][] = new int[this.noOfVertices][2];
		boolean visitedNodesStatus[] = new boolean[this.noOfVertices];

		for (int count = 0; count < this.noOfVertices; count++) {
			distance[count][0] = Integer.MAX_VALUE;
			distance[count][1] = -1;
		}

		distance[src][0] = 0;
		for (int count = 0; count < this.noOfVertices - 1; count++) {
			int u = minDistance(distance, visitedNodesStatus);
			visitedNodesStatus[u] = true;

			for (int count1 = 0; count1 < this.noOfVertices; count1++) {
				if (!visitedNodesStatus[count1] && WeightMatrix[u][count1] != 0 && distance[u][0] + WeightMatrix[u][count1] < distance[count1][0]) 
				{
					distance[count1][0] = distance[u][0] + WeightMatrix[u][count1];
					distance[count1][1] = u;
				}
			}
		}
		return distance;
	}

	/*
	 * finds shortest path between given two vertices
	 * 
	 * @param a, b corresponds source and destination vertices
	 * 
	 * @see GraphInterface#shortestPath(int, int)
	 */
	public String shortestPath(int a, int b) {
		int src = a, des = b;
		int[][] dist = dijkstra(src);
		String path = Integer.toString(des);
		int currVertex = des;
		while (currVertex != -1 && currVertex != src) {
			path = Integer.toString(dist[currVertex][1]) + "-" + path;
			currVertex = dist[currVertex][1];
		}
		return path;
	}

	/**
	 * function to find the direct minimum distance from source to other nodes
	 * 
	 * @param dist
	 * @param sptSet
	 * @return index of minimum distance
	 */
	public int minDistance(int[][] dist, boolean[] sptSet) {
		int min = Integer.MAX_VALUE, min_index = -1;
		for (int count = 0; count < this.noOfVertices; count++) {
			if (sptSet[count] == false && dist[count][0] <= min) {
				min = dist[count][0];
				min_index = count;
			}
		}
		return min_index;
	}

	public static void main(String[] args) {
		Graph graph = new Graph(4);

		graph.addEdge(0, 1, 1);
		graph.addEdge(1, 3, 2);
		graph.addEdge(0, 3, 3);
		graph.addEdge(0, 2, 4);
		graph.addEdge(2, 3, 5);
		graph.addEdge(1, 2, 1);
		graph.showGraph();

		System.out.println(graph.shortestPath(0, 2));

		System.out.println(" is connected? " + graph.isConnected(0));

	}

}
