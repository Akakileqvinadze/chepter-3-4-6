
//  2. დაბეჭდეთ რიცხვები n-დან 1-მდე რეკურსიის გამოყენებით.

import java.io.*;


public class Main {
    public static void main(String[] args) {
        //0 5
        double n = 0;
        sum(n);
    }

    //sum(n)=n+sum(n−1) და sum(0)=0
    public static int sum(double n) {
        System.out.println(n);
        if (n==1.0999999999999999)
        {
            return 0;
        }
        sum(n+0.1);

        return 0;
    }
}



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



//  5. დაწერეთ რეკურსიული ფუნქცია, რათა შეამოწმოთ არის თუ არა სტრიქონი პალინდრომი.
import java.io.*;


public class Main {
    public static void main(String[] args)  {
        method(originalStr.length());
    }
    static String originalStr = "ABCDEFJHIH";
    public static void method(int n) {
        System.out.println(originalStr.charAt(n-1));
        if(originalStr.charAt(0)==originalStr.charAt(originalStr.length()-1)){
            System.out.println("სტრიქონი პოლინდრომია");
        }
        method(n-1);

    }
}


 6. დაწერეთ რეკურსიული ფუნქცია რიცხვის ციფრების ჯამის საპოვნელად.


     import java.io.*;


public class Main {
    public static void main(String[] args)  {
        int x=5;
        int y=10;
        method(x,y);
    }
    public static void method(int n,int z) {
        int pasuxi = n + z;
        System.out.println(pasuxi);
        method(n,z);

    }
}

