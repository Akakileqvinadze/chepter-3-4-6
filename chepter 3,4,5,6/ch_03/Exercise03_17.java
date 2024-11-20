import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sheyvanet  cifri 1 _ Qva , cifri 2 _ makrateli, cifri 3 _ bade:");
        int chemisheyvanili = scanner.nextInt();
        Random rann = new Random();
        int kompiuterirandom = rann.nextInt(1, 4);
//----------------------------------------------------------------------
        if (kompiuterirandom == 1 && chemisheyvanili == 1) {
            System.out.println("The computer is Qva. You have Qva too. It is a draw");
        } else if (kompiuterirandom == 2 && chemisheyvanili == 2) {
            System.out.println("The computer is makrateli. You have makrateli too. It is a draw");
        } else if (kompiuterirandom == 3 && chemisheyvanili == 3) {
            System.out.println("The computer is bade. You have bade too. It is a draw");
        }
//-------------------------------------------------------------------
        else if (kompiuterirandom == 1 && chemisheyvanili == 2) {
            System.out.println("The computer is Qva. You have makrateli . you loos");
        } else if (kompiuterirandom == 1 && chemisheyvanili == 3) {
            System.out.println("The computer is Qva. You are bade. You won");
        }
//-------------------------------------------------------------------
        else if (kompiuterirandom == 2 && chemisheyvanili == 1) {
            System.out.println("The computer is makrateli. You are Qva . you won");
        } else if (kompiuterirandom == 2 && chemisheyvanili == 3) {
            System.out.println("The computer is makrateli. You have bade . you loos");
        }
//-------------------------------------------------------------------
        else if (kompiuterirandom == 3 && chemisheyvanili == 1) {
            System.out.println("The computer is bade. You have Qva . you loos");
        } else if (kompiuterirandom == 3 && chemisheyvanili == 2) {
            System.out.println("The computer is bade. You have makrateli . you win");
        }

    }
}