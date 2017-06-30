package data_structures.stacks;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sajid on 29-Jun-17 at 5:56 PM.
 */
public class EqualStacks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();

        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            if(s1.isEmpty()) s1.push(0);
            else s1.push(s1.peek() + h1[h1_i] );
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            if(s2.isEmpty()) s2.push(0);
            else s2.push(s2.peek() + h2[h2_i] );
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            if(s3.isEmpty()) s3.push(0);
            else s3.push(s3.peek() + h3[h3_i] );
        }

        while(true){
            if(s1.peek() > s2.peek() || s1.peek() > s3.peek()){
                s1.pop();
            }
            else if(s2.peek() > s1.peek() || s2.peek() > s3.peek()){
                s2.pop();
            }
            else if(s3.peek() > s1.peek() || s3.peek() > s2.peek()){
                s3.pop();
            }
            else{
                break;
            }
        }
        System.out.println(s1.peek());

    }
}
