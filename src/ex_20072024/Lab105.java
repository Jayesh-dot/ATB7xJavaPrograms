package ex_20072024;

import java.util.*;

public class Lab105 {
    public static void main(String[] args) {
        char envalue;
        Scanner src = new Scanner(System.in);
        System.out.println("Enter the character to check the Vowels or Consonant");
        envalue = src.next().charAt(0);

        if ((envalue == 'a') || (envalue == 'e') || (envalue == 'i') || (envalue == 'o') || (envalue == 'u')) {
            System.out.println("Vowels");
        } else {
            System.out.println("Consonant");
        }
    }
}
