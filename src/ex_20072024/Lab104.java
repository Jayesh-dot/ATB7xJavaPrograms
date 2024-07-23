package ex_20072024;

import java.util.*;

public class Lab104 {
    public static void main(String[] args) {

        int first_no, Second_no, Third_no;

        Scanner src = new Scanner(System.in);
        System.out.println("Enter the first number");
        first_no = src.nextInt();
        System.out.println("Enter the Second number");
        Second_no = src.nextInt();
        System.out.println("Enter the third number");
        Third_no = src.nextInt();

        // Logic to verify the largest number using if loop
        if (first_no > Second_no && first_no > Third_no) {
            System.out.println("Largest number is " + first_no);
        } else if (Second_no > first_no && Second_no > Third_no) {
            System.out.println("Largest number is " + Second_no);
        } else {
            System.out.println("Largest number is " + Third_no);
        }
    }
}
