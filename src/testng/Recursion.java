package testng;

public class Recursion {
    static boolean isFound;
    static void sum(int[] array, int i, int currentSum, int target, String subsetElements,boolean isSusetFound)
    {

        for(int j = i+1; j<array.length; j++){
            if(currentSum+array[j] == target){
                isFound = true;
                isSusetFound = isFound;
                System.out.println(subsetElements+" "+String.valueOf(array[j]));
            }else{

                if(currentSum+array[j] < target)
                    sum(array, j, currentSum+array[j], target, subsetElements+" "+String.valueOf(array[j]),isSusetFound);
            }
        }

    }

    public static void main(String[] args)
    {
        int[] numbersSet = {6,3,8,10,1,2};
        //boolean isSubsetFound = false;
        for(int i =0; i<numbersSet.length; i++){
            sum(numbersSet, i, numbersSet[i], 3, String.valueOf(numbersSet[i]),isFound);
        }
        if(!isFound)
            System.out.println("No subset Found");

    }
}
