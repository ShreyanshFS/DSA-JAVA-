import java.util.*;

public class primeNo {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int n= sc.nextInt();
        
        if (n ==1 ){
            System.out.println("1 is neither Prime nor Composite");
        }

        boolean isp= true;

        for (int i=2;i<=n-1;i++){
            if(n%i==0){
                isp = false;
            }
        }

        if (isp == true){
            System.out.println("prime");
        } else{
            System.out.println("not prime");
        }
        
    }    
}
