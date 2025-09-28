package Assignments;

import java.util.Scanner;
public class RupeeToDollar {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupee = sc.nextInt();

        float dollar = rupee/80f;
        System.out.println("The conversion in US dollar is : " + dollar);

    }
}
