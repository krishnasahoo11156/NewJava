package Assignments;

import java.util.Scanner;
public class ArmstrongNumber {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int degree = String.valueOf(num).length();

        while(num > 0){
            int digit = num%10;
            sum += Math.pow(digit, degree);
            num /= 10;

        }
        return sum == originalNum;

    }



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for(int i = num1 + 1; i<num2; i++){
            if(isArmstrong(i)){
                System.out.println(i);

            }
        }
    }

}
