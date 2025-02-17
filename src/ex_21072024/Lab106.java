package ex_21072024;

public class Lab106 {
    public static void main(String[] args) {
        /* Condition -> If else, switch ( multiple conditions)
         Loops -> For, while, do while - perform a task multiple times.
         Iterative, repetition
        */
        System.out.println("Following statement can be update by using for loop\n");
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);
        System.out.println(6 + ".7...upto.");
        System.out.println(10);
        System.out.println('\n');

        /*
         Loop a here to perform a task which is repetitive in nature.
         for loop
         for(A;BC) {
            Task which you want to perform multiple time.
         }
         A - initialization
         B - Condition for termination
         C - increment / decrement -> updation
        */
        System.out.println("From for-loop");
        for (int i = 1; i <= 10; ++i) {
            /* here is the code you want to execute */
            System.out.println("Test - " + i);
        }
    }
}
