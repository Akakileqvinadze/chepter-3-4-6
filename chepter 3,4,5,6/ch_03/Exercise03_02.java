import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double r1 = a + b + c;

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("The equation has two roots" + r1);
        } else {
            System.out.println("sheyvanili ricxvi naklebia nulze");
        }

    }
}