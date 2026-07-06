//Build a program:
//
//Input: number of problems solved
//Output:
//        ≥ 300 → Advanced
//        ≥ 150 → Intermediate
//        else → Beginner


import java.util.Scanner;

public class Practice_05 {
    public static void main(String[] args) {

        System.out.println("Enter no. of problems solved: ");

        Scanner sc = new Scanner(System.in);
        int problemsSolved = sc.nextInt();

        if (problemsSolved >= 300) {
            System.out.println("Advanced");
        } else if (problemsSolved >= 150) {
            System.out.println("Intermediate");
        } else {
            System.out.println("Beginner");
        }

    }
}
