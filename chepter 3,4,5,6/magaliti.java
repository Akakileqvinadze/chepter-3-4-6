//  4. დაწერეთ რეკურსიული ფუნქცია სტრიქონის შესაბრუნებლად.

import java.io.*;


public class Main {
    public static void main(String[] args)  {
        method(originalStr.length());
    }
    static String originalStr = "ABCDEFJHIJ";
    public static void method(int n) {
        System.out.println(originalStr.charAt(n-1));
        method(n-1);
    }
}


