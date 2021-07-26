public class secondHighestInteger {
    public static void main(String[] args) {
        int[] numbers ={1,6,2,4,5,2};
        /*for(int i=0;i<numbers.length-2;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                if(numbers[i]>numbers[j]){
                    int temp =numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }

            }
        }*/
        int firstHighest =numbers[0];
        int secondHighest =numbers[1];
        for(int i=2;i<=numbers.length-2;i++){
            if(firstHighest > numbers[i]  ){
                if(secondHighest> numbers[i]){

                }
                secondHighest = numbers[i];
                firstHighest =numbers[i+1];
            }
            else {
                secondHighest = numbers[i];
                firstHighest =numbers[i];
            }


        }
        System.out.println(numbers[numbers.length-2]);
    }
}
