import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter month and yer:");
        int month = scanner.nextInt();
        int yer = scanner.nextInt();
        LocalDate ldata = LocalDate.of(yer,month,2);
        System.out.print(ldata.getMonth());
        System.out.print("  ");
        System.out.print(ldata.getYear());
        System.out.print( "  had  "+ ldata.lengthOfMonth()+"  days");
    }
}