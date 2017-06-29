package data_structures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sajid on 27-Jun-17 at 1:21 PM.
 */
public class MaximumElement {
    static Stack<Integer> myStack = new Stack<>();
    static Stack<Integer> maxStack = new Stack<>();

    public static void addElement(int item){
        myStack.push(item);

        if(maxStack.isEmpty() || item >= maxStack.peek()) {
            maxStack.push(item);
        }
    }

    public static void deleteElement(){
        if(!myStack.isEmpty()){
            int currItem = myStack.pop();
            if( currItem == maxStack.peek() ) maxStack.pop();
        }
    }

    public static void printMax(){
        System.out.println(maxStack.peek());
    }

    public static void main(String[] args) {
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++){
            choice = scan.nextInt();
            switch(choice){
                case 1: addElement(scan.nextInt());
                    break;
                case 2: deleteElement();
                    break;
                case 3: printMax();
                    break;
                default: System.out.println("Invalid Choice");
            }
        }
    }
}
