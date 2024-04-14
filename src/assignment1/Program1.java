package assignment1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character");
        char input = scanner.next().charAt(0);
        if(input == 'a' ||input ==  'i'||input ==  'e'||input ==  'o'||input == 'u'){
            System.out.println("The character you have entered is vowel");

        }else{
            System.out.println("The character you have entered is consonant");
        }


    }
}
