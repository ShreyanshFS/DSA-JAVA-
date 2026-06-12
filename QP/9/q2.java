
public class q2 {
    public static boolean p(int n){
        boolean b= true;
        int og =n;
        int ld,rev=0;
        while (n>0){
            ld=n%10;
            n/=10;
            rev=(rev*10)+ld;
        }
        if (rev!=og){
            b = false;
        }
        return b;
    }    
    public static void main(String[] args) {
        int n=0;
        System.out.println(p(n));
    }
}
