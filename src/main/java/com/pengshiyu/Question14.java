package com.pengshiyu;

/**
 * 14. 最长公共前缀
 * https://leetcode-cn.com/problems/longest-common-prefix/
 * 思路：两两比较，取最长前缀
 */
public class Question14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            prefix = this.longestCommonPrefix(prefix, strs[i]);
            if ("".equals(prefix)) {
                break;
            }
        }

        return prefix;

    }

    public String longestCommonPrefix(String str1, String str2) {
        if (str1 == null || str1.length() == 0) {
            return "";
        }

        if (str2 == null || str2.length() == 0) {
            return "";
        }

        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }

        return str1.substring(0, minLength);
    }

    public static void main(String[] args) {
        Question14 question = new Question14();
        // String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"ab", "a"};

        String ret = question.longestCommonPrefix(strs);
        System.out.println(ret);
        System.out.println("123".substring(0, 3));
        // fl

    }
}
