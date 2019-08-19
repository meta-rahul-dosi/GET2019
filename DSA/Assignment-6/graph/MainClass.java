package graph;

import java.util.*;

public class MainClass {

	public static void main(String arguments[]) {

		GraphOperations graphOperations = new GraphOperations();

		graphOperations.formVertex0();
		graphOperations.formVertex1();
		graphOperations.formVertex2();
		graphOperations.formVertex3();

		graphOperations.isConnected();

		graphOperations.mst();

		List<Integer> desiredVertices = graphOperations.reachable(2);
		System.out.println(desiredVertices);

		graphOperations.shortestPath(0, 2);
	}
}
