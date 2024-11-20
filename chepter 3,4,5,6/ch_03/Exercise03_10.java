import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number= random.nextInt(0,100);
        int numbertwo= random.nextInt(0,100);
        System.out.println("two integer "+number+" and "+numbertwo);
    }
}