import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year you want to check");

        int LeapYear = input.nextInt();

        if (LeapYear <= 1580) {
            System.out.println("Your input is invalid for Gregorian calender ");
        } else if (LeapYear > 1580) {
            if (LeapYear % 4 == 0 && LeapYear % 100 != 0 || LeapYear % 400 == 0) {
                System.out.println("This is a Leap Year");
            } else {
                System.out.println("This is not a Leap Year");
            }

        }
    }
}
