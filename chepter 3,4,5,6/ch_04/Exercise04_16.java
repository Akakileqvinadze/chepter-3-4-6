import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char letter = (char)(Math.random()*26+65);
        char pasuxi = Character.toUpperCase(letter);
        System.out.println(pasuxi);
    }
}