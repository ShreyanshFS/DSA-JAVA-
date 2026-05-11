public class FreqInArray {
    public static boolean  freq(int a[]){
        boolean o= false;
        for (int i =0;i<a.length;i++){
            for (int j=(i+1);j<a.length;j++){
                if (a[i]==a[j]){
                    o = true;
                    break;
                }
            }
        }
        return o;
    }
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(freq(a));
    }
}
