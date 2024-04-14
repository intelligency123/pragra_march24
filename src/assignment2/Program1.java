package assignment2;

import java.util.Scanner;

//Calculate Area of circle
public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle is : "+area);
    }
}
