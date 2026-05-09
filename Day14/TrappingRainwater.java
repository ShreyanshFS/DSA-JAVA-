public class TrappingRainwater {
    public static int tr(int h[]){
        int n=h.length;

        int lm[]=new int[n];
        lm[0] =h[0];
        for (int i =1;i<n;i++){
            lm[i]=Math.max(h[i],lm[i-1]);
        }

        int rm[]=new int[n];
        rm[n-1]=h[n-1];
        for (int i =n-2;i>=0;i--){
            rm[i]=Math.max(h[i],rm[i+1]);
        }

        int tw=0;
        for (int i =0;i<n;i++) {
            int wl=Math.min(lm[i],rm[i]);
            tw +=wl-h[i];
        }
        
        return tw;
    }
    public static void main(String args[]){
        int h[]={4,2,0,6,3,2,5};
        System.out.println(tr(h));
    }
}