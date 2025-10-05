package Array;

import java.util.Arrays;
import java.util.Scanner;
public class RunningSum1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Running Array Sum of the given array is : " + Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        int[] runningSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <= i; j++){
                runningSum[i] += nums[j];
            }
        }
        return runningSum;
    }
}
