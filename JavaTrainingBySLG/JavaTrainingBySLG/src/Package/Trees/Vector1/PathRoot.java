package Package.Trees.Vector1;

import java.util.Vector;

public class PathRoot{
 public void pathRoot(TreeNode root,Vector<Integer> path){
    if(root==null)
        return;
    if(root.left==null&&root.right==null)
        System.out.println(path);
    path.add(root.val);
    path.add(root.left.val);
    path.add(root.right.val);
    }
}
