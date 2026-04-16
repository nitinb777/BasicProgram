package Pallindrome;

import java.util.Scanner;

public class String_pallindrome {

    public static void main(String[] args) {





        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter word ");
        String word = scanner.nextLine();
        String rev="";

        for(int i=word.length()-1; i>0;i--){

             rev= rev+word.charAt(i);
        }
        if(word==rev)
            System.out.println("Pallindrome");
            else
            System.out.println("not pallindrome");
    }
}
