import java.util.*;

public class WeekendOrday {
    public static void main(String[] args){
        System.out.println("Enter the day name");
        Scanner sc = new Scanner(System.in);
        String day= sc.next();
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thrusday":
            case "Friday":
                System.out.println("WeekDay");
                break;
            case "Saturday":
            case "Sunday":
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}