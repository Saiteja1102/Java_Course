import java.util.Scanner;

public class Java_0010_CheckingInteger_Q5_PS1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Checking wheater it is a number or not....");

        // Method 1
        System.out.print("Enter the number: ");
        boolean sc = scan.hasNextInt();
        System.out.println(sc);

        // Method 2
        // System.out.println(scan.hasNextInt());
        scan.close();
    }
}
