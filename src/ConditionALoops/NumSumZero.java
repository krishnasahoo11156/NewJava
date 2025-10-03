package ConditionALoops;

import java.util.Scanner;
public class NumSumZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        int num = sc.nextInt();
//        while(num != 0){
//
////            num = sc.nextInt();
////            sum += num;
//
//            sum += num;
//            num = sc.nextInt();
//        }


        while (true) {
            num = sc.nextInt();
            if (num == 0) break;
            sum += num;
        }



        System.out.println("The sum of the numbers are : " + sum);

    }
}
