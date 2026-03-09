
import java.util.Scanner;

public class dowhile {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Enter num");
            int n= sc.nextInt();
            if (n%10==0){
                break;
            }
            System.out.println(n);
        }while (true);
    }
}
