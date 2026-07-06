// Q1. Take age input and print if he/she is eligible to vote or not.

//public static void main(String[] args) {
//
//    System.out.println("Enter your age: ");
//
//    Scanner sc = new Scanner(System.in);
//    int age = sc.nextInt();
//
//    if (age >= 18) {
//        System.out.println("You can vote.");
//    } else {
//        System.out.println("You cannot vote.");
//
//    }
//}


// Q2. Take input 5 subject's marks and print the overall percentage of student.

// void main() {
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter your marks for Python: ");
//    float marksOfPython = sc.nextFloat();
//
//    System.out.println("Enter your marks for Cpp ");
//    float marksOfCpp = sc.nextFloat();
//
//    System.out.println("Enter your marks for Java ");
//    float marksOfJava = sc.nextFloat();
//
//    System.out.println("Enter your marks for JS ");
//    float marksOfJS = sc.nextFloat();
//
//    System.out.println("Enter your marks for React ");
//    float marksOfReact = sc.nextFloat();
//
//    float total = marksOfPython + marksOfCpp + marksOfJava + marksOfJS + marksOfReact;
//    float percentage = (total / 500) * 100;
//
//    System.out.println("Your Overall Percentage is:" + percentage);
//
//    sc.close();
//
//}


// Q3. Take input 5 subject's marks, drop the least one and calculate the overall percentage considering only the top 4 marks, print it.

//void main() {
//
//    Scanner sc = new Scanner(System.in);
//
//    System.out.println("Enter your marks for Sub1: ");
//    float sub1 = sc.nextFloat();
//
//    System.out.println("Enter your marks for Sub2 ");
//    float sub2 = sc.nextFloat();
//
//    System.out.println("Enter your marks for Sub3 ");
//    float sub3 = sc.nextFloat();
//
//    System.out.println("Enter your marks for Sub4 ");
//    float sub4 = sc.nextFloat();
//
//    System.out.println("Enter your marks for Sub5 ");
//    float sub5 = sc.nextFloat();
//
//    float total = sub1 + sub2 + sub3 + sub4 + sub5;
//
//    // Finding least mark
//    float least = sub1;
//
//    if (sub2 < least)
//        least = sub2;
//
//    if (sub3 < least)
//        least = sub3;
//
//    if (sub4 < least)
//        least = sub4;
//
//    if (sub5 < least)
//        least = sub5;
//
//    // Finding Total of Best 4
//
//    float bestFourTotal = total - least;
//
//    // Percentage out of 400
//
//    float percentage = (bestFourTotal / 400) * 100;
//
//    System.out.println("Your Overall Percentage(Best Four Subjects) is: " + percentage + "%");
//
//    sc.close();
//}




