package assignment1;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args){
        System.out.println("Enter your total score out of 400");
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        double result = (input/400)*100;
        System.out.println("Your percentage is : "+result);
        if(result <= 100 && result >= 90){
            System.out.println("Your Grade is: A");
        }else if(result <= 89 && result >= 80){
            System.out.println("Your Grade is: B");
        }else if(result <= 79 && result >= 70){
            System.out.println("Your Grade is: C");
        }else if(result <= 69 && result >= 60){
            System.out.println("Your Grade is: D");
        }else{
            System.out.println("Result is Fail");
        }
    }

}
