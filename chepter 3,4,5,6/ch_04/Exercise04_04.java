import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = scanner.nextDouble();
        double Area = (6 * Math.pow(s, 2)) / (4 * Math.tan(3.14 / 6));
        System.out.print("The area of the hexagon is: " + Area);
    }
}