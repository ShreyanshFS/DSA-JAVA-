import java.util.Scanner;

public class ToMultiply {
    public static int multiply(int a, int b){
        int p=a*b;
        return p;
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of a & b");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int prod = multiply(a, b);
        System.out.println("a*b="+prod);
    }
}
