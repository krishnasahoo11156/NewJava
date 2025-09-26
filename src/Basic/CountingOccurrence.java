package Basic;

import java.util.Scanner;
public class CountingOccurrence {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int target = sc.nextInt();
        // 37429378387
        int count = 0;

//        While doing with while loop
        while(num != 0){
            if(num%10 == target){
                count++;

            }
            num = num/10;
        }


        //     If doing with for loop
        // for (int n = num; n != 0; n /= 10) {
        //     if (n % 10 == target) {
        //         count++;
        //     }
        // }


        System.out.println(count);
        sc.close();

    }
}
