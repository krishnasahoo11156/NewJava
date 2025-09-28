package Basic;
//98473
import java.util.Scanner;
public class ReverseNum {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int reverse = 0;

        while(num != 0){
            int digit = num%10;  //3,7
            reverse = reverse * 10;  //0,30
            reverse = reverse + digit;  // 3,37
            num = num/10;  //9847
        }

        System.out.println(reverse);
        sc.close();
    }
}
