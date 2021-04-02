package Package.Trees.Vector1;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.val=data;
        this.left=null;
        this.right=null;
    }
}
class BinarySearchTree
{
    public TreeNode getMax(TreeNode root)
    {
        while(root!=null)
        {
            if(root.right==null)
                return root;
            root=root.right;
        }
        return root;
    }
    public TreeNode getMin(TreeNode root)
    {
        while(root.left!=null)
            root=root.left;
        return root;
    }
    public TreeNode getMaxRecursive(TreeNode root)
    {
        if(root.right==null){
             return root;
        }

        return getMaxRecursive(root.right);

    }
    public TreeNode getMinRecursive(TreeNode root)
    {
        if(root.left==null)
            return root;
        return getMinRecursive(root.left);
    }
    public Boolean searchElement(TreeNode root,int data) {
        if (root == null)
            return false;
        if (root.val == data)
            return true;
        else if (root.val < data)
            return searchElement(root.right, data);
        else
            return searchElement(root.left, data);
    }
    public void inorder(TreeNode root)
    {
        if(root==null)
            return;

        inorder(root.left);
        if(root.val % 2 == 0)
        System.out.print(root.val+" even");

        inorder(root.right);

        
    }
    HashMap<Integer,Vector<Integer>> hash=new HashMap<>();

    public void inorderVertical(TreeNode root,int axis) {

        Vector<Integer> al=new Vector<>();
        if(root==null)
            return ;
        if(hash.get(axis)==null){
            al.add(root.val);
            hash.put(axis,al);}
        else
        {
        al.add(root.val);
        hash.put(axis,hash.get(axis));}
       inorderVertical(root.left,--axis);

       // hash.put(root.val,axis);//System.out.println(root.val+" "+axis );//hash.put(root.val,axis);
        axis++;
        inorderVertical(root.right,++axis);

    }
    public void leftView(TreeNode root,int depth,int max)
    {
if(root==null)
    return;

            leftView(root.left,depth+1,max);

            if(depth>max) {
                System.out.println("leftView : "+root.val+" ");
                max = depth;
            }

        leftView(root.right,--depth,max);


    }

    public void printPath(TreeNode root,Vector<Integer> path){
        if(root==null)
            return;
        path.add(root.val);
        if(root.left==null&&root.right==null)
            System.out.println(path);

        printPath(root.left,path);
        printPath(root.right,path);
        path.remove(path.size()-1);
    }



   /* public List<List<Integer>> levelOrder(TreeNode root) {                                            //levl order Traversal








        Queue<TreeNode> q=new LinkedList<TreeNode>();
        List<Integer> l1=new ArrayList<Integer>();
        List<List<Integer>> l2=new ArrayList<List<Integer>>();

        if(root==null)
            return l2;
        q.add(root);q.add(null);
        while(!q.isEmpty())
        {
            TreeNode t=q.poll();
            if(t==null)
            {
                if(!q.isEmpty())
                {
                    q.add(null);
                    int data = l1.get(0);
                    System.out.println(data);
                    l1.add(data);
                    l2.add(l1);
                    l1=new ArrayList<Integer>();
                }
            }
            else
            {
                if(t.left!=null)
                    q.add(t.left);
                if(t.right!=null)
                    q.add(t.right);
                l1.add(t.val);
            }


        }
        System.out.println(l1.get(0));
        //int = l1.get(0);
        l2.add(l1) ;
        return l2;
    }  */


















}
public class BinarySearchTreeDemo {
    public static void main(String[] args) {


        TreeNode root = new TreeNode(15);
        root.left = new TreeNode(10);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(8);
        root.left.right = new TreeNode(11);
        root.left.left.right = new TreeNode(9);
        root.left.left.left = new TreeNode(5);
        root.left.left.left.left = new TreeNode(2);
        root.left.left.left.right = new TreeNode(6);
        root.right.left = new TreeNode(16);
        root.right.right = new TreeNode(25);
        root.right.right.left = new TreeNode(22);
        root.right.right.left.left = new TreeNode(23);
        root.right.right.right = new TreeNode(30);
        root.right.right.right.left = new TreeNode(27);

        BinarySearchTree bst = new BinarySearchTree();

        TreeNode node = bst.getMax(root);
        TreeNode node2 = bst.getMin(root);
        TreeNode node3 = bst.getMaxRecursive(root);
        TreeNode node4 = bst.getMinRecursive(root);
        bst.inorderVertical(root,0);
        bst.inorder(root);
        System.out.println(node.val);
        System.out.println(node2.val);
        System.out.println(node3.val);
        System.out.println(node4.val);
        System.out.println(bst.searchElement(root,50));
        //HashMap<Integer,Integer> h=new HashMap<>();
    bst.leftView(root,0,-1);
        System.out.println((bst.hash));
        Vector<Integer> v=new Vector<>();
        bst.printPath(root,v);
    }
}
