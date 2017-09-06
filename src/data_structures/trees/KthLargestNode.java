package data_structures.trees;

/**
 * Created by sajid on 05-Sep-17 at 2:21 PM.
 */

class Node{

    int data;
    Node left, right;

    Node(int d){
        data = d;
        left = null;
        right = null;
    }
}

class BinarySearchTree{

    Node root;


    BinarySearchTree(){

        this.root = null;
    }


    //Inserting a new Item into the BST
    public void insert(int item){
        this.root = this.insertNewNode(this.root, item);
    }

    //Utility Function to insert New Nodes
    public Node insertNewNode(Node curr, int item){
        if(curr == null){
            return new Node(item);
        }
        else if(item == curr.data){
            return curr;
        }
        else if(item < curr.data){
            curr.left = this.insertNewNode(curr.left, item);
        }
        else{
            curr.right = this.insertNewNode(curr.right, item);
        }
        return curr;
    }

    class Count{
        int count = 0;
    }

    //Find the nth largest element
    public void findNthLargest(int n){
        Count c = new Count();
        this.findN(this.root, n, c);
    }

    //Driver function for finding the nth element
    public void findN(Node curr, int n, Count c){
        if(curr == null || c.count >=  n){
            return;
        }

        this.findN(curr.right, n, c);
        c.count++;
        if(c.count == n){
            System.out.println("2nd Largest Element is: " + curr.data);
            return;
        }
        this.findN(curr.left, n, c);
    }
}

class Test {
    public static void main (String[] args){

        BinarySearchTree myTree = new BinarySearchTree();
        System.out.println("Program to list the nth largest node in BST");
        System.out.println("************************************************");
        /* Let us create following BST
            50
        /     \
        30     70
        / \ / \
    20 40 60 80 */

        myTree.insert(50);
        myTree.insert(30);
        myTree.insert(20);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(60);
        myTree.insert(80);

        //N = 2
        myTree.findNthLargest(2);

    }
}