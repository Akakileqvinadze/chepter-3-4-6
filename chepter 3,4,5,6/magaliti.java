
// 1.დაწერეთ რეკურსიული ფუნქცია პირველი n ნატურალური რიცხვების ჯამის გამოსათვლელად.
ფორმულა: sum(n)=n+sum(n−1) და sum(0)=0

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cvladi = scanner.nextInt();
        System.out.println(sum(cvladi));
    }

    //sum(n)=n+sum(n−1) და sum(0)=0
    public static int sum(int n) {
        if (n==0){
            return 0;
        }
        return n+sum(n-1);
    }

}



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

// 3. გამოთვალეთ n-ე ფიბონაჩის რიცხვი რეკურსიულად.
ფორმულა: F(n)=F(n−1)+F(n−2). F(0)=0, F(1)=1.

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cvladi = scanner.nextInt();
        System.out.println(F(cvladi));
    }

   
    public static int F(int n) {
        if (n==0){
            return 0;
        } else if (n==1) {
            return 1;
        }
        return F(n-1)+F(n-2);
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

