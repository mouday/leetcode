package com.pengshiyu;

/**
 * 7. 整数反转
 * https://leetcode-cn.com/problems/reverse-integer/
 * 思路：取余和取模
 */
public class Question7 {
    public int reverse(int x) {
        int rev = 0;

        int max = Integer.MAX_VALUE / 10;
        int min = Integer.MIN_VALUE / 10;

        while (x != 0) {
            // 取末尾数字
            int digit = x % 10;

            // 上界 2147483647
            if (rev > max || (rev == max && digit > 7)) {
                return 0;
            }
            // 下界 -2147483648
            if (rev < min || (rev == min && digit < -8)) {
                return 0;
            }

            // 拼接到最后
            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Question7 question7 = new Question7();

        int x = -123;

        int res = question7.reverse(x);
        System.out.println(res);
    }
}
