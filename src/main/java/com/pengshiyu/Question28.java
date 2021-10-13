package com.pengshiyu;


/**
 * 28. 实现 strStr()
 * https://leetcode-cn.com/problems/implement-strstr/
 * 思路：暴力匹配
 */
public class Question28 {

    public int strStr(String haystack, String needle) {
        if ("".equals(needle)) {
            return 0;
        }

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        // 逐一匹配
        for (int i = 0; i + needleLength <= haystackLength; i++) {
            for (int j = 0; j < needleLength; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                // 全部都匹配完毕
                if (j == needleLength - 1) {
                    return i;
                }

            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Question28 question = new Question28();

        String haystack = "hello";
        String needle = "ll";


        int position = question.strStr(haystack, needle);

        System.out.println(position);

    }
}
