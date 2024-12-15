import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheiyvanet ricxvebi :");
        int input = scanner.nextInt();
        System.out.println(reverse(input));
    }
    public static int reverse(int number)
    {
        String cvladi =Integer.toString(number);
        String reverce = new StringBuffer(cvladi).reverse().toString();
        return reverce;
    }

}