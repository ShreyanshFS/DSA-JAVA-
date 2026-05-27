
public class InsertionSort {
    public static void is(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int c=arr[i];
            int p=i-1;
            while (p>=0 && arr[p]>c){
                arr[p+1]= arr[p];
                p--;
            }
            arr[p+1]=c;
        }
    }
    public static void pa(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,11,2,3,40,99};
        is(arr);
        pa(arr);
    }
}
