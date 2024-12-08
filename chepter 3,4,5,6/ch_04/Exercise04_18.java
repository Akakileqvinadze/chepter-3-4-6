import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two characters:");
        String characterone = scanner.next();
        String arrayone = characterone;
        char[] one = arrayone.toCharArray();

        switch (one[0]) {
            case 'M':
                System.out.print("Mathematics");
                break;
            case 'C':
                System.out.print("Computer Science");
                break;
            case 'I':
                System.out.print("Information Technology");
                break;
            default:
                System.out.print("Invalid input");
        }
        if (one[0] != 'M' && one[0] != 'C' && one[0] != 'I') {
            one[1] = '0';
        }
        switch (one[1]) {
            case '1':
                System.out.print(" freshman");
                break;
            case '2':
                System.out.print(" sophomore");
                break;
            case '3':
                System.out.print(" junior");
                break;
            case '4':
                System.out.print(" senior");
                break;
            default:
                System.out.print("");
        }
    }
}

