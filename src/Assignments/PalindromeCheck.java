package Assignments;

import java.util.Scanner;

public class PalindromeCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        String word = sc.nextLine();
        word = word.toLowerCase();

//        int length = word.length();
//        if(length % 2 == 0){
//            while(left >= 0 && right < length) {
//                int left = (length / 2) - 1;
//                int right = (length / 2);
//                left--;
//                right++;
//                if()
//            }
//        }
//        else{
//
//        }

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        if (word.equals(reverse)) {
            System.out.println("The given word is a palindrome");
        } else {
            System.out.println("The given word is not a palindrome");
        }
        //System.out.println(length);
    }
}
