import java.util.Scanner;

public class factorial {
    public static int fac(int n){
        int m =1;
        for (int i =1;i=<n;i++){
            m*=i;
        }
        return m;
    }
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The fac of " + n + "is" + fac(n));
    }
}
