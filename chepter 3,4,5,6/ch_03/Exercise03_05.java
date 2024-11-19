import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int number = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int days = scanner.nextInt();
        String numberst = null;
        String daysst = null;

        if (number == 0) {
            numberst = "sonday";
        } else if (number == 1) {
            numberst = "monday";
        } else if (number == 2) {
            numberst = "thusday";
        } else if (number == 3) {
            numberst = "wensday";
        } else if (number == 4) {
            numberst = "serthday";
        } else if (number == 5) {
            numberst = "friday";
        } else if (number == 6) {
            numberst = "Thursday";
        }


        if (number + days == 0||number + days == 7||number + days == 14||number + days == 21||number + days == 28)
            daysst = "sonday";
        else if (number + days == 1||number + days == 8||number + days == 15||number + days == 22||number + days == 29) {
            daysst = "monday";
        } else if (number + days == 2||number + days == 9||number + days == 16||number + days == 23||number + days == 30) {
            daysst = "thusday";
        } else if (number + days == 3||number + days == 10||number + days == 17||number + days == 24||number + days == 31) {
            daysst = "wensday";
        } else if (number + days == 4||number + days == 11||number + days == 18||number + days == 25) {
            daysst = "serthday";
        } else if (number + days == 5||number + days == 12||number + days == 19||number + days == 26) {
            daysst = "friday";
        } else if (number + days == 6||number + days == 13||number + days == 20||number + days == 27) {
            daysst = "Thursday";
        }
        System.out.println("Today is " + numberst + " and the future day is " + daysst);

    }
}