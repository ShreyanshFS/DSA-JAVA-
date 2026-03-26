import java.util.*;

public class PrimeInRange {

    public static void primeinR (int s, int e){
        for (int i = s;i <=e;i++){
            int count = 0;
            for (int j = 2;j <=Math.sqrt(i);j++){
                if (i%j == 0){
                    count++;
                    break;
                }
            }
            if (count == 0 && i > 1){
                System.out.println(i);
            }
        }
    }

    public static void main(String arg[]){
        System.out.println("Enter the upper bound nd the lower bound of the range ");
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt();
        int s = sc.nextInt();
        primeinR(s, e);
    }
}
