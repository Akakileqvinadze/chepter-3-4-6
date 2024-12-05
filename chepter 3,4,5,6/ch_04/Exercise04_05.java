import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        double s = scanner.nextDouble();
        System.out.print("Enter the side: ");
        double n = scanner.nextDouble();
        double Area = (n * Math.pow(s, 2)) / (4 * Math.tan(3.14 / 6));
        System.out.println("The area of the polygon is " + Area);


    }
}