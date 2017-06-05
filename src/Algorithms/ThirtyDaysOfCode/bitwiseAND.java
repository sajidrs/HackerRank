package Algorithms.ThirtyDaysOfCode;
import java.util.Scanner;
/**
 * Created by sajid on 05-Jun-17 at 10:59 AM.
 *   Read N
 *   Read K
 *       Loop over i: 1 till N
 *           Loop over j: i+1 till N
 *                       andResult = i & j
 *                       (andResult) < K
 maxAnd = (maxAnd > andResult) ? maxAnd : andResult;
 print(maxAnd)
 */

public class bitwiseAND {

    public static void findMaxAnd(int n, int k){
        int maxAnd = 0;
        int andResult = 0;

        for(int A = 0; A < n; A++){
            for(int B = A + 1; B < n; B++){
                andResult = A & B;
                if(andResult < k){
                    maxAnd = (maxAnd > andResult) ? maxAnd : andResult;
                }
            }
        }
        System.out.println(maxAnd);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            findMaxAnd(n, k);
        }
    }
}
