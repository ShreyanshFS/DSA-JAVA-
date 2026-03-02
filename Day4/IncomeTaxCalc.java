import java.util.Scanner;
public class IncomeTaxCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b;
        
        if (a<5){
            System.out.println("tax applied = 0%");
            b = 0;
        }
        else if ( a == 5 && a<10 ) {
            System.out.println("tax applied = 20% ");
            b = (float)(a * 0.2);
        }
        else {
            System.out.println("tax applied = 30 % ");
            b = (float)(a*.3);
        }
        System.out.print("Net tax is "+ b +" Lakh");
    }
}

