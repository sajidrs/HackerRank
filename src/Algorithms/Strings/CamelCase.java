package Algorithms.Strings;

import java.util.Scanner;

/**
 * Created by sajid on 14-May-17 at 12:35 AM.
 *
 Sample Input
 saveChangesInTheEditor

 Sample Output
 5

 */
public class CamelCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 1;
        for(int i = 0; i < s.length() - 1; i++){
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)){
                count++;
            }
            continue;
        }
        System.out.println(count);
    }
}
