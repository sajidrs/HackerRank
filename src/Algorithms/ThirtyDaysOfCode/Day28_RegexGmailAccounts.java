package Algorithms.ThirtyDaysOfCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sajid on 05-Jun-17 at 10:37 AM.
 */
public class Day28_RegexGmailAccounts {

    public static ArrayList<String> gmailAccounts = new ArrayList<String>();

    public static void printGmail(String firstName, String emailID){

        Pattern p = Pattern.compile(".*@gmail.com");
        Matcher m = p.matcher(emailID);

        if(m.find()){
            gmailAccounts.add(firstName);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
            printGmail(firstName, emailID);
        }
        Collections.sort(gmailAccounts);
        for(String s : gmailAccounts){
            System.out.println(s);
        }
    }
}
