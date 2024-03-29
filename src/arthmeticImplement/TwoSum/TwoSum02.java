package arthmeticImplement.TwoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 两数之和实现-2
 * 两遍哈希
 * 创建日期:2020-07-27-22:24
 * @author Huangwd
 */
public class TwoSum02 {
    public static void main(String[] args) {
        // 创建示例数组
        int[] nums = new int[]{3, 3};
        int target = 6;

        System.out.println(Arrays.toString(Solution.twoSum(nums, target)));
    }


    static class Solution {
        public static int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            Map<Integer, Integer> map = new HashMap<>(nums.length);
            for (int i = 0; i < nums.length; i++) {
                // map.put(i, nums[i]);  注意put的位置,如果解开此注解,将输出错误结果
                if (map.containsKey(target - nums[i])) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                }
                map.put(i, nums[i]);
            }
            return result;
        }
    }
}