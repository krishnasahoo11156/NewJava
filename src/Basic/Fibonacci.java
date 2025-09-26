package Basic;

import java.util.Scanner;
public class Fibonacci {
    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int count = 2;
        int temp;
        while(count <= num) {
//            if we have to do with a temp variable
            temp = a;
            a = b;
            b = temp + b;


//            if we had to interchange the numbers without any temp variable
//            a = a + b;
//            b = a - b;  //a
//            a = a - b;  //b


//            if we have to do without any temp variable
//            b = a + b;
//            a = b - a;  //b


            count++;
            System.out.println(b);
        }

    }
}
