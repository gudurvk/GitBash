import java.util.Hashtable;

class Node
{
    int value;
    Node next;

    Node(int data)
    {
        this.value=data;
        this.next=null;
    }
}
class Staop
{
    public Node insert(Node head,int data)
    {
        Node top;
        Node t=new Node(data);
        top=findTop(head);
        if(top==null)
        {
            head=t;
        }
        else{
        top.next=t;
        top=top.next;}
        return head;
    }
    public Node findTop(Node head)
    {
        Node top;
        if(head==null)
        {
            top=null;
        }
        else
            while(head.next!=null)
                head=head.next;
            top=head;
        return top;

    }
    public Node pop(Node head)
    {
        Node top;
        Node t=head;
        top=findTop(head);
        if(top==null)
            System.out.println("Stack is empty...Can't delete");
        while(t.next!=top)
            t=t.next;
        t.next=null;
        return head;
    }
    public void printList(Node head)
    {
        System.out.print("HEAD");
        while (head!=null)
        {
            System.out.print("-->");
            System.out.print(head.value);
            head=head.next;
        }
        System.out.println("-->NULL");
    }
    public void printStack(Node head)
    {
        System.out.print("Top");

    }
}




public class Stack {
    public static void main(String args[])
    {
        Node head=null;
        Node head2=null;
        Staop st=new Staop();
        for(int i=10;i<20;i++)
            head=st.insert(head,i);
        st.printList(head);
            head2=st.pop(head);
        st.printList(head2);
        head2=st.insert(head2,19);
        st.printList(head2);


    }

}
