import java.util.Scanner;

public class Subarray {
    public static void subarray(int array[]){
        int ts =0;
        for (int i = 0;i<array.length;i++){
            int s = i;
            for(int j=i;j<array.length;j++){
                int e=j;
                for (int k=s;k<=e;k++){
                    System.out.print(array[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            System.out.println(ts);
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
        subarray(array);

    }
}
