package data_structures.trees;

import javax.swing.tree.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sajid on 17-Sep-17 at 6:11 PM.
 */
public class FindNodeWithoutRecursion {

    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode findNode(TreeNode root, int val) {

        if(root != null){

            Queue<TreeNode> nodeQ = new LinkedList<TreeNode>();
            nodeQ.add(root);

            while(!nodeQ.isEmpty()){

                TreeNode curr = nodeQ.poll();

                if(val == curr.data){
                    return curr;
                }

                if(curr.left != null) nodeQ.add(curr.left);

                if(curr.right != null) nodeQ.add(curr.right);

            }
        }

        return null;
    }
}
