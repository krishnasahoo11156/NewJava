package Methods;

import java.util.Scanner;
public class PrimeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println( "The number you have entered is " + ans(num));

    }

    private static String ans(int n) {
        int count = 0;
        for(int i =2; i<n/2; i++){
            if(n%i == 0){
                count += 1;
                break;
            }

        }

        if(count > 0){
            return "not prime";
        }
        else {
            return "prime";
        }


    }
}
