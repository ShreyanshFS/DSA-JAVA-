

public class q1 {
    public static boolean no(int n){
        boolean s= true;
        if (n%2!=0){
            s= false;
        }
        return s;
    }   
    public static void main(String[] args) {
        int n = 53;
        if (no(n)==true){
            System.out.println("Odd no");
        }
        else{
            System.out.println("Even no.");
        }
    }
}
