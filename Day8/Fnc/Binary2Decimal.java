import java.util.*;

public class Binary2Decimal {
    public static void bin2dec(int n){
        int p = 0;
        int dn=0;
        while(n>0){
            int ld = n%10;
            dn = dn + (ld * (int)Math.pow(2,p));
            p++;
            n/=10;
        }
        System.out.println("decimal of " + n + " is " +dn);
    }

    public static void main(String[] args) {
        System.out.println("Enter Binary no=");
        Scanner sc= new Scanner(System.in);
        int bn = sc.nextInt();
        bin2dec(bn);
    }
}
