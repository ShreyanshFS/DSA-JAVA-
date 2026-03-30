import java.util.Scanner;

public class LinearSearch {
    public static int ls(int array[],int k){
        for (int i =0;i<array.length;i++){
            if(array[i]==k){
                return i;
            }
        }

        return -1;
    }
    public static void main(String args[]){
        System.out.println("Enter the no. of sub,marks and the mun to be found :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        int in = ls(array, k);
        if (in == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index of That num is " + in );
        }
    }
}
