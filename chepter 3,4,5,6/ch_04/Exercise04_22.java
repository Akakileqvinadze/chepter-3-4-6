import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String C1 = scanner.next();
        System.out.print("Enter string s2:");
        String C2 = scanner.next();
        boolean result = C1.contains(C2);
        if(result){
            System.out.println(C2+" is a substring of "+ C1);
        }
        else System.out.println(C2+" is not a substring of "+C1);





    }
}