package Graphs;
    import java.util.*;

public class GraphAlgos{
    public static void main(String[] args) {
            AdjacencyListGraph graphobj=new AdjacencyListGraph();
            graphobj.addEdge(0,1);
            graphobj.addEdge(0,2);
            graphobj.addEdge(1,3);
            graphobj.addEdge(1,4);
            graphobj.addEdge(2,3);
            graphobj.addEdge(2,4);
            graphobj.addEdge(3,5);
            graphobj.addEdge(3,6);
            graphobj.addEdge(4,5);
            graphobj.addEdge(5,6);
            HashMap<Integer,Vector<Integer>>graph=graphobj.getGraph();
            //System.out.println(graph);
            GraphTraversal gt=new GraphTraversal();
            gt.BFS(graph,0);
        System.out.println();
            gt.DFS(graph,0);

    }
}

class GraphTraversal {
    public void BFS(HashMap<Integer, Vector<Integer>> adj, int source) {
        int V = adj.size();
        boolean visited[] = new boolean[V+1];
        for (int i = 0; i < V+1; i++)
            visited[i] = false;


        Queue<Integer> queue = new LinkedList<>();
        visited[source] = true;
        queue.add(source);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.println(node);
            if (adj.get(node) != null) {
                Vector<Integer> neigh = adj.get(node);
                for (int i = 0; i < neigh.size(); i++) {
                    int element = neigh.get(i);
                    if (visited[element] == false) {
                        visited[element] = true;
                        queue.add(element);
                    }
                }
            }

        }
    }

    public void DFS(HashMap<Integer, Vector<Integer>> adj, int source) {
        int V = adj.size();
        boolean visited[] = new boolean[V+1];
        for (int i = 0; i < V+1; i++)
            visited[i] = false;

        Stack<Integer> st = new Stack<>();
        visited[source] = true;
        st.push(source);

        while (!st.isEmpty()) {
            int node = st.pop();
            System.out.println(node);
            if (adj.get(node) != null) {
                Vector<Integer> neigh = adj.get(node);
                for (int i = 0; i < neigh.size(); i++) {
                    int element = neigh.get(i);
                    if (visited[element] == false) {
                        visited[element] = true;
                        st.push(element);
                    }
                }
            }

        }


    }
}
