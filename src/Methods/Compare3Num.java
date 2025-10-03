package Methods;

import java.util.Scanner;

public class Compare3Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.println();

        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();
        System.out.println();

        System.out.print("Enter the 3rd number : ");
        int num3 = sc.nextInt();
        System.out.println();

        int maximum = max(num1, num2, num3);
        int minimum = min(num1, num2, num3);

        System.out.println("Maximum number of the given numbers is : " + maximum);
        System.out.println("Minimum number of the given numbers is : " + minimum);


    }

    static int max(int n1,int n2,int n3){
        if(n1 > n2){
            if(n3 > n1){
                return n3;
            }
            else{
                return n1;
            }
        }
        else{
            if(n2 > n3){
                return n2;
            }
            else{
                return n3;
            }
        }
    }

    static int min(int n1,int n2,int n3){
        if (n1 < n2) {
            if (n3 < n1) {
                return n3;
            } else {
                return n1;
            }
        } else {
            if (n2 < n3) {
                return n2;
            } else {
                return n3;
            }
        }
    }
}
