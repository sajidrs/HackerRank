package data_structures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sajid on 30-Jun-17 at 6:31 PM.
 */
public class SimpleTextEditor {
    private static StringBuffer editor = new StringBuffer();
    private static Stack<String> myStack = new Stack<String>();


    public static void append(String W){
        editor.append(W);
        myStack.push(editor.toString());
    }

    public static void delete(int k){
        editor.setLength(editor.length() - k);
        myStack.push(editor.toString());
    }

    public static void print(int k){
        System.out.println(editor.charAt(k-1));
    }

    public static void undo(){
        if(!myStack.isEmpty()) {
            myStack.pop();
            editor.setLength(0);
            if(!myStack.isEmpty()) editor.append(myStack.peek());
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int noOfQueries = scan.nextInt();
        int choice = 0;
        for(int i = 0; i < noOfQueries; i++){
            choice = scan.nextInt();
            switch(choice){
                case 1: String inputW = scan.next();
                    append(inputW);
                    break;
                case 2: int deleteK = scan.nextInt();
                    delete(deleteK);
                    break;
                case 3: int printK = scan.nextInt();
                    print(printK);
                    break;
                case 4: undo();
                    break;
                default: System.out.println("Invalid Operation");
            }
        }

    }
}
