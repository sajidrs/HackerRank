package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 19-Apr-17 at 4:50 PM.
 *
 Given a square matrix of size NxN, calculate the absolute difference between the sums of its diagonals.

 Input Format
 The first line contains a single integer, N.
 The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

 Output Format
 Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

 Sample Input
 3
 11 2 4
 4 5 6
 10 8 -12

 Sample Output
 15
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //Read the size of the NxN matrix
        int n = scan.nextInt();
        int a[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = scan.nextInt();
            }
        }
        //Calculating sum of left diagonal
        int leftSum = 0;
        for(int i = 0; i < n; i++){
            leftSum += a[i][i];
        }
        //Calculating sum of right diagonal
        int rightSum = 0;
        int i =0, j = n-1;
        for(int k = 0; k < n; k++){
            rightSum += a[i++][j--];
        }
        //Calculating the difference
        int result = Math.abs(leftSum - rightSum);
        System.out.println(result);
    }
}
