import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheiyvanet erti rixcxvi :");
        int input = scanner.nextInt();
        System.out.println("sheiyvanet meore ricxvi :");
        int inputone = scanner.nextInt();
        System.out.println("sheiyvanet mesame ricxvi :");
        int inputtwo = scanner.nextInt();
        displaySortedNumbers(input, inputone, inputtwo);

    }

    public static void displaySortedNumbers(
            double num1, double num2, double num3) {
        double[] array = new double[3];
        array[0] = num1;
        array[1] = num2;
        array[2] = num3;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}