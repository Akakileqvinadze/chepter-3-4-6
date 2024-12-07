import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = scanner.next().charAt(0);
        if (input == 'a' || input == 'A' || input == 'b' || input == 'B' || input == 'c' || input == 'C') {
            System.out.println("2");
        } else if (input == 'd' || input == 'D' || input == 'e' || input == 'E' || input == 'f' || input == 'F') {
            System.out.println("3");
        } else if (input == 'g' || input == 'G' || input == 'h' || input == 'H' || input == 'i' || input == 'I') {
            System.out.println("4");
        } else if (input == 'j' || input == 'J' || input == 'k' || input == 'K' || input == 'l' || input == 'L') {
            System.out.println("5");
        } else if (input == 'm' || input == 'M' || input == 'n' || input == 'N' || input == 'o' || input == 'O') {
            System.out.println("6");
        } else if (input == 'p' || input == 'P' || input == 'q' || input == 'Q' || input == 'r' || input == 'R' || input == 's' || input == 'S') {
            System.out.println("7");
        } else if (input == 't' || input == 'T' || input == 'u' || input == 'U' || input == 'v' || input == 'V') {
            System.out.println("8");
        } else if (input == 'w' || input == 'W' || input == 'x' || input == 'X' || input == 'y' || input == 'Y' || input == 'z' || input == 'Z') {
            System.out.println("9");
        } else {
            System.out.println(input + " is an invalid input");
        }

    }
}