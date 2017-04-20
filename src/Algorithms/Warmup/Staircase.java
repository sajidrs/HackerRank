package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 19-Apr-17 at 5:40 PM.
 *
 Print Staircase using Hash and spaces.
 Consider a staircase of size 4:

     #
    ##
   ###
  ####

 */
public class Staircase {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        for(int j=0;j<n;j++){
            for(int i=1;i<=n;i++){
                System.out.print(i<n-j?" ":"#");
            }
            System.out.println("");
        }
    }
}