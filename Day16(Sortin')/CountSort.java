public class CountSort {
    public static void cs(int arr[]){
        int l= Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            l=Math.max(l,arr[i]);
        }
        int c[]= new int[l+1];
        for (int i=0;i<arr.length;i++){
            c[arr[i]]++;
        }
        int j=0;
        for (int i=0; i<c.length;i++){
            while(c[i]>0){
                arr[j]=i;
                j++;
                c[i]--;
            }
        }
    }
    public static void pa(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={1,2,1,4,5,6,4,2};
        cs(arr);
        pa(arr);
    }
}
