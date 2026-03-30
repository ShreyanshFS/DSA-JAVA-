import java.util.*;

public class Largestnum {
    public static int ln(int array[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0;i<array.length;i++){
            if (largest <array[i]){
                largest = array[i];
            }
            if (smallest >array[i]){
                smallest = array[i];
            }
        }
        ;System.out.println("smallest num : "+ smallest);
        return largest;
    }
        public static void main(String args[]){
        System.out.println("Enter the no. of sub and marks :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        System.out.println("Largest num : "+ln(array));        
    }
}
