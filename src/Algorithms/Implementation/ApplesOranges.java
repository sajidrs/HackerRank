package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by sajid on 20-Apr-17 at 1:47 PM.
 *
 Sam's house has an apple tree and an orange tree that yield an abundance of fruit.
s is the start point and t is the end point of the house.
 The apple tree is to the left of his house, and the orange tree is to its right.
 You can assume the trees are located on a single point, where the apple tree is at point a and the orange tree is at point b.

 When a fruit falls from its tree, it lands d units of distance from its tree of origin along the x-axis.
 A negative value of d means the fruit fell d units to the tree's left, and a positive value of  means it falls d units to the tree's right.

 Given the value of d for m apples and n oranges, can you determine how many apples and oranges will fall on Sam's house
 (i.e., in the inclusive range )? Print the number of apples that fall on Sam's house as your first line of output,
 then print the number of oranges that fall on Sam's house as your second line of output.

 Input Format
 The first line contains two space-separated integers denoting the respective values of s and t.
 The second line contains two space-separated integers denoting the respective values of a and b.
 The third line contains two space-separated integers denoting the respective values of m and n.
 The fourth line contains m space-separated integers denoting the respective distances that each apple falls from point a.
 The fifth line contains n space-separated integers denoting the respective distances that each orange falls from point b.

 Output Format
 Print two lines of output:
 On the first line, print the number of apples that fall on Sam's house.
 On the second line, print the number of oranges that fall on Sam's house.

 Sample Input 0
 7 11
 5 15
 3 2
 -2 2 1
 5 -6

 Sample Output 0
 1
 1
 */
public class ApplesOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        System.out.println(countFruitsOnHouse(apple, s, t, a));
        System.out.println(countFruitsOnHouse(orange, s, t, b));
    }

    public static int countFruitsOnHouse(int []fruits, int s, int t, int x){
        int count = 0;

        for(int i = 0; i < fruits.length; i++ ){
            int d = fruits[i];
            int position = x + d;
            if(position >= s && position <= t){
                count++;
            }
        }
        return count;
    }
}
