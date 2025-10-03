package Methods;

import java.util.Scanner;

public class CircumferenceArea {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        System.out.println("Circumference of the circle is " + circumference(radius));
        System.out.println("Area of the circle is " + area(radius));
    }

    private static float area(float radius) {
        float ar = 3.14f * radius * radius;
        return ar;
    }

    private static float circumference(float radius) {
        float circum = 2 * 3.14f * radius;
        return circum;
    }
}
