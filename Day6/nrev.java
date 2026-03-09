import java.util.*;

public class nrev {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int n = sc.nextInt();

        int r = 0;

        while(n>0){
            int ld = n%10;
            r= (r *10) + ld;
            n /=10;
        }
        System.out.println("Reverse of num is" + r);
    }
}
