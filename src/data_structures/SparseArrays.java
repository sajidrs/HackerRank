package data_structures;

import java.util.Scanner;

/**
 * Created by sajid on 27-Jun-17 at 12:54 AM.
 * There is a collection of N strings ( There can be multiple occurences of a particular string ).
 * Each string's length is no more than 20 characters. There are also Q queries.
 * For each query, you are given a string, and you need to find out how many times this string occurs in the given collection of N strings.
 *
 Sample Input

 4
 aba
 baba
 aba
 xzxb
 3
 aba
 xzxb
 ab

 Sample Output

 2
 1
 0

 */
public class SparseArrays {

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String[] arr = new String[n];
            for(int i = 0; i < n; i++){
                arr[i] = scan.next();
            }

            int q = scan.nextInt();
            String[] qArr = new String[q];

            for(int i = 0; i < q; i++){
                qArr[i] = scan.next();
            }

            for(int i = 0; i < q; i++){
                int count = 0;
                for(int j = 0; j < n; j++){
                    if(qArr[i].equals(arr[j])){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
