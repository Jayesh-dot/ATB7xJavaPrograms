package ex_20072024;

import java.util.*;

public class Lab103 {
    public static void main(String[] args) {

        Scanner src = new Scanner(System.in);
        System.out.println("Enter the number to check if +,- or zero value");
        int num = src.nextInt();
        if (num > 0) {
            System.out.println("Positive number :" + num);
        } else if (num < 0) {
            System.out.println("Negative number :" + num);
        } else {
            System.out.println(" value" + num);
        }
    }
}
