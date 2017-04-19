package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 19-Apr-17 at 4:10 PM.
 *
 * Given an array of  integers, can you find the sum of its elements?
 *
 * Input Format
 * The first line contains an integer, n, denoting the size of the array.
 * The second line contains n space-separated integers representing the array's elements.
 *
 * Output Format
 * Print the sum of the array's elements as a single integer.
 *
 * Sample Input
 * 6
 * 1 2 3 4 10 11
 *
 * Sample Output
 * 31
 *
 */
public class simpleArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Read number of elements in the array
        int n = scan.nextInt();
        //Read the elements of the array
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += scan.nextInt();
        }
        //Print the sum
        System.out.println(sum);
    }
}
