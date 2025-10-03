package ConditionALoops;

import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        float amount = sc.nextFloat();

        System.out.print("Enter the percentage discount : ");
        float discountP = sc.nextFloat();

        float discountA = amount * discountP;
        float discountA2 = discountA/100;

        float finalamount = amount - discountA2;

        System.out.println("Discount amount : " + discountA2);
        System.out.println("Final amount to pay : " + finalamount);
    }
}
