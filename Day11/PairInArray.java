import java.util.Scanner;

public class PairInArray {
    public static void p(int array[]){
        int tp =0;
        for (int i = 0;i<array.length;i++){
            int c = array[i];
            for (int j = i+1;j<array.length;j++){
                System.out.print("("+c+","+array[j]+")");
                tp++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the no. of sub,marks and the mun to be found :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        p(array);
    }
}
