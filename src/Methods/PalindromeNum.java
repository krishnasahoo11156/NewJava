package Methods;

import java.util.Scanner;

public class PalindromeNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean ans = palindrome(num);
//        System.out.println(ans);

        String answer;
        if(ans == false){
            answer = "NOT A PALINDROME";
        }
        else{
            answer = "A PALINDROME";
        }
        System.out.println("The number " + num + " is " + answer);
    }

    private static boolean palindrome(int num) {
        String numString = String.valueOf(num);
        int reverse = 0;

        while(num > 0) {
            int digit = num % 10;
            reverse = ( reverse * 10 ) + digit;
            num /= 10;
        }

        String reverseString = String.valueOf(reverse);

        return numString.equals(reverseString);
    }
}
