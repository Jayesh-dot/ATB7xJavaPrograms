package ex_20072024;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        /* Program to take a user input and check if number is EVEN or ODD */
        // 1. figure out the inputs ?- Data type -.int
        // 2. How to take the input in Java ? Scanner Class
        // 3. nextInt() -> Input
        // 4. Do we need conversion or directly
        // 5. Write a rough logic
        // 6. Optimize the code.

        Scanner src = new Scanner(System.in); //Object of scanner class
        System.out.println("Enter the user number");
        int user_input_one = src.nextInt();
        System.out.println("User entered 1st input is :" + user_input_one);

        //condition
        if (user_input_one % 2 == 0) {
            System.out.println("The Number is :Even");
        } else {
            System.out.println("The Number is :Odd");
        }
    }
}
