package Basic;

import java.util.Scanner;
public class Max2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int max = Math.max(num1,num2);
        System.out.println("Maximum of the given numbers is " + max);
        sc.close();
    }
}
