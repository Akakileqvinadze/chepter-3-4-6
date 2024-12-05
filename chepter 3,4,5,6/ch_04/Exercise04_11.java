import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15): ");
        int ASCI = scanner.nextInt();

        if (ASCI>=0&&ASCI<=15){
            String hexString = Integer.toHexString(ASCI);
            System.out.println("The character for ASCII code " + ASCI+ " is "+hexString);
        }
        else {
            System.out.println(ASCI+" is an invalid input");
        }

        }
    }
