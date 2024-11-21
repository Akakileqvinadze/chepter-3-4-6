
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a point with two coordinates: x  and  y:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x >= -2.5 && x <= 2.5 && y >= -5 && y <= 5) {
            System.out.println("Point " + x + " " + y + " is in the rectangle");
        } else {
            System.out.println("Point " + x + " " + y + " is not in the rectangle");
        }
    }
}




