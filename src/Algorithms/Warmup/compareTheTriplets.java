package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 19-Apr-17 at 4:18 PM.
 *
 Alice and Bob each created one problem for HackerRank.
 A reviewer rates the two challenges, awarding points on a scale from 1 to 100 for three categories: problem clarity, originality, and difficulty.

 We define the rating for Alice's challenge to be the triplet A , and the rating for Bob's challenge to be the triplet B.

 Your task is to find their comparison points by comparing  with ,  with , and  with .

 If a[i] > b[i], then Alice is awarded  point.
 If a[i] < b[i], then Bob is awarded  point.
 If a[i] = b[i], then neither person receives a point.
 Comparison points is the total points a person earned.

 Given A and B, can you compare the two challenges and print their respective comparison points?

 Input Format

 The first line contains 3 space-separated integers, a[0], a[1], and a[2], describing the respective values in triplet .
 The second line contains 3 space-separated integers, b[0], b[1], and b[2], describing the respective values in triplet .

 Constraints

 Output Format

 Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

 Sample Input

 5 6 7
 3 6 10

 Sample Output

 1 1
 */

public class compareTheTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        // Write Your Code Here
        int resultA = 0;
        int resultB = 0;
        int[] a = {a0, a1, a2};
        int[] b = {b0, b1, b2};
        for(int i = 0; i < a.length; i++){
            if(a[i] > b[i]){
                resultA++;
            }
            else if(a[i] < b[i]){
                resultB++;
            }
            else
                continue;
        }
        System.out.println(resultA +" "+ resultB);
    }
}
