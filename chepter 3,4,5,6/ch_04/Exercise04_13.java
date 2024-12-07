import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("vowel");
        } else {
            for (char i = 'a'; i <= 'z'; i++) {
                if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u')
                    continue;
                if (c == i) {
                    System.out.println("consonant");
                    break;
                } else {
                    System.out.println(c + " is an invalid input");
                    break;
                }

            }


        }

    }
}