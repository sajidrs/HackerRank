package Algorithms.Warmup;

import java.util.Scanner;

/**
 * Created by sajid on 20-Apr-17 at 12:32 AM.
 *
 Colleen is turning  years old! She has  candles of various heights on her cake, and candle i has height height[i].
 Because the taller candles tower over the shorter ones, Colleen can only blow out the tallest candles.

 Given the height[i] for each individual candle, find and print the number of candles she can successfully blow out.

 Input Format
 The first line contains a single integer, , denoting the number of candles on the cake.
 The second line contains  space-separated integers, where each integer  describes the height of candle .

 Output Format
 Print the number of candles Colleen blows out on a new line.

 Sample Input 0
 4
 3 2 1 3

 Sample Output 0
 2
 */
public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max) max = height[height_i];
        }
        int numTallCandles = 0;
        for(int height_i=0; height_i < n; height_i++){
            if(height[height_i] == max) numTallCandles++;
        }
        System.out.println(numTallCandles);
    }
}
