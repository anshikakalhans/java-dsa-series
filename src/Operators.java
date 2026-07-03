// Arithmetic Operators

//public class Operators {
//    public static void main(String[] args) {
//
//        int solvedThisWeek = 25;
//        int solvedLastWeek = 15;
//
//        int total = solvedThisWeek + solvedLastWeek;
//        int difference = solvedThisWeek - solvedLastWeek;
//        int projected = solvedThisWeek * 4;
//        int average = solvedThisWeek / 7;
//        int remainder = solvedThisWeek % 7;
//
//        System.out.println(total);
//        System.out.println(difference);
//        System.out.println(projected);
//        System.out.println(average);
//        System.out.println(remainder);
//    }
//}


// Relational Operators

//public class Operators {
//    public static void main(String[] args) {
//        int currentStreak = 45;
//        int targetStreak = 50;
//
//                System.out.println(currentStreak == targetStreak);
//                System.out.println(currentStreak != targetStreak);
//                System.out.println(currentStreak > targetStreak);
//                System.out.println(currentStreak < targetStreak);
//                System.out.println(currentStreak >= targetStreak);
//                System.out.println(currentStreak <= targetStreak);
//
//
//    }
//}


// Logical Operators

//public class Operators {
//    public static void main(String[] args) {
//        boolean completedDSA = true;
//        boolean completedCore = false;
//
//        System.out.println(completedDSA && completedCore);
//        System.out.println(completedDSA || completedCore);
//        System.out.println(!completedCore);
//    }
//}


// Assignment Operators

//public class Operators {
//    public static void main() {
//        int ratingPoints = 100;
//
//        ratingPoints += 20;  // ratingPoints = ratingPoints + 20
//        System.out.println(ratingPoints);
//        ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
//        System.out.println(ratingPoints);
//        ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
//        System.out.println(ratingPoints);
//        ratingPoints /= 4;   // ratingPoints = ratingPoints /
//        System.out.println(ratingPoints);
//        ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
//        System.out.println(ratingPoints);
//    }
//}


// Unary Operators

public class Operators {
    public static void main() {
        int activeUsers = 100;

        int prefix = ++activeUsers;
        int postfix = activeUsers++;

        System.out.println(prefix);
        System.out.println(postfix);
        System.out.println(activeUsers);
    }
}