
// Question 1: Practice set 1 Check in 'Notes' Section

import java.util.Scanner;

public class Java_0006_SumOf3Numbers_Q1_PS1{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();
        System.out.print("Enter number 3: ");
        int num3 = input.nextInt();

        System.out.println("The sum of 3 numbers is: "+(num1+num2+num3));

        input.close();
    }
}