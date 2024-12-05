import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a decimal value (0 to 15): ");
            int hex = Integer.parseInt(scanner.nextLine(), 16);
            String binary = Integer.toBinaryString(hex);
            System.out.println(binary);

        }
        catch (NumberFormatException e){
            System.out.println("G is an invalid input");
        }
    }
}
