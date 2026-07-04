/*Build a simple program that:

Takes username
Takes number of problems solved
Calculates weekly target
Prints formatted summary using printf()
*/


import java.util.Scanner;

public class Practice_03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Username
        System.out.println("Enter your name: ");
        String username = sc.nextLine();

        // Total Problems Solved
        System.out.println("Enter no. of problems solved: ");
        int problemsSolved = sc.nextInt();

        // Calculating Weekly target
        int weeklyTarget = 100;
        int remainingTarget = weeklyTarget - problemsSolved;
        System.out.println("Remaining target is: " + remainingTarget);

        // Print Formatted Summary
        System.out.printf("\n===== Summary =====\n");
        System.out.printf("Name: %s%n", username);
        System.out.printf("Problems Solved: %d%n", problemsSolved);
        System.out.printf("Weekly Target: %d%n", weeklyTarget);
        System.out.printf("Problems Remaining: %d%n", remainingTarget);


        sc.close();


    }
}
