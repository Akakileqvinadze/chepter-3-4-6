import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in pounds:");
        double weight = scanner.nextDouble();
        System.out.println("Enter feet:");
        double feet = scanner.nextDouble();
        System.out.println("Enter inches:");
        double inches = scanner.nextDouble();

        /*
        * BMI = 703*WEIGHT(IBS)/(HEIGHT(IN))*(HEIGHT(IN))
        * */
        double numberinch = inches+feet*12;
        double BMI =  703 * weight / Math.pow(numberinch,2);


        System.out.println("BMI is " +BMI+
                " Normal ");

    }
}