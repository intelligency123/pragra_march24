package assignment2;

import java.util.Scanner;

//Take a user input as days of week and check if its weekday or weekend
public class Program4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a  day of week");
        String day = scanner.next();
        String dayOfWeek = day.toLowerCase();
        switch (dayOfWeek){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Day you entered is weekday");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Day you entered is weekend");
                break;
            default:
                System.out.println("please enter correct day of week");
        }
    }
}
