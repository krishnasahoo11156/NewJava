package Array;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
//        int[] answer = buildArray(nums);
        System.out.println("Array of permutation is : " + Arrays.toString(buildArray(nums)));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
