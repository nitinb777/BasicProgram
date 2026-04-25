package Frequency_In_Array;

import java.util.HashMap;
import java.util.Map;

public class Frequency_in_array {

    public static void main(String[] args) {


        int[] arr={2,4,5,3,3,2};

        Map<Integer,Integer> map= new HashMap<>();


        for(int i=0; i<arr.length;i++){

            int num = arr[i];

            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);


            }else {
                map.put(num,1);
            }

        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }


    }
}
