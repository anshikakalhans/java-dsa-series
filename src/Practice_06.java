// 1. Print counting from 1 to n.

//import java.util.Scanner;
//
//public class Practice_06 {
//    static void main() {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the no. till you want to print: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i);
//
//        }
//
//    }
//}

// 2. Print counting from n to 1.

//import java.util.Scanner;
//
//public class Practice_06 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        for (int i = n; i >= 1; i--) {
//            System.out.println(i);
//        }
//    }
//}

// 3. Print the 10 multiples of n.

//import java.util.Scanner;
//
//public class Practice_06 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the no. you want to print multiples of: ");
//        int n = sc.nextInt();
//
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(n * i);
//        }
//
//        sc.close();
//    }
//}

// 4. Print your name 100 times.

//public class Practice_06 {
//    public static void main(String[] args) {
//
//        for (int i = 1; i <= 100; i++) {
//            System.out.println("Anshika Kalhans");
//        }
//    }
//}
//
//

// 5. Print all prime numbers from 1 to 100.

//public class Practice_06 {
//    public static void main(String[] args) {
//
//        for (int i = 2; i <= 100; i++) {
//
//            boolean isPrime = true;
//
//            for (int j = 2; j < i; j++) {
//                if (i % j == 0) {
//                    isPrime = false;
//
//                    break;
//                }
//            }
//
//            if (isPrime) {
//                System.out.println(i);
//            }
//        }
//    }
//}

// 6. Print all even numbers from 1 to 100.

//public class Practice_06 {
//    public static void main(String[] args) {
//
//        for (int i = 2; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//    }
//}

// 7. Print the sum of all the numbers from 1 to n.

//import java.util.Scanner;
//
//public class Practice_06 {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter n: ");
//        int n = sc.nextInt();
//
//        int sum = 0;
//
//        for (int i = 1; i <= n; i++) {
//            sum = sum + i;
//
//        }
//
//        System.out.println("Sum of first n numbers are: " + sum);
//
//    }
//}

// 8. Print all integers in range from 50 to 100, that are perfectly divisible by 7.

//public class Practice_06 {
//    public static void main(String[] args) {
//
//        for (int i = 50; i <= 100; i++) {
//            if (i % 7 == 0) {
//                System.out.println(i);
//            }
//        }
//    }
//}
//
//


