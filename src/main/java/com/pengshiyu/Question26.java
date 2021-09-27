package com.pengshiyu;

/**
 * 26. 删除有序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 * 思路：双指针法
 */
public class Question26 {
    public int removeDuplicates(int[] nums) {
        // 判空
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 至少一个元素
        int fast = 1; // 快指针表示遍历数组到达的下标位置
        int slow = 1; // 慢指针表示下一个不同元素要填入的下标位置

        while (fast < nums.length) {
            // 如果元素和前一个元素不一样，移动位置
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                slow++;
            }

            fast++;
        }

        return slow;
    }

    public static void main(String[] args) {
        Question26 question1 = new Question26();

        int[] nums1 = {1, 1, 2};
        int ret1 = question1.removeDuplicates(nums1);
        System.out.println(ret1); // 2

        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int ret2 = question1.removeDuplicates(nums2);
        System.out.println(ret2); // 5
    }
}
