package Graphs;


import java.util.*;

class Edge{
    char source;
    char dest;
    int weight;
    Edge(char source,char dest,int weight)
    {
        this.source=source;
        this.dest=dest;
        this.weight=weight;
    }
}
class ObjectSort implements Comparator<Edge>
{
    public int compare(Edge a,Edge b)
    {
        return  a.weight-b.weight;
    }

}
public class MinimumSpanningTree {
    public static void main(String[] args) {
        Edge e1=new Edge('C','O',1);
        Edge e2=new Edge('D','O',2);
        Edge e3=new Edge('D','C',2);
        Edge e4=new Edge('C','B',3);
        Edge e5=new Edge('A','B',4);
        Edge e6=new Edge('B','O',5);
        Edge e7=new Edge('A','D',6);
        Edge e8=new Edge('A','O',8);

        ArrayList<Edge> edges=new ArrayList<>();
        edges.add(e1);
        edges.add(e2);
        edges.add(e3);
        edges.add(e4);
        edges.add(e5);
        edges.add(e6);
        edges.add(e7);
        edges.add(e8);
        Collections.sort(edges,new ObjectSort());

        ArrayList<Edge> mst=new ArrayList<>();
        int j=0;int cost=0;
        mst.add(edges.get(0));
        //Vector<Character> v=new Vector<>();
        HashSet<Character> v=new HashSet<>();
        v.add(mst.get(0).source);
        v.add(mst.get(0).dest);
        cost=cost+mst.get(0).weight;

        for(int i=1;i<edges.size();i++)
        {
            if(v.contains(edges.get(i).source)&&v.contains(edges.get(i).dest))
                continue;
            else {
                mst.add(edges.get(i));
                v.add(mst.get(++j).source);
                v.add(mst.get(j).dest);
                cost+=mst.get(j).weight;
            }
        }


        for(int i=0;i<mst.size();i++)
            System.out.println(mst.get(i).source+" "+mst.get(i).dest+" "+mst.get(i).weight);
         //   System.out.println(edges.get(i).source+" "+edges.get(i).dest+" "+edges.get(i).weight);

            System.out.println("Minimum Spanning cost by Kruskal's = "+cost);


    }
}
