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
        System.out.println("SheiyvaneT temperatura da windspeed :");
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        double windspeed = scanner.nextDouble();
        double windchill = 0;

        if(-58<temperature&&temperature<41&&windspeed>=2){
            windchill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windspeed, 0.16) + 0.4275 * temperature * Math.pow(windspeed, 0.16);
            System.out.println(windchill);
        }
        else {
            System.out.println("indicating whether the temperature and/or wind speed is invalid");
        }
    }
}