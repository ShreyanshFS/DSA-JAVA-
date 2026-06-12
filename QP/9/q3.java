
public class q3 {
    public static int sum(int n){
        int s=0,ld;
        while (n>0){
            ld=n%10;
            s+=ld;
            n/=10;
        }
        return s;
    }    
    public static void main(String[] args) {
        int n=285;
        System.out.println(sum(n));
    }
}
