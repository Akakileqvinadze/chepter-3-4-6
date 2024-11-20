import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one:");
        double one = scanner.nextDouble();
        System.out.println("Enter number two:");
        double two = scanner.nextDouble();
        System.out.println("Enter number thre:");
        double thre = scanner.nextDouble();
        double [] array = new double[3];
        array[0]=one;
        array[1]=two;
        array[2]=thre;
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}