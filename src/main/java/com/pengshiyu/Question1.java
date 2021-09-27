package com.pengshiyu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 * 思路：哈希表
 */
public class Question1 {

    public int[] twoSum(int[] nums, int target) {
        // target = x + y
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        Question1 question2 = new Question1();

        int[] nums = {2, 7, 11, 15};
        int target = 9;


        int[] res = question2.twoSum(nums, target);
        System.out.println(Arrays.toString(res));
        // [1, 2]
    }
}
