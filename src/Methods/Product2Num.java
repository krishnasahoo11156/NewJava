package Methods;

import java.util.Scanner;

public class Product2Num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The product of the two numbers is : " + ans(num1,num2));
    }

    public static int ans(int n1, int n2) {
        return n1 * n2;
    }
}
