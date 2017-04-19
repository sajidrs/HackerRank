package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 19-Apr-17 at 4:43 PM.
 *
 * You are given an array of integers of size N.
 * You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large.

 Input Format
 The first line of the input consists of an integer N. The next line contains N space-separated integers contained in the array.

 Output Format
 Print a single value equal to the sum of the elements in the array.

 Sample Input
 5
 1000000001 1000000002 1000000003 1000000004 1000000005

 Output

 5000000015
 */
public class aVeryBigSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Read the number of elements
        int n = scan.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++){
            //add elements to sum
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}
