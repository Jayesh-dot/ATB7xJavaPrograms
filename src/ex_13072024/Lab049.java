package ex_13072024;

public class Lab049 {
    public static void main(String[] args) {
        // BODMAS program
        int a = 12;
        boolean b = !(a > 10 || a < 5); // BODMAS
        System.out.println("Boolean value of b is :"+b);
        // BODMAS stands for
        // Bracket, Of, Division,
        // Multiplication, Addition, and Subtraction.
    }
}
