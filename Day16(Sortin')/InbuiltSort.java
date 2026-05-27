import java.util.*;
public class InbuiltSort {
    public static void pa(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,11,2,3,40,99};
        Arrays.sort(arr);
        pa(arr);
    }
}
