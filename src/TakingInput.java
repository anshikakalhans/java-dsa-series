import java.math.BigInteger;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for first number:");
        int firstNum = sc.nextInt();

        System.out.println("Enter the value for second number:");
        int secondNum = sc.nextInt();

        int ans = firstNum + secondNum;

        System.out.println("Answers is: " + ans);

        System.out.println("Enter the value for BigInteger:");
        BigInteger bg = sc.nextBigInteger();

        System.out.println("Enter value for flag:");
        boolean flag = sc.nextBoolean();

        System.out.println("Enter the value for shortVal:");
        short shortVal = sc.nextShort();

        System.out.println("Enter the value for floatVal");
        float floatVal = sc.nextFloat();

        System.out.println("BigInteger: " + bg);
        System.out.println("Flag is: " + flag);
        System.out.println("Short Value is: " + shortVal);
        System.out.println("Float Value is: " + floatVal);

        sc.close();

    }
}
