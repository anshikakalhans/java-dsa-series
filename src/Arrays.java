public class Arrays {
    static void main() {

        // declaration
        int arr[];
        // allocation
        arr = new int[5];
        // initialization
        int brr[] = {1, 2, 3};


        // accessing elements of array using for loop
        int n = brr.length;
        for (int index = 0; index <= n - 1; index++) {
            System.out.println(brr[index]);
        }

        // accessing elements of array
        System.out.println("Value at index 0: " + brr[0]);
        System.out.println("Value at index 1: " + brr[1]);
        System.out.println("Value at index 2: " + brr[2]);
    }
}
