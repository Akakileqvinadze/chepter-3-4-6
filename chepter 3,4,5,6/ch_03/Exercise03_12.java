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
        int sum = 0;
        System.out.println("enter month and yer:");
        int number = scanner.nextInt();
        int numberone = scanner.nextInt();
        int numbertwo = scanner.nextInt();
        int[] array= new int[3];
        array[0]=number;
        array[1]=numberone;
        array[2]=numbertwo;

        if(array[0]==array[2]){
            System.out.print(number+""+numberone+""+numbertwo);
            System.out.print(" is a palindrome");
        }
        else{
            System.out.print(number+""+numberone+""+numbertwo);
            System.out.print(" is not a palindrome");
        }
    }
}