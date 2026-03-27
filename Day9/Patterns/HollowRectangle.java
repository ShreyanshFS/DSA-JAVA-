import java.util.Scanner;

public class HollowRectangle {

    public static void hr(int trow, int tcol){
        for (int i =1;i<=trow;i++) {
            for(int j = 1;j<=tcol;j++){
                if (i==1||i==trow||j==1||j==tcol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        System.out.println("Enter no. of rows nd coloum");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        hr(r,c);
    } 
}
