package data_structures.trees;

/**
 * Created by sajid on 05-Sep-17 at 7:13 PM.
 */
public class checkBST {
    class Node {
        int data;
        Node left;
        Node right;
    }

    boolean checkForBST(Node root) {

        return checkBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    boolean checkBSTUtil(Node curr, int min, int max){

        if(curr == null) return true;

        if(curr.data < min  || curr.data > max) return false;

        return (checkBSTUtil(curr.left, min, curr.data - 1) && checkBSTUtil(curr.right, curr.data + 1, max));
    }
}
