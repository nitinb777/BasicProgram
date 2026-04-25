package Sorting_interger_oneside;

public class Binary_sort_integer {


    public static void main(String[] args) {


        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0};

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            while (arr[i] == 0 && i < j) {
                i++;
            }
            while (arr[j] == 1 && i < j) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        for (int num : arr) {
            System.out.print(num + "");
        }

    }
}
