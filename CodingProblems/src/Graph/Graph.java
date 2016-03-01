package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Graph {
	Map<Integer,Map<Integer,Integer>> graph = new HashMap<Integer,Map<Integer,Integer>>();
	void addVertex(int V) {
		graph.put(V,new HashMap<Integer,Integer>());
	}
	
	void addEdges(int V1, int V2) {
		HashMap edges = getEdges(V1);
		edges.put(V2,-1);
	}
	
	HashMap<Integer,Integer> getEdges(int V) {
		return (HashMap<Integer, Integer>) graph.get(V);
	}
}
