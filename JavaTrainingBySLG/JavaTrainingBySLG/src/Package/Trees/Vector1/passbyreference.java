package Package.Trees.Vector1;


import java.util.Vector;

 class PassbyReference{
    public void theFunction(Vector<Integer> v){
    v.add(2);
    v.add(3);
    Vector<Integer> vector=new Vector<>();
        vector.add(20);
        vector.add(30);
        v=vector;
        System.out.println(v);
    }
}
public class passbyreference {
    public static void main(String[] args) {
        PassbyReference pr=new PassbyReference();
        Vector<Integer> vector=new Vector<>();
        vector.add(1);
        pr.theFunction(vector);
        System.out.println(vector);
    }

}
