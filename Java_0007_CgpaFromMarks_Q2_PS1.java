
// Qusetion 2: Practice set 1 Check in 'Notes' Section

import java.util.Scanner;

public class Java_0007_CgpaFromMarks_Q2_PS1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Subject 1 marks: ");
        float num1 = input.nextFloat();
        System.out.print("Enter Subject 2 marks: ");
        float num2 = input.nextFloat();
        System.out.print("Enter Subject 3 marks: ");
        float num3 = input.nextFloat();

        float cgpa = (num1 + num2 + num3)/30;
        System.out.println("Your CGPA is "+cgpa+" Out of 10.");

        input.close();
    }
}
