package Two_Sum;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static void main(String[] args) {

        int arr[]={2,9,11,5};
        int target =7;


        int result[] = twosum(arr,target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result [1] + "]");
        } else {
            System.out.println("No solution found.");
        }

    }

    private static int[] twosum(int[] arr, int target) {

        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int complement =target-arr[i];

                if(map.containsKey(complement)){
                    return new int[]{
                            map.get(complement),  // index of complement
                            i                     // current index
                    };
                }

                map.put(arr[i],i);
            }
        return null;



    }
}
