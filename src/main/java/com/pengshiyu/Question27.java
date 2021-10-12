package com.pengshiyu;


/**
 * 27. 移除元素
 * https://leetcode-cn.com/problems/remove-element/
 * 思路：双指针
 */
public class Question27 {
    public int removeElement(int[] nums, int val) {

        int length = nums.length;
        int left = 0;

        for (int right = 0; right < length; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }

        return left;
    }


    public static void main(String[] args) {
        Question27 question = new Question27();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int len = question.removeElement(nums, val);

        for (int i = 0; i < len; i++) {
            System.out.println(nums[i]);
        }

    }
}
