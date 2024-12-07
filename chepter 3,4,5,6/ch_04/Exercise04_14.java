import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        switch (c)
        {
            case 'A':
                System.out.println("4");
                break;
            case 'B':
                System.out.println("3");
                break;
            case 'C':
                System.out.println("2");
                break;
            case 'D':
                System.out.println("1");
                break;
            case 'E':
                System.out.println("0");
                break;
            default:
                System.out.println(c+ " is an invalid grade");
        }

    }
}