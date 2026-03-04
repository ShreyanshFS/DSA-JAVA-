import java.util.*;

public class result{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.");
        int n = sc.nextInt();
        String result = (n>32)?"pass":"fail"; 
        System.out.println(result);
    }
}