import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * p = a + b + c
         * arascori samkutxedi 11 6 4
         * */
        System.out.println("SheiyvaneT samkuTxedis 3 gverdi :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a+b>c&&b+c>a&&a+c>b){
            int p=a+b+c;
            System.out.println("samkutxedis perimetia "+p);
        }
        else{
            System.out.println("input is invalid");
        }
    }
}