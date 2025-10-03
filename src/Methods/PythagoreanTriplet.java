package Methods;

import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int maximum = Math.max( num1 , Math.max(num2, num3));
//        System.out.println(maximum);

        int minimum = Math.min( num1 , Math.min(num2, num3));

        int sum = num1 + num2 + num3;
        int centre = sum - maximum - minimum;

        int maximums = maximum * maximum;
        int minimums = minimum * minimum;
        int centres = centre * centre;

        if (maximums == minimums + centres){
            System.out.println("The given numbers are pythagorean triplet");
        }
        else {
            System.out.println("The given numbers are not pythagorean triplet");

        }
    }

//    public static int max(int n1, int n2, int n3){
//        int maximum = Math.max(int n1 , Math.max(int n2, int n3));
//    }
}
