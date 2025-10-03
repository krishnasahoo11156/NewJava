package Assignments;

import java.util.Scanner;
public class AreaRectangle {
    public static float area(float length , float breath){
        //float a = length * breath;
        return length * breath;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length and Breath : ");
        float length = sc.nextFloat();
        float breath = sc.nextFloat();

        System.out.println("The area of the rectangle is : " + area(length,breath));

    }
}
