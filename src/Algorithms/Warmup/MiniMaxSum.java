package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 20-Apr-17 at 12:24 AM.
 *
 Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers.
 Then print the respective minimum and maximum values as a single line of two space-separated long integers.

 Input Format
 A single line of five space-separated integers.

 Output Format
 Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than 32 bit integer.)

 Sample Input
 1 2 3 4 5

 Sample Output
 10 14
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();

        long[] arr = {a, b, c, d, e};
        long totalSum = 0;
        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        long minSum = totalSum - a;
        long maxSum = totalSum - a;

        for(int i = 0; i < arr.length; i++){
            long tempSum = totalSum - arr[i];
            if(tempSum < minSum) minSum = tempSum;
            if(tempSum > maxSum) maxSum = tempSum;
            tempSum = 0;
        }

        System.out.print(minSum + " " + maxSum);
    }
}
