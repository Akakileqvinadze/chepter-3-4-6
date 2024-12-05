import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ASCI = scanner.next(".").charAt(0);
        System.out.println("The Unicode for the character " + ASCI + " is " );
        int pasuxi = ASCI;
        System.out.println(pasuxi);
        }
    }
