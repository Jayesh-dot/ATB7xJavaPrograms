package ex_14072024;

public class Lab062 {
    public static void main(String[] args) {
        /* Program for incremental*/
        int a = 10;
        System.out.println("Value is " + (a++ + a));
        /* A = a++ -> 10 , a = 11
         +
         B = a = 11 ->  A+B = 10+11
        */
    }

}
