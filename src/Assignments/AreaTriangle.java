package Assignments;

import java.util.Scanner;
public class AreaTriangle {
    public static float area(float height , float base){
        float a = (base * height)/2f;
        return a;
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height of the triangle : ");
        float height = sc.nextFloat();

        System.out.println();

        System.out.print("Enter the base of the triangle : ");
        float base = sc.nextFloat();

        System.out.println("Area of the triangle is : " + area(height , base));

    }
}
