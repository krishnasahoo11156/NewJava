package Basic;

import static java.util.Collections.swap;

public class SwapWithMethods {
    static void main(String[] args) {

        int a = 3;
        int b = 5;

        swap(a, b);

        System.out.println("The value of 1st number is : " + a);
        System.out.println("The value of 2nd number is : " + b);

        //Even after using the swap method before printing there is no change in the values
    }

    private static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;

    }
}

