package Star_Pattern;

import java.util.Scanner;

public class Left_angle {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");
        int num =scanner.nextInt();


        for(int i=num;i>0;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
