package ConditionALoops;

import java.util.Scanner;
public class AverageNNum {

//    public static float average(int n , )
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many numbers you are taking : ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        int total = 0;
        for(int i = 0; i < n; i++){
            //numbers[i] = sc.nextInt();
            total += numbers[i];
        }
        float answer = total/n;
        System.out.println(answer);
    }
}
