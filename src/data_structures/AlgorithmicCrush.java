package data_structures;

import java.util.Scanner;

/**
 * Created by sajid on 27-Jun-17 at 1:07 PM.
 *
 * Sample Input
 *
 * n m
 * a b k
 *
 5 3
 1 2 100
 2 5 100
 3 4 100
 *
 * Sample Output
 * 200
 */
public class AlgorithmicCrush {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        long[] arr = new long[n];
        long max = 0;
        for(long i = 0; i < m; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            long k = scan.nextLong();
            for(int j = (a - 1); j <= (b - 1); j++){
                arr[j] += k;
                max = (max > arr[j]) ? max : arr[j];
            }
        }
        System.out.println(max);
    }
}
