import java.util.Scanner;

public class maxSUMsubarray {
        public static void sMs(int array[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;

        for (int i = 0;i<array.length;i++){
            int s = i;
            for(int j=i;j<array.length;j++){
                int e=j;
                cs = 0;
                for (int k=s;k<=e;k++){
                    cs+=array[k];
                }
                System.out.println(cs);
                if (ms<cs){
                    ms = cs;
                }
            }
        }
        
        System.out.println("Max sum=" + ms);
    }
    public static void main(String args[]){

        System.out.println("Enter the no. of sub,marks and the mun to be found :");        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int array[]= new int[s];
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        sc.close();
        sMs(array);
    }
}
