package ConditionALoops;

import java.util.Scanner;
public class FactorialOfNumber {

    public static int factorial(int num){
        int count = 0;
        for(int i = 2; i<=num/2; i++){
            if(num%i ==0){
                count++;
                System.out.println(i);
            }
        }
        return 0;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int answer = factorial(num);
        System.out.println("The factorial of the given number is : "+answer);
    }
}
