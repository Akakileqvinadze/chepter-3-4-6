import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int yer = scanner.nextInt();
        System.out.println("Enter a month: ");
        String month = scanner.next();
        int mth = 0;
        switch (month) {
            case "Jen":
                mth = 0;
                break;
            case "Feb":
                mth = 1;
                break;
            case "Mar":
                mth = 2;
                break;
            case "Apr":
                mth = 3;
                break;
            case "May":
                mth = 4;
                break;
            case "Jun":
                mth = 5;
                break;
            case "Jul":
                mth = 6;
                break;
            case "Ogs":
                mth = 7;
                break;
            case "Sep":
                mth = 8;
                break;
            case "Oct":
                mth = 9;
                break;
            case "Nov":
                mth = 10;
                break;
            case "Dec":
                mth = 11;
                break;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, yer);
        calendar.set(Calendar.MONTH, mth);
        int day = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        Date theDate = calendar.getTime();
        System.out.println(month +"  "+ calendar.get(Calendar.YEAR)+" has " + day + " days");
        /*   :)     */

    }
}
