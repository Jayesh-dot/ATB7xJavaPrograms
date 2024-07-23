package ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Program for max number of two inputs using Math.max() and if loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 :");
        int _num1 = sc.nextInt();
        System.out.println("Enter number 2 :");
        int _num2 = sc.nextInt();

        System.out.println("Use of Math.max  Maximum number is -> " + Math.max(_num1, _num2));

        System.out.println("Using if loop");
        if (_num1 > _num2) {
            System.out.println("Max number is  ->" + _num1);
        } else if (_num2 > _num1) {
            System.out.println("Max number is  -> " + _num2);
        } else {
            System.out.println("Both number are equal");
        }

    }
}
