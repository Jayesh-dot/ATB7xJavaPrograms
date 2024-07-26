package ex_homepgm;
import java.util.*;
public class Triangle21072024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the lengths of the sides of the triangle
        System.out.print("Enter the length of side 1: ");
        int side1 = scanner.nextInt();

        System.out.print("Enter the length of side 2: ");
        int side2 = scanner.nextInt();

        System.out.print("Enter the length of side 3: ");
        int side3 = scanner.nextInt();

        // Classify the triangle
        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is equilateral.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is isosceles.");
        } else {
            System.out.println("The triangle is scalene.");
        }

        scanner.close();
    }
}

