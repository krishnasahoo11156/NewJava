package ConditionALoops;

import java.util.Scanner;
public class Distance2points {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the co-ordinates of first number : ");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();

        System.out.println();

        System.out.print("Enter the co-ordinates of first number : ");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        float x = x1 - x2;
        float y = y1 - y2;

        double answer = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance between the two points are : " + answer);
    }
}
