package Methods;

import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();

        String answer = ans(n);
        System.out.println("The given number is : " + answer);
    }

    public static String ans(int num) {
        if(num%2 == 0){
            return "Even";
        }
        else{
            return "Odd";
        }
    }
}
