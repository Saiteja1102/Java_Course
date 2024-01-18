
/*
Excerise 1: Write a program to calculate percentage of a given student in CBSE board exam. 
His marks from 5 subjects must be taken as input from the keyboard ?
*/


import java.util.Scanner;

public class Java_0005_BoardExamPercentageClaculator_Ex1 {
    public static void main(String[] arg) {
        System.out.println("Board Exam Percentage calculator...");
        System.out.println("");
        System.out.println("");
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your total marks per subject: ");
        int totalMarks = input.nextInt();

        System.out.print("Enter Subject 1 marks: ");
        float sub1 = input.nextFloat();
        System.out.print("Enter Subject 2 marks: ");
        float sub2 = input.nextFloat();
        System.out.print("Enter Suject 3 marks: ");
        float sub3 = input.nextFloat();
        System.out.print("Enter Suject 4 marks: ");
        float sub4 = input.nextFloat();
        System.out.print("Enter Suject 5 marks: ");
        float sub5 = input.nextFloat();

        float percentage = ((sub1 + sub2 + sub3 + sub4 + sub5)/(totalMarks*5)*100);
        System.out.println("Percentage: "+percentage+" %");

        input.close();
    }
}