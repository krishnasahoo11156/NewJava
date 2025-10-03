package ConditionALoops;

import java.util.Scanner;
public class AreaCircle {
    public static float area(float radius){
        float a = (3.14f * radius);
        return a;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        System.out.println("The area of the circle is : " + area(radius));

    }
}
