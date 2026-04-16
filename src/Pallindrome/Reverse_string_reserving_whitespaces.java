package Pallindrome;

import java.util.Scanner;

public class Reverse_string_reserving_whitespaces {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter string  with spaces");
        String string =scanner.nextLine();

        char [] word= string.toCharArray();

        int left=0;
        int right=word.length-1;

        while(left<right)
        {
            if (word[left]==' ')
            {
                left++;
            } else if (word[right]==' ') {
                right--;
            }else {
                char temp=word[left];
                word[left]=word[right];
                word[right]=temp;
                left++;
                right--;
            }

        }
        System.out.println("reverse string "+new String(word));
    }
}
