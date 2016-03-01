package Graph;

import java.util.HashMap;
import java.util.Iterator;

public class GraphDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph();
		g.addVertex(5);
		g.addVertex(6);
		g.addVertex(7);
		g.addEdges(5, 6);
		g.addEdges(5, 7);
		g.addEdges(6, 7);
		g.addEdges(7, 5);
		HashMap<Integer, Integer> edges = g.getEdges(6);
		Iterator iter = edges.keySet().iterator();
		while (iter.hasNext()) {
		    System.out.println(iter.next());
		}
		
	}

}
