import java.util.*;

public class BinarySearch {
    public static int bs(int array[],int k){
        int start =0,end = array.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(array[mid]==k)
                return mid;
            if (array[mid]<k)
                start= mid+1;
            else
                end = mid -1;
        }
        return -1;
    }
    public static void main(String args[]){

        System.out.println("Enter the no. of sub,marks and the mun to be found :");        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        int in = bs(array, k);
        if (in == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Index of That num is " + in );
        }
    }
}