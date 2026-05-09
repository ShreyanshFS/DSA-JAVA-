public class shift {
    public static void main(String[] args) {
        
    }
    public static void shift (int k,int a[],int q[]){
    int n = a.length;

    for (int r = 0; r < k; r++) {
        int last = a[n - 1];

        
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = last; 
    }

    
    for (int i = 0; i < q.length; i++) {
        System.out.println(a[q[i]]);
    }
}
