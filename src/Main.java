import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  Scanner scan = new Scanner(System.in);

        System.out.println("Enter number ");
        int num= scan.nextInt();
         scan.nextLine();
        System.out.println(" entered number is "+num);

        System.out.println("enter your name ");
        String name =scan.nextLine();
        System.out.println("entered name is "+name);

        scan.close();




    }
}