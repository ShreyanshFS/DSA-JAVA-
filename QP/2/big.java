
import java.util.Scanner;

public class big {
    public static void main(String[] args) {
        System.out.println("Enter the value of x & y");
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = (x>y)?x:y;
        System.out.println(r);
    }
}
