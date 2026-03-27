import java.util.Scanner;

public class invHalfpyrWnum {
    public static void p(int n){
        for (int i=1;i<=n;i++){
            for (int j = 1; j<=n-i+1;j++){
                System.out.print(j+" ");
            } 
            System.out.println();
        }
    }

    public static void main(String[] args){
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        p(n);
    }
}
