package Methods;

import java.util.Scanner;
public class VoterCheck {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        String answer = ans(age);
        System.out.println(answer);

    }

    public static String ans(int aayu) {
        if(aayu < 130 && aayu >= 18){
            return "You are elligible to vote.";
        }
        else if (aayu >= 130){
            return "Yaar abhi toh marjaa budhe...";
        }
        else if (aayu > 0 && aayu < 18){
            return "Bache tu bada ho ja.";
        }
        else {
            return "Goli beta , masti nai";
        }
    }
}
