import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String first = scanner.next();
        System.out.print("Enter the second city: ");
        String second = scanner.next();
        System.out.print("Enter the third city: ");
        String third = scanner.next();

        String arr[]={first,second,third};
        Arrays.sort(arr);
        System.out.println("The three cities in alphabetical order are "+Arrays.toString(arr));
    }
}