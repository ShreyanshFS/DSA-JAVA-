public class BuyndSellStock {
    public static int BnSstock(int cost[]){
        int bp =Integer.MAX_VALUE;
        int mpt=0;
         
        for (int i=0;i<cost.length;i++){
            if (bp<cost[i]){
                int p=cost[i]-bp;
                mpt=Math.max(mpt, p);
            } else{
                bp = cost[i];
            }
        }
        return mpt;
    }
    public static void main(String[] args){
        int cost[] = {7,1,5,3,6,4};
        System.out.println("Profit "+BnSstock(cost));
    }
}
