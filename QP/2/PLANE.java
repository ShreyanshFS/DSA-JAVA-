import java.util.Scanner;

public class PLANE{
    public static void main(String[] args) {
        System.out.println("Enter the value of x nd y");
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        if (x!=0&&y!=0){
            if (x>0){
                if (y>0){
                    System.out.println("Quadrant 1");
                }
                else{
                    System.out.println("Quadrant 4");
                }   
            }
            else{
                if (y>0){
                    System.out.println("Quadrant 2");
                }
                else{
                    System.out.println("Quadrant 3");
                } 
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}