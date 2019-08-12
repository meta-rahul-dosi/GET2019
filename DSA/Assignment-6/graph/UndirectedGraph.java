package graph;

public interface UndirectedGraph {

	boolean isConnected();

	int[] reachable(int vertex);

	int[][] mst();

	int[] shortestPath(int a, int b);

}
