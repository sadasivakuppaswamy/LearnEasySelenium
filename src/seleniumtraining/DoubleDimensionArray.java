package seleniumtraining;

public class DoubleDimensionArray {
    public static void main(String[] args) {
        int[][] a=new int[3][];
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        a[0]=new int[4];

        a[1]=new int[1];

        a[2]=new int[2];
        a[0][1]=10;
        a[0][0]=100;

        a[1][0] =20;

        a[2][1]=30;

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
        int[] b=new int[10];
        a[1]=b;//assigning array to another array,both type and dimension should be same but  size might not be same
        //a=b; - error
        if(b==a[1]){
            System.out.println("true");
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }


    }
}
