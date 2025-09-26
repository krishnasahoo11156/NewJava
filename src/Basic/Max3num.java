package Basic;

import java.util.Scanner;
public class Max3num {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int max = Math.max(num3, Math.max(num1, num2));
        System.out.println("The maximum number of the three numbers are " + max);
        sc.close();
    }

}
