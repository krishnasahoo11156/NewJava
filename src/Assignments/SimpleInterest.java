package Assignments;

import java.util.Scanner;
public class SimpleInterest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your principle amount : ");
        int principle = sc.nextInt();
        System.out.println();
        System.out.print("Enter the time period : ");
        int time = sc.nextInt();
        System.out.println();
        System.out.print("Enter the rate : ");
        int rate = sc.nextInt();
        System.out.println();

        float interest = (principle * time * rate)/100f;

        System.out.println("Your Simple interest is : " + interest);


    }

}
