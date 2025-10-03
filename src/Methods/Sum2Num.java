package Methods;

import java.util.Scanner;

public class Sum2Num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The sum of two numbers is : " + ans(num1,num2));
    }

    public static int ans(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
