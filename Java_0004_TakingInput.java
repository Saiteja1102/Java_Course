
// Taking Input Methods

// 1) Import Scanner  --> import.java.util.Scanner
// 2) Make a new Scanner --> Scanner (NameOfScanner) = new Scanner(System.in)

import java.util.Scanner;

public class Java_0004_TakingInput {
    public static void main(String[] arg) {
        System.out.println("Taking input From the user...");

        // Making a new Scanner
        Scanner sai = new Scanner(System.in);

        // Taking input of integer numbers
        System.out.print("Enter integer number: ");
        int a = sai.nextInt();
        System.out.println(a);
        
        // Taking input of float poing numbers
        System.out.print("Enter float number: ");
        float f = sai.nextFloat();
        System.out.println(f);

        // Taking input of String
        System.out.print("Enter your name: ");
        String s = sai.next();
        System.out.println(s); // Spaces are not taken

        // Taking input of Short numbers
        System.out.print("Enter short number: ");
        short sh = sai.nextShort();
        System.out.println(sh);

        // Taking input of byte numbers
        System.out.print("Enter Byte number: ");
        byte b = sai.nextByte();
        System.out.println(b);

        // Taking input of long number
        System.out.print("Enter long Number: ");
        long l = sai.nextLong();
        System.out.println(l);

        // Taking input of double number
        System.out.print("Enter double Number: ");
        double d = sai.nextDouble();
        System.out.println(d);

        // Taking input of character
        /* 
        To read a char, we use next().charAt(0). next() function returns the next token/word in the input as a string and charAt(0) 
        function returns the first character in that string, the number 0 in the function in CharAt(NUMBER)  represents the index 
        of the single word of the string taken input, and set that index character to the char variable.
        */
        System.out.print("Enter character: ");
        // Format
        // (ScannerName).next().charAt(//Inder number of the character: )
        char c = sai.next().charAt(0); // 
        System.out.println(c);

        // Taking input of boolean
        System.out.print("Enter boolean: ");
        boolean bo = sai.nextBoolean();
        System.out.println(bo);

        sai.close();
    }
}
