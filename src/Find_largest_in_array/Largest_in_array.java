package Find_largest_in_array;

public class Largest_in_array {

    public static void main(String[] args) {

        int[] arr = {3,5,234,3,2,3,1,1444};

        int max=arr[0];

        for(int i=1; i< arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];


            }
        }
        System.out.println("max"+ max);


    }
}
