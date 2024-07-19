package ex_14072024;

public class Lab057 {
    public static void main(String[] args) {
        /* Program for long and short */
        long phone_no = 9876543210L;
        // short s = phone_no; // Implicit Narrowing - JVM?
        short s = (short) phone_no;
        System.out.println("Value of s : "+s);
        // JVM - Garbage collector
    }
}
