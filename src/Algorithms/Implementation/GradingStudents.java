package Algorithms.Implementation;

import java.util.Scanner;

/**
 * Created by sajid on 20-Apr-17 at 9:55 AM.
 *
 *
 HackerLand University has the following grading policy:

 Every student receives a grade in the inclusive range from 1 to 100.
 Any grade less than 40 is a failing grade.
 Sam is a professor at the university and likes to round each student's grade according to these rules:

 If the difference between the grade and the next multiple of 5 is less than 3, round grade up to the next multiple of 5.
 If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.

 Given the initial value of grade for each of Sam's n students, write code to automate the rounding process.
 For each grade, round it according to the rules above and print the result on a new line.

 Input Format
 The first line contains a single integer denoting n(the number of students).
 Each line i of the n subsequent lines contains a single integer, grade[i], denoting student i's grade.

 Output Format
 For each  of the  grades, print the rounded grade on a new line.

 Sample Input 0
 4
 73
 67
 38
 33

 Sample Output 0
 75
 67
 40
 33
 */
public class GradingStudents {

    static int solve(int grade){
        // Complete this function
        int finalGrade = 0;
        if(grade < 38){
            finalGrade = grade;
            return finalGrade;
        }
        else if(grade % 5 != 0 ){
            int nextMultiple = (grade - (grade % 5)) + 5;
            if((nextMultiple - grade) < 3){
                finalGrade = nextMultiple;
                return finalGrade;
            }
            else{
                finalGrade = grade;
                return finalGrade;
            }
        }
        else{
            finalGrade = grade;
            return finalGrade;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        for(int grades_i=0; grades_i < n; grades_i++){
            int result = solve(grades[grades_i]);
            System.out.println(result);
        }
    }
}

