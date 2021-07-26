import java.util.Arrays;
import java.util.Collections;

public class SecondHighest {
    public static void main(String[] args) {
        Integer[] a={10,20,15,10,20,74,79};
       // int[] b=a;
        //int[] c=a.clone();
        Arrays.sort(a,Collections.reverseOrder());
        int first,second;
        first=second=a[0];
        if(a.length<2)
            return;
        for(int j=1;j<a.length;j++){
            if(first<a[j]){
                second=first;
                first=a[j];

            }
            if(second<a[j] && a[j]!=first){
                second=a[j];
            }
        }
        System.out.println("first:"+first);
        System.out.println("Second:"+second);

    }
}
