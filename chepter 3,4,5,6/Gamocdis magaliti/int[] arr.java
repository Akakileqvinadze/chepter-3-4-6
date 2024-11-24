import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        method(new int[]{5, 7, 1, 6, 8, 7, 4});
    }

    public static void method(int[] arr) {
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
