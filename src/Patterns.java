// 1. Solid Square Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> n columns
//            for (int col = 1; col <= n; col++) {
//
//                // print star
//                System.out.print("* ");
//
//            }
//
//            // moves to the next line
//            System.out.println();
//
//        }
//    }
//}

// 2. Solid Rectangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int m = 3;
//        int n = 5;
//
//        for (int row = 1; row <= m; row++) {
//
//            // for each row ---> n columns
//            for (int col = 1; col <= n; col++) {
//
//                // print star
//                System.out.print("* ");
//            }
//
//            // moves to the next line
//            System.out.println();
//
//        }
//    }
//}

// 3. Solid Right-Angle Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> variable columns
//            // formula ---> col -> 1 se value of row tak
//            for (int col = 1; col <= row; col++) {
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 4. Solid Rhombus Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> print space and star
//
//            //space
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print(" ");
//            }
//
//            // star
//            for (int col = 1; col <= n; col++) {
//                System.out.print("* ");
//            }
//
//            System.out.println(); // move to the next row
//        }
//    }
//}

// 5. Inverted Right Angle Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            for (int col = 1; col <= n - row + 1; col++) {
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 6. Solid Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> print spaces and stars
//            // space
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            // star
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//
//            // move to the next line
//            System.out.println();
//        }
//
//    }
//}

// 7. Inverted Solid Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> print spaces and stars
//
//            // space
//            for (int space = 1; space <= row - 1; space++) {
//                System.out.print("  ");
//            }
//
//            // star
//            for (int star = 1; star <= 2 * n - 2 * row + 1; star++) {
//                System.out.print("* ");
//            }
//
//            // move to the next line
//            System.out.println();
//        }
//
//    }
//}

// 8. Hollow Rectangular Pattern

public class Patterns {
    public static void main(String[] args) {

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // for each row ---> 6 columns
            for (int col = 1; col <= 6; col++) {
                if (row == 1 || row == n) {
                    System.out.print("* ");
                } else {

                    // middle rows
                    if (col == 1 || col == 6) {
                        System.out.print("* ");
                    } else {
                        // middle column
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();
        }
    }
}







