package data_structures.trees;

/**
 * Created by sajid on 05-Sep-17 at 8:41 PM.
 */
public class LevelOrderTraversal {

 class Node {
     int data;
     Node left;
     Node right;
 }

    void levelOrder(Node root) {
        for(int h = 1; h <= height(root); h++){
            printLevel(root, h);
        }
    }

    void printLevel(Node curr, int level){
        if(curr == null) return;

        else if(level == 1) System.out.print(curr.data + " ");

        else{
            printLevel(curr.left, level - 1);
            printLevel(curr.right, level - 1);
        }
    }


    int height(Node root){

        if(root == null)
            return 0;

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int height = (leftHeight > rightHeight) ? (leftHeight + 1) : (rightHeight + 1);

        return height;
    }
}
