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
        System.out.println("sheyvanet 3 cifri:");
        int number = scanner.nextInt();
        int numberone = scanner.nextInt();
        int numbertwo = scanner.nextInt();
        int[] array = {1, 2, 3};
        /*
        *
        * latariis nomeria 1 2 3
        * */


        if (number == array[0] && numberone == array[1] && numbertwo == array[2]) {
            System.out.print("award is $10,000.");
        } else if ((number == array[0] || number == array[1] || number == array[2] || numberone == array[0]) || (numberone == array[1] || numberone == array[2]) ||( numbertwo == array[0] || numbertwo == array[1] || numbertwo == array[2])) {
            System.out.print("the award is  $1,000.");
        }
    }
}