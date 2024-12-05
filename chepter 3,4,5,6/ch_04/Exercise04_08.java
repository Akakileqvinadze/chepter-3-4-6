import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an ASCII code: ");
        int ASCI = scanner.nextInt();
        char pasuxi= (char)ASCI;
        System.out.println("The character for ASCII code " + ASCI+ " is "+pasuxi);
        }
    }
