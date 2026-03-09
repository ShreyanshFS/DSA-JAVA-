import java.util.Scanner;

public class sumOfNatNo {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("limit");
        int l =sc.nextInt();
        int s=0;
        int c = 1;
        while (c<=l){
            s += c;
            c++;
        }   
        System.out.println(s);
    }  
}
