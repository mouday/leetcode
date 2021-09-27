package com.pengshiyu;

/**
 * 9. 回文数
 * https://leetcode-cn.com/problems/palindrome-number/
 * 思路：对折比较
 */
public class Question9 {
    public boolean isPalindrome(int x) {
        // 负数和个位为0的数一定不是回文数
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        // 折半比较
        int reverseNum = 0;

        while (x > reverseNum) {
            int digit = x % 10;
            reverseNum = reverseNum * 10 + digit;
            x /= 10;
        }

        // 比较长度为偶数或者长度为奇数
        return reverseNum == x || reverseNum / 10 == x;
    }

    public static void main(String[] args) {
        Question9 question9 = new Question9();

        int x = 121;

        boolean res = question9.isPalindrome(x);
        System.out.println(res);
    }
}
