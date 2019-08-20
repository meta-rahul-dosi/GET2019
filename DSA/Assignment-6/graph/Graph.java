package graph;

import java.util.List;
import java.util.ArrayList;

public interface Graph {

	// this function returns true if graph is connected
	boolean isConnected();

	// this function returns list of nodes connected directly to given node
	List<Integer> reachable(int vertex);

	// this function forms a minimum spanning tree using prim's algo of given
	// graph
	void mst();

	// this function returns list of nodes forming shortest path between given
	// two nodes
	List<Integer> shortestPath(int source, int destination);

}
