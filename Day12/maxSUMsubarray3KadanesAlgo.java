import java.util.Scanner;

public class maxSUMsubarray3KadanesAlgo {
    public static void k(int array[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;

        for (int i=0;i<array.length;i++){
            cs+=array[i];
            if(cs<0)
                cs=0;
            ms=Math.max(cs,ms);
        }
        System.out.println(ms);
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
    k(array);
    }  
}
