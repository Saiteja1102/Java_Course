
// Question 4: Practice set 1 Check in 'Notes' Section

import java.util.Scanner;

public class Java_0009_KilometersToMiles_Q4_PS1 {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kilometers to miles Calculator!!");

        System.out.print("Enter the kilometers: ");
        double km = scan.nextInt();

        double miles = (km * 0.621371);

        System.out.println("Miles: "+miles);

        scan.close();
    }
}
