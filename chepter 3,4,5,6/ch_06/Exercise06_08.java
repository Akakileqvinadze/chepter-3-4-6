import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Celsius          Fahrenhate      |        Fahrenhate          Celsius  ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("  40.0          "+farengate.celsiusToFahrenheit(40.0)+"                           120     "+farengate.fahrenheitToCelsius(120));
        System.out.println("  39.0          "+farengate.celsiusToFahrenheit(39.0)+"                           110     "+farengate.fahrenheitToCelsius(110));
        System.out.println("  32.0          "+farengate.celsiusToFahrenheit(32.0)+"                           40     "+farengate.fahrenheitToCelsius(40));
        System.out.println("  31.0          "+farengate.celsiusToFahrenheit(31.0)+"                           30     "+farengate.fahrenheitToCelsius(30));

    }

}

class farengate {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}