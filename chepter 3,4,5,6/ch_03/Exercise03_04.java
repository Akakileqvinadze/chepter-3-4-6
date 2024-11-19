import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1,12);
        switch (number){
            case 1:
                System.out.println("ianvari");
                break;
            case 2:
                System.out.println("tebervali");
                break;
            case 3:
                System.out.println("marti");
                break;
            case 4:
                System.out.println("aprili");
                break;
            case 5:
                System.out.println("maisi");
                break;
            case 6:
                System.out.println("ivnisi");
                break;
            case 7:
                System.out.println("ivlisi");
                break;
            case 8:
                System.out.println("agvisto");
                break;
            case 9:
                System.out.println("seqtemberi");
                break;
            case 10:
                System.out.println("oqtomberi");
                break;
            case 11:
                System.out.println("noemberi");
                break;
            case 12:
                System.out.println("dekemberi");
                break;
        }


    }
}