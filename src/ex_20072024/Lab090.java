package ex_20072024;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {
        //Program Grade Calculator
        /* A = 90-100, B =80-89 C=70-79 D:60-69 F:0-59  */

        /*
        1. Find the User Inputs
           score - data type ?- int
           return character - char A
           scanner -> input
           Interviewer -> int,char

        2. Basic Logic
           if (score>=90 && Score <=100) -> return Grade
           Last - F
           if ( score >= 90 && score <= 100 ) -> return or print grade - A
           else if score <=89 && score >= 80 -> return or orint grade - B
           else if score <=79 && score >= 70 -> return or orint grade - C
           D,E
           else -> grade -> F

        3. Write the code
         */

        Scanner src = new Scanner(System.in);
        System.out.println("Enter the Student Score !!");
        int _score = src.nextInt();
        char grade = 'F';

        if (_score >= 90 && _score <= 100) {
            grade = 'A';
        } else if (_score >= 80 && _score <= 89) {
            grade = 'B';
        } else if (_score >= 70 && _score <= 79) {
            grade = 'C';
        } else if (_score >= 60 && _score <= 69) {
            grade = 'D';
        } else if (_score <= 0 || _score > 100) {
            System.out.println("This is invalid score");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is -> " + grade);
    }
}
