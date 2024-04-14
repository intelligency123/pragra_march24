package assignment2;

import java.util.Scanner;

//Take user age as input and check if user is eligible to vote or not
public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if(age>=18){
            System.out.println("You are eligible for voting");
        }else{
            System.out.println("You are not eligible for voting");
        }
    }
}
