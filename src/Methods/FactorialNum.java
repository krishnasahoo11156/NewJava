package Methods;

import java.util.Scanner;
public class FactorialNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The factorial of " + n + " is " + Factorial(n));
    }

    private static int Factorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;

        }
        return fact;
    }
}
