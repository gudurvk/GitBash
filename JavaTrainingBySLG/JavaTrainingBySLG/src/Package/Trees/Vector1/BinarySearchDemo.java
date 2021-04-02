package Package.Trees.Vector1;

import java.util.Vector;
class BinarySearch
{
    public int binarySearch(Vector<Integer> A, int target,int start,int end)
    {
       int mid=start+(end-start) /2;
        if(start<=end) {

            if (A.get(mid) == target) {
                return mid;
            } else if (A.get(mid) > target)
                return this.binarySearch(A, target, start, mid - 1);
            else
                return this.binarySearch(A, target, mid + 1, end);
        }
           return -1;
       }
      /* public int binarySearch2(Vector<Integer> A,int target ,int start , int end)
       {
           while(start<=end)
           {

           }return -1;
       }*/

}
public class BinarySearchDemo {
    public static void main(String[] args) {
    Vector<Integer> v=new Vector<>();
    v.add(1);
    v.add(3);
    v.add(5);
    v.add(7);
    v.add(9);
    v.add(13);
    v.add(17);
    v.add(18);
    v.add(19);
    v.add(20);

        BinarySearch bs=new BinarySearch();
        int i=bs.binarySearch(v,0,0,v.size()-1);
        System.out.println(v);
        System.out.println(i);
    }
}
