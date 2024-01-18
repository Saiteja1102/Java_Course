
// Question 3: Practice set 1 Check in 'Notes' Section

import java.util.Scanner;

public class Java_0008_NameGreeting_Q3_PS1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = scan.next();

        System.out.println("Hello "+name+" have a good day.");
        
        scan.close();
    }
}
