package assignment2;

import java.util.Scanner;

// Take a numerical month input(1-12) and print name of month
public class Program5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a numerical month (1-12)");
        int month = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("Month is january");
                break;
            case 2:
                System.out.println("Month is february");
                break;
            case 3:
                System.out.println("Month is march");
                break;
            case 4:
                System.out.println("Month is april");
                break;
            case 5:
                System.out.println("Month is may");
                break;
            case 6:
                System.out.println("Month is june");
                break;
            case 7:
                System.out.println("Month is july");
                break;
            case 8:
                System.out.println("Month is august");
                break;
            case 9:
                System.out.println("Month is september");
                break;
            case 10:
                System.out.println("Month is october");
                break;
            case 11:
                System.out.println("Month is november");
                break;
            case 12:
                System.out.println("Month is december");
                break;
            default:
                System.out.println("please enter correct value");
        }
    }
}
