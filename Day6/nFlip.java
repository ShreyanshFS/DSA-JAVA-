import java.util.*;

public class nFlip {
    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Num");
        int n = sc.nextInt();

        while(n>0){
            int ld = n%10;
            System.out.print(ld+"");
            n /=10;
        }
    System.out.println();
    }
}