import java.util.Scanner;

public class HollowRhombus {
    public static void p(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n;j++){
                if(i==1|| i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(' ');
                }
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
