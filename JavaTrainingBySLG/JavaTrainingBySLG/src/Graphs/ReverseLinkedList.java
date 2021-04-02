package Graphs;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}
public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(10);
        ListNode n2 = new ListNode(20);
        ListNode n3 = new ListNode(30);
        ListNode n4 = new ListNode(40);
        ListNode n5 = new ListNode(50);
        ListNode n6 = new ListNode(60);
        ListNode n7 = new ListNode(70);
        ListNode n8 = new ListNode(80);
        ListNode n9 = new ListNode(90);
        ListNode n10 = new ListNode(100);
        ListNode n11 = new ListNode(110);
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
        n11.next=null;
        ReverseLinkedList rll = new ReverseLinkedList();
        rll.printList(n1);
        rll.reverse(n1);
        System.out.println("After Reverse: ");
        rll.printList(n1);
    }
    public void printList(ListNode head){
        System.out.print("HEAD");
        while(head != null){
            System.out.print("-->");
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println("-->NULL");
    }
    public ListNode reverse(ListNode ListNode){
        if(ListNode.next==null){
            return ListNode;
        }
        ListNode curr_ListNode = reverse(ListNode.next);
        curr_ListNode.next = ListNode;
        return ListNode;
    }
}
