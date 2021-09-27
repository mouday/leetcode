package com.pengshiyu;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数
 * https://leetcode-cn.com/problems/roman-to-integer/
 * 思路：模拟遍历
 */
public class Question13 {
    public int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int value = 0;
        int len = s.length();

        for (int i = 0; i < len; i++) {
            int currentValue = map.get(s.charAt(i));

            // 如果左边的值 < 右边的值，左边的值取负数
            if (i < len - 1 && currentValue < map.get(s.charAt(i + 1))) {
                value -= currentValue;
            } else {
                value += currentValue;
            }
        }

        return value;
    }

    public static void main(String[] args) {
        Question13 question13 = new Question13();
        String s = "LVIII";

        int ret = question13.romanToInt(s);
        System.out.println(ret);
        // 58

    }
}
