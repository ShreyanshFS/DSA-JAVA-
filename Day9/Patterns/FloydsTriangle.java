import java.util.Scanner;

public class FloydsTriangle {
    public static void p(int n){
        int c=1;
        for (int i = 1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        p(n);
    }
}
