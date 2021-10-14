package com.pengshiyu;


/**
 * 35. 搜索插入位置
 * https://leetcode-cn.com/problems/search-insert-position/
 * 思路：二分查找
 */
public class Question35 {

    public int searchInsert0(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // nums[pos−1]<target≤nums[pos]
            if (target == nums[i] || target < nums[i]) {
                return i;
            }
        }

        return nums.length;
    }

    // 二分查找 O(log_n)
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Question35 question = new Question35();

        int[] nums = {1, 3, 5, 6};
        int target = 5;


        int position = question.searchInsert(nums, target);

        System.out.println(position);

    }
}
