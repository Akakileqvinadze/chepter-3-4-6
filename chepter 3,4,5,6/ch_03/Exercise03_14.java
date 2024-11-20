import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheyvanet 1 an 2");
        int ariol = scanner.nextInt();
        Random rann=new Random();
        int number = rann.nextInt(1,3);


        if(ariol==number){
            System.out.print("tqven gamoicanit ariolia");
        }
        else{
            System.out.print("tqven ver gamoicanit reshkaa");
        }
    }
}