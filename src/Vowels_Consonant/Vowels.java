package Vowels_Consonant;

import java.util.Scanner;

public class Vowels {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Enter the string ");
        String string= scanner.nextLine();

        string=string.toLowerCase();

        int v=0;
        int c=0;
        for(int i=0; i<string.length();i++){

            char s= string.charAt(i);
            if(s=='a' || s=='i' || s=='o' || s=='e'|| s=='u'){
               v++;
            } else if (s>='a' && s <='z') {
                c++;
            }

        }
        System.out.println("number of vowels " +v+ "consonant " +c);


    }
}
