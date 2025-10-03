package ConditionALoops;

import java.util.Scanner;
public class ProdMinusSum {
    public static int answer(int num){
        int product = 1;
        int sum = 0;
        return product-sum;
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("Answer is : " + answer(num));
    }
}
