package binarytree;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    static TreeNode root = null;
    public static void levelOrder(TreeNode root){
        if(root == null)
            return;
        levelOrder(root.left);
        if(root.val % 2 == 0)
            System.out.println(root.val);
        levelOrder(root.right);
    }
}
public class BinaryTreeDemo {
    public static void main(String [] args){
        Math.l
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        BinaryTree.root = root;

        BinaryTree.levelOrder(root);
    }
}
