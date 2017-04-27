package Algorithms.ThirtyDaysOfCode;

import java.util.Scanner;

/**
 * Created by sajid on 26-Apr-17 at 9:13 PM.
 *

 Input Format
 The first line contains firstName, lastName and id respectively.
 The second line contains the number of test scores.
 The third line of space-separated integers describes scores.
 Sample Input

 Heraldo Memelli 8135627
 2
 100 80
 Sample Output

 Name: Memelli, Heraldo
 ID: 8135627
 Grade: O
 */

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    public void printPerson(){
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + 	"\nID: " + idNumber);
    }

}
class Student extends Person{
    private int[] testScores;

    /*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */

    // Write your constructor here
    public Student(String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.testScores = scores;
    }
    /*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    public String calculate(){
        int totalGrade = 0;
        String finalGrade = "";
        for(int i =0; i < testScores.length; i++ ){
            totalGrade += testScores[i];
        }
        int gradeAvg = totalGrade / testScores.length;
        if(gradeAvg < 40)
            finalGrade = "T";
        if(gradeAvg >= 40 && gradeAvg < 55)
            finalGrade = "D";
        if(gradeAvg >= 55 && gradeAvg < 70)
            finalGrade = "P";
        if(gradeAvg >= 70 && gradeAvg < 80)
            finalGrade = "A";
        if(gradeAvg >= 80 && gradeAvg < 90)
            finalGrade = "E";
        if(gradeAvg >= 90 && gradeAvg <= 100)
            finalGrade = "O";

        return finalGrade;
    }
}
public class Day12_Inheritance {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate() );
    }
}
