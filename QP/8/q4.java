public class q4 {
    public static void main(String[] args) {
        int n=4;int m=5;
        for (int i=n;i>0;i--){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print('*');
            }   
            System.out.println();
        }
    }
}
