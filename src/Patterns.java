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

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> 6 columns
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//
//                    // middle rows
//                    if (col == 1 || col == 6) {
//                        System.out.print("* ");
//                    } else {
//                        // middle column
//                        System.out.print("  ");
//                    }
//                }
//            }
//
//            System.out.println();
//        }
//    }
//}

// 9. Hollow Right-Angle Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> variable columns
//            if (row == 1 || row == 2 || row == n) {
//
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                // middle rows
//
//                // 1*
//                System.out.print("* ");
//                // 2 spaces
//                for (int col = 1; col <= (row - 2); col++) {
//                    System.out.print("  ");
//                }
//                // 1*
//                System.out.print("* ");
//            }
//
//            System.out.println();
//
//        }
//    }
//}

// 10. Hollow Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // leading spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            //for each row ---> variable columns
//            if (row == 1 || row == n) {
//                for (int col = 1; col <= (2 * row - 1); col++) {
//                    System.out.print("* ");
//                }
//            } else {
//                // middle rows
//
//                // 1*
//                System.out.print("* ");
//
//                // spaces
//                for (int col = 1; col <= (2 * row - 3); col++) {
//                    System.out.print("  ");
//                }
//
//                // 1*
//                System.out.print("* ");
//
//            }
//
//            System.out.println();
//
//        }
//    }
//}

// 11. Solid Diamond Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        // Part 1 ---> Solid Pyramid
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
//        // Part 2 ---> Inverted Solid Pyramid
//
//        for (int row = 1; row <= n; row++) {
//
//            if (row == 1) {
//                continue;
//            }
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

// 12. Hollow Diamond Pattern

public class Patterns {
    public static void main(String[] args) {

        // Upper Part of Hollow Diamond

        int n = 4;

        for (int row = 1; row <= n; row++) {

            // leading spaces
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }

            //for each row ---> variable columns
            if (row == 1) {
                for (int col = 1; col <= (2 * row - 1); col++) {
                    System.out.print("* ");
                }
            } else {
                // middle rows

                // 1*
                System.out.print("* ");

                // spaces
                for (int col = 1; col <= (2 * row - 3); col++) {
                    System.out.print("  ");
                }

                // 1*
                System.out.print("* ");

            }

            System.out.println();

        }

        // Lower Part of Hollow Diamond

        for (int row = 1; row <= (n - 1); row++) {

            // leading spaces
            for (int col = 1; col <= row; col++) {
                System.out.print("  ");
            }

            if (row == (n - 1)) {
                System.out.print("* ");
            } else {
                // remaining rows
                // 1*
                System.out.print("* ");

                // 2*(n-row)-3 spaces
                for (int col = 1; col <= (2 * (n - row) - 3); col++) {
                    System.out.print("  ");
                }

                // 1*
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}





