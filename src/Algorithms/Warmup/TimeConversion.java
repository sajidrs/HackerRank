package Algorithms.Warmup;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sajid on 20-Apr-17 at 9:30 AM.
 */
public class TimeConversion {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String inputTime = "";
            //Read Input Time from user
            //while(scan.hasNext()){
            inputTime += scan.next();
            //}
            String ampm = inputTime.substring(8);
            String outputTime;
            if(ampm.equals("AM")){
                outputTime = inputTime.substring(0,8);
                //Check for 12 AM
                if(outputTime.startsWith("12")) {
                    String[] outputArr = outputTime.split(":");
                    outputArr[0] = "00";
                    outputTime = outputArr[0] + ":" + outputArr[1] + ":" + outputArr[2] ;
                }

            }
            else{
                outputTime = inputTime.substring(0,8);
                //Change if not 12 PM
                if(!outputTime.startsWith("12")){
                    String[] outputArr = outputTime.split(":");
                    int hour = Integer.parseInt(outputArr[0]) + 12;
                    if(hour == 24) outputArr[0] = "00";
                    else           outputArr[0] = Integer.toString(hour);
                    outputTime = outputArr[0] + ":" + outputArr[1] + ":" + outputArr[2] ;
                }
            }
            System.out.println(outputTime);
        }
}
