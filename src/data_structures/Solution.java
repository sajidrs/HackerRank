package data_structures;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sajid on 30-Jun-17 at 11:31 PM.
 */

public class Solution {
    private static int[] primes;
    private static Stack<Stack<Integer>> pile;

    public static void generatePrimes(int n){
        System.out.println("Generating Primes...");
        int primeCount = 1;
        int num = 3;
        boolean isPrime = false;
        primes[0] = 2;

        for(int i = 2; primeCount < n; i++){
            isPrime = false;
            if(!checkPrime(i)) continue;
            else{
                primes[primeCount++] = num;
                num++;
            }
        }

        System.out.println("Generating Primes Completed!");
    }
    private static boolean checkPrime(int number){
        boolean isPrimeCheck= true;
        if (number==2){
            isPrimeCheck= true;;
        }
        else if(number%2==0){
            isPrimeCheck= false;
        }
        else{
            int maxCount= (int)Math.ceil(Math.sqrt(number));
            for(int i=3; i<=maxCount; i+=2){
                if(number%i==0){
                    isPrimeCheck= false;
                    break;
                }
            }
        }
        return isPrimeCheck;
    }

    public static void splitStack(Stack<Integer> stackToSplit, int prime){

        Stack<Integer> stackA = new Stack<Integer>();
        Stack<Integer> stackB = new Stack<Integer>();
        System.out.println(prime);

        while(!stackToSplit.isEmpty()){
            int curr = stackToSplit.pop();
            if(curr % prime == 0){
                stackB.push(curr);
                System.out.println("Pushed B" + curr);
            }
            else{
                stackA.push(curr);
                System.out.println("Pushed A" + curr);
            }
        }
        pile.push(stackB);
        pile.push(stackA);
    }

    public static void printPile(){
        while(!pile.isEmpty()){
            Stack<Integer> temp = pile.pop();
            while(!temp.isEmpty()){
                System.out.println(temp.pop());
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Stack<Integer> initialStack = new Stack<Integer>();
        pile = new Stack<Stack<Integer>>();
        Stack<Integer> stackB = new Stack<Integer>();

        int n = in.nextInt();
        int q = in.nextInt();

        primes = new int[n];
        int[] number = new int[n];
        generatePrimes(q);

        for(int number_i = 0; number_i < n; number_i++){
            number[number_i] = in.nextInt();
            initialStack.push(number[number_i]);
        }
        pile.push(initialStack);

        for(int i = 0; i < q; i++){
            System.out.println("Iteration #"+i);
            splitStack(pile.pop(), primes[i]);
        }

        printPile();
    }
}

