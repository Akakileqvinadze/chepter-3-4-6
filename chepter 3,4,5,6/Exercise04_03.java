import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheiyvanet ricxvebi :");
        int input = scanner.nextInt();
        System.out.println(reverse(input));
        System.out.println(isPalindrome(input));
    }

    public static int reverse(int number) {
        String cvladi = Integer.toString(number);
        String reverce = new StringBuffer(cvladi).reverse().toString();
        int pasuxi = Integer.parseInt(reverce);
        return pasuxi;
    }

    public static boolean isPalindrome(int number) {
        String cvladi = Integer.toString(number);
        String reverce = new StringBuffer(cvladi).reverse().toString();
        boolean bool = false;
        if (reverce.charAt(0) == reverce.charAt(reverce.length() - 1)) {
            bool=true;
        }
        return bool;
    }
}
