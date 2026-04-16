package Pallindrome;

import java.util.Scanner;

public class Number_pallindorme {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

        System.out.println("ENter numberr ");
       int num = scanner.nextInt();

       int rev=0;
       while(num>0){

           int temp =num%10;
           rev=rev*10+temp;
           num=num/10;
       }

        System.out.println(" "+rev);



        
    }
}
