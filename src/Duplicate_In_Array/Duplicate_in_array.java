package Duplicate_In_Array;

import javafx.scene.effect.SepiaTone;

import java.util.HashSet;
import java.util.Set;

public class Duplicate_in_array {

    public static void main(String[] args) {


        int[] arr ={33,54,14,34,14,34};

        Set<Integer> integerSet = new HashSet<>();

        for(int i =0 ; i<arr.length;i++){

            if(integerSet.contains(arr[i])){
                System.out.println("Duplicate "+ arr[i]);

            }else {
                integerSet.add(arr[i]);
            }
        }

    }
}
