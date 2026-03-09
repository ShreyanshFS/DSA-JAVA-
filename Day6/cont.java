

import java.util.Scanner;

public class cont {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        do { 
            System.out.println("Enter the num");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        } while (true);
    }
    
}
