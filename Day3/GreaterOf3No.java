import java.util.Scanner;

public class GreaterOf3No {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a>b && a>c){
            System.out.println("A is biggest");
        }
        else if(a>b && b>c){
            System.out.println(" B is biggest");
        }
        else{
            System.out.println("c is biggest");
        }
    }   
}
