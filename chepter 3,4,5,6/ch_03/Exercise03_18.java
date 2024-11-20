import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("weight");
        double c;
        int w = scanner.nextInt();
        if (w>50){
            System.out.println("the package cannot be shipped.");
        }

        if (0 < w&&w<= 1) {
            System.out.println(c = 3.5);
        } else if (1 < w&&w <= 3) {
            System.out.println(c = 5.5);
        } else if (3 < w&&w<= 10) {
            System.out.println(c = 8.5);
        } else if (10 < w&&w <= 20) {
            System.out.println(c = 10.5);
        }


    }
}