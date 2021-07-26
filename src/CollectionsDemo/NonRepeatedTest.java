package CollectionsDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NonRepeatedTest {
    public static void main(String[] args) {
        int[] numbers=new int[]{10,20,30,20,10,30,40,10};

        /*//First repeated
        Set<Integer> set =new HashSet<Integer>();

        for(int i=0;i<numbers.length;i++){
            if(!set.add(numbers[i])){
                System.out.println(numbers[i]);
                break;
            }
        }//First repeated
        */
        //Count of Each Element
        /*Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i])){
                map.put(numbers[i],map.get(numbers[i])+1);
            }
            else
                map.put(numbers[i],1);
        }
        System.out.println(map);*/

        Map<Integer,Integer> map1=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(map1.containsKey(numbers[i])){
                map1.put(numbers[i],map1.get(numbers[i])+1);
            }
            else
                map1.put(numbers[i],1);
        }
        System.out.println(map1);


    }
}
