package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int n = size/2;

        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Your Shuffled array is : " + Arrays.toString(shuffle(nums, n)));
    }

    public static int[] shuffle(int[] nums, int n) {
        for(int i = 0; i < n; i++){
            nums[n+i] = (nums[n+i]<<10) | nums[i];
        }
        for(int i = 0; i < n; i++){
            nums[2 * i] = nums[n+i] & 1023;
            nums[2 * i + 1] = nums[n+i] >> 10;
        }
        return nums;
    }
}
