//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //polindromi
        boolean bol = method("aka");
        System.out.println(bol);

    }

    public static boolean method(String word) {
        boolean bol = false;
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        if(first==last){
            bol=true;
        }
        return bol;

    }
}
