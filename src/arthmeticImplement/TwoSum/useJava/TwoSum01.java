package arthmeticImplement.TwoSum.useJava;

import java.util.Arrays;

/**
 * 两数之和实现-1
 * 暴力循环法
 */
public class TwoSum01 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.twoSum(nums,target)));;
    }

    static class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target - nums[i]) {
                        result[0] = i;
                        result[1] = j;
                    }
                }

            }
            return result;
        }
    }
}
