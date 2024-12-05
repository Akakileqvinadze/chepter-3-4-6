import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\"Enter the length from the center to a vertex: ");
        double r = scanner.nextDouble();
        final double p = 3.14;
        double s = 2*r*Math.sin(p/5);
        double Area = (5*Math.pow(s,2))/(4* Math.tan(p/5));
        System.out.println("The area of the pentagon is " + Area);
    }
}