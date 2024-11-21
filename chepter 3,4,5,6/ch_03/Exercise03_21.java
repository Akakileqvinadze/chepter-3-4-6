
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
/*
 * h is the day of the week
 * q is the day of the month.
 * m is the month
 * j is the century
 * k is the year of the century
 * */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int k = scanner.nextInt();
        System.out.println("Enter month: 1-12:");
        int m = scanner.nextInt();
        System.out.println("Enter the day of the month: 1-31:");
        int q = scanner.nextInt();
        LocalDate localdata = LocalDate.of(k,m,q);
        DayOfWeek dayOfWeek = localdata.getDayOfWeek();
        System.out.println(dayOfWeek);
        }
        }




