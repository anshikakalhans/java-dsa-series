//public class Methods {
//
//    // declaration/definition
//    static void print2KaTable() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(2 * i);
//        }
//
//    }
//
//    static void printSum(int x, int y) { // parameter declaration
//        System.out.println("Sum: " + (x + y));
//    }
//
//    static void multiply(int a, int b) {
//        int ans = a * b;
//        System.out.println("Result: " + ans);
//        return;
//    }
//
//    // non void return type
//
//    static int add(int p, int q) {
//        int sum = p + q;
//        return sum;
//    }
//
//    static float add(int p, float q) {
//        float ans = p + q;
//        return ans;
//    }
//
//    static void main() {
//

import org.w3c.dom.ls.LSOutput;

/// /        System.out.println("hie");
/// /
/// /        // method call/invoke
/// /        print2KaTable();
/// /
/// /        System.out.println("bye");
//
//        //printSum(5, 10); // argument declaration
//
//        //multiply(2, 3);
//
//        //int result = add(2, 2);
//        //System.out.println("Result: " + result);
//
//        int ans1 = add(2, 2);
//        float ans2 = add(2, 2.0f);
//
//        System.out.println("Ans1 is: " + ans1);
//        System.out.println("Ans2 is: " + ans2);
//
//    }
//}


// Methods and Variable Scoping


// Practice Problems

// 1. Create a method printWelcomeMessage() that prints a greeting.

//class Methods {
//    public static void printWelcomeMessage() {
//        System.out.println("Welcome!");
//
//    }
//
//    public static void main() {
//        printWelcomeMessage();
//
//    }
//}

// 2. Create a method add (int a, int b) that returns the sum.

//class Methods {
//    public static int add(int a, int b) {
//        return a + b;
//
//    }
//
//    static void main(String[] args) {
//        int result = add(5, 3);
//        System.out.println(result);
//
//    }
//}

// 3. Create a method isEven(int Number) that returns true if number is even.

//class Methods {
//    static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        }
//        return false;
//
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isEven(6));
//        System.out.println(isEven(7));
//        System.out.println(isEven(10));
//
//    }
//}

// 4. Create a method getMaximum(int a, int b) that returns the larger number.

//class Methods {
//    static int getMaximum(int a, int b) {
//        if (a > b) {
//            return a;
//        }
//        return b;
//
//    }
//
//    static void main(String[] args) {
//        int num = getMaximum(4, 32);
//        System.out.println("Larger number is: " + num);
//
//    }
//
//}

// 5. Create a method calculatePercentage(int obtained, int total).

//class Methods {
//    static float calculatePercentage(int obtained, int total) {
//        float percentage = ((float) obtained / total) * 100;
//        return percentage;
//    }
//
//    static void main(String[] args) {
//        float total_percentage = calculatePercentage(490, 500);
//        System.out.println("Total Percentage: " + total_percentage);
//
//    }
//}

// Create an Overloaded method Display() with one Int Parameter() or one String Parameter().

//class methodOverLoading {
//    static void display(int x) { //yaha display() overloaded hai kyuki same method name hai but diff. parameter types
//        System.out.println("Integer x: " + x);
//    }
//
//    static void display(String x) {
//        System.out.println("String x: " + x);
//
//    }
//
//    static void main() {
//        display(10);
//        display("hello");
//    }
//}

// Write a method updateValue(int x) and verify that the original variable in main() does not change.

//class PassByValue {
//    static void updatevalue(int x) {
//        x = 100;
//        System.out.println("Value Inside method: " + x);
//    }
//
//    static void main() {
//        int x = 10;
//        System.out.println("Before Method Call: " + x);
//
//        updatevalue(x);
//
//        System.out.println("After Method Call: " + x);
//    }
//}








