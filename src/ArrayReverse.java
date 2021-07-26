public class ArrayReverse {
    public static void main(String[] args) {
        int[] a=new int[]{10,20,30,40,50};
        for(int i=0;i<= a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;


        }
        for(int j=0;j<a.length;j++){
            System.out.println(a[j]);
        }
    }
}
