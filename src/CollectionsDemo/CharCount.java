package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s1="SadasivaSrinath";
        Map<Character,Integer> map= new HashMap<>();

        for(int i=0;i<s1.length();++i){
            if(map.containsKey(s1.charAt(i))){
                map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
            }
            else{
                map.put(s1.charAt(i),1);
            }

        }
        System.out.println(map);
    }
}
