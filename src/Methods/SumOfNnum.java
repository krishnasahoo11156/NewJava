package Methods;

import java.util.Scanner;

public class SumOfNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sum(n);
    }

    public static void sum(int n) {
        int summ = (n * (n + 1))/2;
        System.out.println(summ);
    }

}
