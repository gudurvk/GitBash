package Graphs;

import java.util.HashMap;
import java.util.Vector;
import java.util.LinkedList;
import java.util.Vector;
public class AdjacencyListGraph {
    private int V;
    private HashMap<Integer, Vector<Integer>> graph;

    AdjacencyListGraph() {
        this.graph = new HashMap<Integer, Vector<Integer>>();
    }

    public void addEdge(int source, int dest) {
        if (this.graph.get(source) == null) {
            Vector<Integer> neighs = new Vector<>();
            neighs.add(dest);
            this.graph.put(source, neighs);
            return;
        }
        Vector<Integer> neighs = this.graph.get(source);
        neighs.add(dest);
        this.graph.put(source, neighs);
        return;
    }

    public HashMap<Integer, Vector<Integer>> getGraph() {
        return graph;
    }
}



