package ConditionALoops;

import java.util.Scanner;

//4867

public class MaxNumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int maximum = Integer.MIN_VALUE;
        while(true){
            maximum = Math.max(maximum , num);
            if(num == 0)break;
            num = sc.nextInt();

        }

        System.out.println(maximum);
    }
}
