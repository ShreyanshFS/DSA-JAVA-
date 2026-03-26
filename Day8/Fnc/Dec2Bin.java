import java.util.Scanner;

public class Dec2Bin {
    public static void con(int dn){
        int p =0;
        int bn =0;

        while (dn>0){
            int r = dn%2;
            bn = bn + (r*(int)Math.pow(10,p));

            p++;
            dn/=2;
        }

        System.out.println("binary of " + dn + " is " +bn);
    }

    public static void main(String[] args) {
        System.out.println("Enter the deciaml no");
        Scanner sc = new Scanner(System.in);
        int dn= sc.nextInt();
        con(dn);
    }
}
