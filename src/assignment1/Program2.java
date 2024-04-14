package assignment1;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Write your choice");
        System.out.println("1. Write Red");
        System.out.println("1. Write Yellow");
        System.out.println("1. Write Green");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        switch (input){
            case "Red":
                System.out.println("Stop");
                break;
            case "Yellow":
                System.out.println("Prepare to stop");
                break;
            case "Green":
                System.out.println("Go");
                break;
            default:
                System.out.println("Please write correct choice and also watch for lower and upper case");
        }
    }
}
