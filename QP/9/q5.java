public class q5 {
    public static void main(String[] args) {
        int n=5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=(n-i);j++){
                System.err.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            for (int j=i-1;j>0;j--){
                System.err.print(j);
            }
            System.out.println();
        }
    }
}
