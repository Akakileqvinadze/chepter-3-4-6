import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String:");
        String charracter = scanner.next();
        char[] arrayone = new char[charracter.length()];
        for (int i = 0; i < charracter.length(); i++) {
            arrayone[i] = charracter.charAt(i);
        }
        String origin = "232-23-5435";
        char[] charor = new char[origin.length()];
        for (int i = 0; i < origin.length(); i++) {
            charor[i] = origin.charAt(i);
        }

        if (Arrays.equals(arrayone,charor)) {
            System.out.println(charracter + " is a valid social security number");
        }
        else
            System.out.println( charracter+" is an invalid social security number");


    }
}