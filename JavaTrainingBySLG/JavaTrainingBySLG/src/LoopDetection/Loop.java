package LoopDetection;

public class Loop {
    public static void main(String args[]) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);
        Node n7 = new Node(70);
        Node n8 = new Node(80);
        Node n9 = new Node(90);
        Node n10 = new Node(100);
        Node n11 = new Node(110);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=n8;
        n8.next=n9;
        n9.next=n10;
        n10.next=n11;
        n11.next=n4;

        LoopOperations l=new LoopOperations();


        if(l.hasLoop(n1))
            System.out.println("Loop exists");
        else

            System.out.println("No loop exists");
        l.nodeCount(n1);
        /*while(n.next!=null)
        {
            System.out.print(n.value);

        }
        */
    }
}
class LoopOperations
{
    public Boolean hasLoop(Node head)
    {
        Node t1,t2;
        t1=t2=head;
        while(t1.next!=null && t2.next!=null)
        {
            t1=t1.next;
            t2=t2.next.next;
            if(t1==t2)
                return true;
        }
        return false;
    }
    public void nodeCount(Node head) {
        Node t1, t2, t4;
        Node t3 = new Node(0);
        t1 = t2 = head;
            while (t1.next != null && t2.next != null) {
                t1 = t1.next;
                t2 = t2.next.next;
                if (t1 == t2) {
                    t3 = t1;
                    break;
                }
            }
            int count1 = 1, count2 = 1;
            t1 = head;
            t4 = t3;
       /* while(t1.next!=t3)
        {
            count1++;
            t1=t1.next;
        }
            t2=t3;*/
            while (t1.next != t4.next) {
                t1 = t1.next;
                t4 = t4.next;
                count1++;
            }
            while (t3.next != t2) {
                count2++;
                t3 = t3.next;

            }
            System.out.println("Length of non Loop:" + count1);
            System.out.println("length of Loop:" + count2);
        }

}
class Node
{
    int value;
    Node next;
    Node(int val)
    {
        value=val;
        next=null;
    }
}