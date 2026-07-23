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

//public class Patterns {
//    public static void main(String[] args) {
//
//        // Upper Part of Hollow Diamond
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // leading spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            //for each row ---> variable columns
//            if (row == 1) {
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
//
//        // Lower Part of Hollow Diamond
//
//        for (int row = 1; row <= (n - 1); row++) {
//
//            // leading spaces
//            for (int col = 1; col <= row; col++) {
//                System.out.print("  ");
//            }
//
//            if (row == (n - 1)) {
//                System.out.print("* ");
//            } else {
//                // remaining rows
//                // 1*
//                System.out.print("* ");
//
//                // 2*(n-row)-3 spaces
//                for (int col = 1; col <= (2 * (n - row) - 3); col++) {
//                    System.out.print("  ");
//                }
//
//                // 1*
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 13. Butterfly Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        // Part 1 Upper Half
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//
//            // Part 2
//            for (int col = 1; col <= 2 * (n - row); col++) {
//                System.out.print("  ");
//            }
//
//            // Part 3
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//        // Part 2 Lower Half
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1
//            for (int col = 1; col <= n - row + 1; col++) {
//
//                System.out.print("* ");
//            }
//
//            // Part 2
//            for (int col = 1; col <= 2 * (row - 1); col++) {
//                System.out.print("  ");
//            }
//
//            // Part 3
//            for (int col = 1; col <= n - row + 1; col++) {
//
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 14. Number Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= 5; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 15. Floyd's Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//        int count = 1;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//                System.out.print(count + " ");
//                count++;
//            }
//            System.out.println();
//        }
//    }
//}

// 16. Alphabet Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//
//            // for each row ---> variable column
//            for (int col = 1; col <= row; col++) {
//
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a + b;
//
//                char finalAns = (char) ans;
//
//                System.out.print(finalAns + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 17. Reverse Alphabet Right-Angle Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= row; col++) {
//
//                int a = n - col;
//                int b = 'A';
//                int ans = a + b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}

// 18. Hourglass Shape Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        // Part 1 ---> Solid Inverted Pyramid Pattern
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
//        // Part 2 ---> Solid Pyramid Pattern
//
//        for (int row = 2; row <= n; row++) {
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
//    }
//}

// 19. Symmetric Number Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1
//
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            // Part 2
//            for (int col = 1; col <= row; col++) {
//                System.out.print(col + " ");
//            }
//
//            // Part 3
//            int rowValue = row;
//            int decRowValue = row - 1;
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print(decRowValue + " ");
//                decRowValue--;
//            }
//
//            System.out.println();
//
//        }
//    }
//}

// 20. Number Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            // Part 2
//            for (int col = 1; col <= (2 * row - 1); col++) {
//                System.out.print(row + " ");
//            }
//
//            System.out.println();
//        }
//
//    }
//}

// 21. Symmetric Alphabet Pyramid Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//
//            // Part 1
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//
//            // Part 2
//            for (int col = 1; col <= row; col++) {
//                int a = col;
//                int b = 'A' - 1;
//                int ans = a + b;
//                char finalAns = (char) ans;
//                System.out.print(finalAns + " ");
//            }
//
//            // Part 3
//            char toPrint = (char) (row + 'A' - 2);
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print(toPrint + " ");
//                toPrint--;
//            }
//
//            System.out.println();
//        }
//
//    }
//}

// 22. Hollow Square Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= n; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else {
//                    if (col == 1 || col == n) {
//                        System.out.print("* ");
//                    } else {
//                        System.out.print("  ");
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// 23. Inverted Alphabet Triangle Pattern

//public class Patterns {
//    public static void main(String[] args) {
//
//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            char ch = 'A';
//            for (int col = 1; col <= n - row + 1; col++) {
//                System.out.print(ch + " ");
//                ch++;
//            }
//            System.out.println();
//        }
//    }
//}









