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


//Consumer (სტრიქონის დაბეჭდვა დიდი ასოებით)


import java.util.function.Consumer;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Consumer<String> numbers = n -> System.out.println(n.toUpperCase());
        numbers.accept("akaki");
    }
}

//Function (აბრუნებს მოცემული სტრიქონის სიგრძეს)


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {

        Function<String,Integer> numbers = n -> n.length();
        System.out.println(numbers.apply("akaki"));

    }
}

//Functional Interface(შეასრულებს არითმეტიკული ოპერაციას)


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


public class Main {
    public static void main(String[] args) {
// Functional Interface
//(შეასრულებს არითმეტიკული ოპერაციას)
        methodoperation<Integer>number = (a, b) -> a+b;
        System.out.println(number.apply(5,5));
    }
}
@FunctionalInterface
interface methodoperation<T>{
    T apply(T a ,T b);
}









