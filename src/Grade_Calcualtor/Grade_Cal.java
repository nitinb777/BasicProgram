package Grade_Calcualtor;

import java.util.Scanner;

public class Grade_Cal {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter marks ");

        int marks = scanner.nextInt();

        char grade;

        if(marks >=90 && marks<=100 ){
            grade='A';
        }else if(marks >=70 && marks<=90){
            grade='B';
        }else if (marks >=40 && marks<=70){
            grade= 'C';

        }else{
            grade='F';
        }
        System.out.println("grade "+grade);
    }
}
