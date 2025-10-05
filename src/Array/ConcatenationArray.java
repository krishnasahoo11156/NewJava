package Array;

import java.util.Scanner;
import java.util.Arrays;
public class ConcatenationArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] nums = new int[size];
        for(int i = 0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("The concatenated array is : " + Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
