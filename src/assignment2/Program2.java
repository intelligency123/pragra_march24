package assignment2;

import java.util.Scanner;

//Find area of square
public class Program2 {
    public static void main(String[] args) {
        System.out.println("Enter length of side in cm");
        Scanner scanner = new Scanner(System.in);
        double sideLength = scanner.nextDouble();
        double area = sideLength * sideLength;
        System.out.println("Area of square is : "+area+" cm ");
    }
}
