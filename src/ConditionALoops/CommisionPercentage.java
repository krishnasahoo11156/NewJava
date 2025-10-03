package ConditionALoops;

import java.util.Scanner;
public class CommisionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of the product : ");
        double amount = sc.nextDouble();
        System.out.print("Enter the commission amount : ");
        double commission = sc.nextDouble();

        double percentage = ( commission / amount );
        double finalpercentage = percentage * 100;

        System.out.println("The commission percentage is : " + finalpercentage);
    }
}
