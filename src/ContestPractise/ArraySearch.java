package ContestPractise;

import java.util.Scanner;
public class ArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i = 0; i<num; i++){
            if(arr[i] == target){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
        sc.close();
    }
}
