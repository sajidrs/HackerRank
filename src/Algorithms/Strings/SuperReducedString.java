package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by sajid on 14-May-17 at 12:18 AM.

 Sample Input 0
 aaabccddd

 Sample Output 0
 abd

 Sample Case

 aaabccddd → abccddd
 abccddd → abddd
 abddd → abd
 */
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.next();
        int length = inputString.length();
        int i = 0;
        while( i < length - 1){
            char curr = inputString.charAt(i);
            char next = inputString.charAt(i+1);

            if(curr == next){
                inputString = inputString.substring(0, i) + inputString.substring(i+2);
                length = inputString.length();
                i = 0;
                continue;
            }
            i++;
        }
        if(length == 0){
            System.out.println("Empty String");
        }
        else{
            System.out.println(inputString);
        }
    }
}
