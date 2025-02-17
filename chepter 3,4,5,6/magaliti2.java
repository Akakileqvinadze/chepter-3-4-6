// 1) შექმენით შემდგომი ლამბდა გამოსახულებები:Predicate (ამოწმებს არის თუ არა რიცხვი ლუწი)


import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
      

        Predicate<Integer>numbers = n ->{
            if(n%2==0){
                System.out.println("ლუწია");
            }
            else {
                System.out.println("კენტია");
            }

            return false;
        };
        numbers.test(4);
    }
}
