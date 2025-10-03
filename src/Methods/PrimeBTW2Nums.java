package Methods;

import java.util.Scanner;
public class PrimeBTW2Nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int maxnum = Math.max(num1,num2);
        int minnum = Math.min(num1,num2);

        prime(minnum,maxnum);

    }

    public static void prime(int n1, int n2){
        for(int i = n1; i <= n2; i++){
            int count = 0;
            for(int j = 2; j<=i/2; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 0) {
                System.out.println(i);
            }
        }
    }

}
