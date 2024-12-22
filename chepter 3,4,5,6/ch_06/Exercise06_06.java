
public class Main {
    public static void main(String[] args) {
displayPattern(5);
    }

    public static void displayPattern(int n){
        for (int i = 1; i <=n; i++) {
            System.out.print(" ");
        }
        System.out.print(1);
        System.out.println();
        for (int i = 0; i <n-1; i++) {
            System.out.print(" ");
        }
        System.out.println(21);
        for (int i = 0; i <n-2; i++) {
            System.out.print(" ");
        }
        System.out.println(321);
        for (int i = 0; i <n-3; i++) {
            System.out.print(" ");
        }
        System.out.println(4321);
        for (int i = 0; i <n-4; i++) {
            System.out.print(" ");
        }
        System.out.println(54321);
    }
}