// ---------- 1D Arrays ----------

// import java.util.Scanner;

//public class Arrays {
//    static void main() {
//
//        // declaration
//        int arr[];
//        // allocation
//        arr = new int[5];
//        // initialization
//        int brr[] = {1, 2, 3};


// accessing elements of array using for loop
//        int n = brr.length;
//        for (int index = 0; index <= n - 1; index++) {
//            System.out.println(brr[index]);
//        }

// accessing elements of array
//        System.out.println("Value at index 0: " + brr[0]);
//        System.out.println("Value at index 1: " + brr[1]);
//        System.out.println("Value at index 2: " + brr[2]);

// using for each loop
//        for(int val: brr){
//            System.out.println(val);
//        }
//   }

// taking input
//    static void main() {

//        int arr[] = new int[5];
//        Scanner sc = new Scanner(System.in);
//        int n = arr.length;
//
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println("Provide input for index " + i);
//            arr[i] = sc.nextInt();
//        }
//
//        // print
//        System.out.println("You array contains: ");
//        for (int val : arr) {
//            System.out.println(val);
//}

//        int arr[] = {1, 2, 3};
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            System.out.println(arr[i]);
//        }
//    }

// ----- Print Sum of Array -----
//public class Arrays {
//    static void main() {
//
//        int arr[] = {10, 20, 30, 40, 50};
//        int sum = 0;
//        int n = arr.length;
//
//        for (int i = 0; i <= n - 1; i++) {
//            int value = arr[i];
//            sum = sum + value;
//
//        }
//
//        // sum is ready to print
//        System.out.println(sum);
//    }
//}

// Multiply elements of Array
//class Arrays {
//    static void main() {
//
//        int arr[] = {2, 3, 10, 20};
//        int ans = 1;
//        int n = arr.length;
//        for (int i = 0; i <= n - 1; i++) {
//            int value = arr[i];
//            ans = ans * value;
//        }
//        System.out.println(ans);
//    }
//}

// Find Maximum Element in an Array
//class Arrays {
//    static void main() {
//
//        int arr[] = {2, 4, 6, 8, 10, -76, 100, 1005, 23};
//        int n = arr.length;
//        int maxValue = arr[0];
//
//        for (int i = 0; i <= n - 1; i++) {
//            if (arr[i] > maxValue) {
//                // update maxValue
//                maxValue = arr[i];
//            }
//        }
//        System.out.println(maxValue);
//    }
//}

// Find the minimum value in an Array
//class Arrays {
//    static void main() {
//        int arr[] = {2, 3, 4, 5, 6, 5, 4, 3, 2, 1, 10, 0, 11};
//        int n = arr.length;
//        int minValue = arr[0];
//
//        for (int i = 0; i <= n - 1; i++) {
//            if (arr[i] < minValue) {
//                // update minValue
//                minValue = arr[i];
//            }
//        }
//        System.out.println(minValue);
//    }
//}

// ---------- 2D Arrays ----------

//class Main {
//    static void main() {
//
//        // declaration
//        int[][] arr;
//        // creation/allocation
//        arr = new int[3][4];
//        // initialize
//        int[][] brr = {
//                {1, 2},
//                {2, 3},
//                {3, 4},
//                {4, 5}
//        };
//        System.out.println(brr[1][1]);
//    }
//}

// loop se array ke elements ko print karo

//class Arrays {
//    static void main() {
//        int[][] brr = {


/// /                {1, 2},
/// /                {2, 3},
/// /                {3, 4},
/// /                {4, 5}
//                // variable no. of col
//                {1, 2, 3, 4},
//                {3, 8},
//                {22},
//                {33, 100, 43, 67}
//        };
//
//        int rowLength = brr.length;
//        // int colLength = brr[0].length; // ye tabhi kaam karega jab no. of col har row me same honge
//
//        for (int rowIndex = 0; rowIndex <= rowLength - 1; rowIndex++) {
//            // jaise hi mai kisi new row me aau
//            // same point par mai uss row ka colLength find out krlu
//            // current row -> brr[rowIndex]
//            // isme kitne columns -> brr[rowIndex].length
//            int colLength = brr[rowIndex].length;
//            for (int colIndex = 0; colIndex <= colLength - 1; colIndex++) {
//                System.out.print(brr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// ---------- Input Inside 2D Array ----------

//import java.util.Scanner;
//
//class Arrays {
//    static void main() {
//
//        int arr[][] = new int[3][4];
//        Scanner sc = new Scanner(System.in);
//
//        // input
//        for (int i = 0; i <= arr.length - 1; i++) {
//            for (int j = 0; j <= arr[i].length - 1; j++) {
//                System.out.println("Provide value for row = " + i + " and column = " + j);
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        // print
//        for (int rowIndex = 0; rowIndex <= arr.length - 1; rowIndex++) {
//            for (int colIndex = 0; colIndex <= arr[rowIndex].length - 1; colIndex++) {
//                System.out.print(arr[rowIndex][colIndex] + " ");
//            }
//            System.out.println();
//        }
//    }
//}

// Print sum of all elements present in an Array.

//class Arrays {
//    static void main() {
//
//        int arr[][] = {{1, 2, 3}, {1, 2, 3}};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                int value = arr[i][j];
//                sum = sum + value;
//            }
//        }
//        System.out.println(sum);
//    }
//}

// Multiply elements of an Array.

//class Arrays {
//    static void main() {
//
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}};
//        int ans = 1;
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                int value = arr[i][j];
//                ans = ans * value;
//            }
//        }
//        System.out.println(ans);
//    }
//}

// Find Maximum Value in 2D Array

//class Arrays {
//    static void main() {
//
//        int arr[][] = {{1, 2, 3}, {100, 101, 110}};
//        int n = arr.length;
//        int maxValue = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > maxValue) {
//                    maxValue = arr[i][j];
//                }
//            }
//        }
//        System.out.println(maxValue);
//    }
//}

// Find Minimum Value in 2D Array

//class Arrays {
//    static void main() {
//
//        int arr[][] = {{1, 2, 3}, {100, 0, 110}};
//        int minValue = arr[0][0];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] < minValue) {
//                    minValue = arr[i][j];
//                }
//            }
//        }
//        System.out.println(minValue);
//    }
//}

// Find sum of each row.

//class Arrays {
//    static void main() {
//
//        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int i = 0; i < arr.length; i++) {
//
//            int sum = 0;
//
//            for (int j = 0; j < arr.length; j++) {
//                sum += arr[i][j];
//            }
//
//            System.out.println("Row " + i + " sum = " + sum);
//        }
//    }
//}

// Column-wise Sum

//class Arrays {
//    static void main() {
//
//        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        for (int j = 0; j < matrix.length; j++) { // outer loop ---> column
//
//            int sum = 0;
//
//            for (int i = 0; i < matrix.length; i++) { // inner loop ---> row
//                sum += matrix[i][j];
//            }
//
//            System.out.println("Column " + j + " sum = " + sum);
//        }
//    }
//}

// Transpose of Matrix

//class Arrays {
//    static void main() {
//
//        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
//
//        for (int j = 0; j < matrix[0].length; j++) {
//
//            for (int i = 0; i < matrix.length; i++) {
//
//                System.out.print(matrix[i][j] + " ");
//            }
//
//            System.out.println();
//        }
//    }
//}









































