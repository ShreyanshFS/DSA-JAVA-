import java.util.Scanner;

public class FactorialOfN {
    public static int fac(int n){
        int m = 1;
        for(int i=1;i<=n;i++){
            m = m*i;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int f = fac(n);
        System.out.println("The Factorial of " + n+" is "+f);
    }
}
