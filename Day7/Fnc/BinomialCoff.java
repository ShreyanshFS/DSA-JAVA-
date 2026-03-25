import java.util.Scanner;

public class BinomialCoff {
    public static int fac(int n){
        int m=1;
        for(int i =1;i<=n;i++){
            m*=i;
        }
        return m;
    }
    public static int bc(int n,int r){
        int nf = fac(n);
        int rf = fac(r);
        int nr= fac(n-r);

        int bc= nf/(rf*nr);
        return bc;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n,r");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=sc.nextInt();
        int op =bc(n,r);
        System.out.println("Binomial Coefficient of " +n+" and "+r+" is "+op);
    }  
}
