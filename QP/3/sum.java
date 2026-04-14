import java.util.*;

public class sum {
    public static void main(String[] args){
        System.out.println("Enter the size of Array");
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println("Enter the elements");
        int a[] = new int[n];
        
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int os=0, es=0;

        for (int i=0; i<n; i++){
            if (a[i]%2==0)
                es += a[i];
            else
                os += a[i];
        }
        
        System.out.println("Sum of Odd numbers: " + os);
        System.out.println("Sum of Even numbers: " + es);
    }    
}
