package Fizzbuzz;

import java.util.Scanner;

public class Fizbuzz {

    public static void main(String[] args) {

        
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter number");
        scanner.nextInt();
        
        for (int i=1 ;i<=100;i++){
            
            if(i%3==0 && i%5==0)
            {
                System.out.println("FIZZBuZZ");
            } else if (i%3==0) {
                System.out.println("Fizz");
                
            }else if (i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
        
    }
}
