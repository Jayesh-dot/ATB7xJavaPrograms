package ex_20072024;

import java.util.*;

public class Lab093 {
    public static void main(String[] args) {
        /*
         Web Automation
         I will ask user which browser you want me to run the code.
         chrome -> start chrome, firefox -> firefox, edge -> execution edge
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name !! where you want to execute the program");
        String browserName = sc.next();
        browserName = browserName.toLowerCase();

        switch (browserName) {
            case "chrome":
                System.out.println("Starting the Chrome Browser");
                break;
            case "firefox":
                System.out.println("Starting the Firefox browser");
                break;
            case "edge":
                System.out.println("Starting the Edge browser");
                break;
            default:
                System.out.println("Invalid browser selection");
                break;
        }

    }
}
