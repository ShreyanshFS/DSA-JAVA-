import java.util.*;

public class prime {
    public static void main(String[] args) {
        System.out.println("Enter the num");
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1)
            System.out.println("Nor Prime Neither Composite");
        boolean p=true;

        for (int i=0;i<n;i++){
            if(n%i==0)
                p =false;
        }

        if(p==true){
            System.out.println("Prime");
        }
        else
            System.out.println("Composite");
    }
}
