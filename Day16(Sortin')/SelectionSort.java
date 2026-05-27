public class SelectionSort {
    public static void ss(int arr[]){
        for (int t=0;t<arr.length-1;t++){
            int min_pos=t;
            for (int i =t+1;i<arr.length;i++){
                if (arr[min_pos]<arr[i]){
                    min_pos=i;
                }
            }
            int temp = arr[min_pos];
            arr[min_pos]=arr[t];
            arr[t]=temp;
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
        ss(arr);
        pa(arr);
    }   
}