package Find_Distinct_Char_from_string;

import java.util.HashMap;
import java.util.Map;

public class Find_Distict_char {

    public static void main(String[] args) {

        String original="aaabbbcchhh";

        Map<Character,Integer> map = new HashMap<>();

        for (int i =0 ; i<original.length();i++){
            char ch= original.charAt(i);

            if(map.containsKey(ch)){

                map.put(ch,map.get(ch)+1);

            }else {
                map.put(ch,1);

            }
        }

        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

    }
}
