package com.pengshiyu;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 思路：栈
 */
public class Question20 {
    public boolean isValid(String s) {
        // 长度为奇数直接返回
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        Map<Character, Character> map = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 左括号入栈
            if (map.containsKey(ch)) {
                stack.push(ch);
            } else if (stack.isEmpty() || ch != map.get(stack.pop())) {
                return false;
            }
        }

        // 栈中没有数据返回true
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Question20 question = new Question20();
        String s = "()[]{}";

        boolean ret = question.isValid(s);
        System.out.println(ret);
    }
}
