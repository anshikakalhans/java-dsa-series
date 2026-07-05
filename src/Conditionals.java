import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {

        // if Statement
//        int dailyPractice = 12;
//
//        if (dailyPractice >= 10) {
//            System.out.println("Good Consistency !");

        // if-else Statement
//        int score = 100;
//
//        if (score >= 40) {
//            System.out.println("Pass");
//        } else {
//            System.out.println("Fail");

        // if-else-if ladder
//        int score = 90;
//
//        if (score >= 91) {
//            System.out.println("Outstanding!");
//
//        } else if (score >= 80) {
//            System.out.println("A+");
//
//        } else if (score >= 70) {
//            System.out.println("A");
//
//        } else {
//            System.out.println("Needs Improvement");

        // Nested if-else
//        boolean hasSubscription = true;
//        int solvedpProblems = 50;
//
//        if (hasSubscription) {
//            if (solvedpProblems >= 200) {
//                System.out.println("Well Done!");
//            } else {
//                System.out.println("Work on it");
//            }
//        } else {
//            System.out.println("blah blah blah");
//        }

        // Ternary Operator
//        int streakDays = 30;
//
//        String status = (streakDays >= 25) ? "Consistent" : "Irregular";
//        System.out.println(status);


        // switch statement

        System.out.println("Enter the number for day");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}


