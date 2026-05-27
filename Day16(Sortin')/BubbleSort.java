public class BubbleSort {
    public static void bs(int arr[]){
        for (int t=0;t<arr.length-1;t++){
            for (int j=0;j<arr.length-1-t;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
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
        int arr[]={5,11,2,3,40,99};
        bs(arr);
        pa(arr);
    }
}
