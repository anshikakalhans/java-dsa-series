public class Datatypes {
    static void main(String[] args) {

        // Numeric Data Type - byte, short, int, long
        byte num1 = 127;
        System.out.println(num1);

        short num2 = 32767;
        System.out.println(num2);

        int num3 = 24637382;
        System.out.println(num3);

        long num4 = 8872387892369L;
        System.out.println(num4);

        // Floating DTs - float, double
        float num5 = 6.7654f;
        System.out.println(num5);

        double num6 = 7.88887654356;
        System.out.println(num6);

        // Other - char, boolean
        char firstCharacter = 'a';
        System.out.println((char)(firstCharacter+2));

        boolean eligibleToVote = true;
        System.out.println(eligibleToVote);

        // Implicit and Explicit Conversion

        // Implicit Typecasting
        byte val1 = 88;
        short val2 = val1;
        System.out.println(val1);

        // Explicit Typecasting
        long value1 = 1234567899;
        int value2 = (int)value1;
        System.out.println(value2);

    }
}
