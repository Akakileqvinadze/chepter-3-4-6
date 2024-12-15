import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(getPentagonalNumber(counter));
                System.out.print(" ");
                counter++;
            }
            System.out.println();
        }
    }
public static int getPentagonalNumber(int n) {
    int number = n * (3 * n - 1) / 2;
    return number;
}
    }


