import java.util.*;

public class ReverseArray {
    public static void rev(int array[]){
        int f =0, l=array.length-1;

        while(f<l){
            int t = array[l];
            array[l] = array [f];
            array[f] = t;

            f++;
            l--;
        }
    }
    public static void main(String args[]){

        System.out.println("Enter the no. of sub,marks and the mun to be found :");        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        rev(array);
        for (int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
