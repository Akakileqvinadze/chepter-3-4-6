import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt()+100;
        int y = rand.nextInt()+200;
        System.out.println("x koordinatia "+x);
        System.out.println("y koordinatia  "+y);

    }
}
