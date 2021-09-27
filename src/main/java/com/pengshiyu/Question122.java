package com.pengshiyu;

/**
 * 122. 买卖股票的最佳时机 II
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/
 * 思路：贪心
 */
public class Question122 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int temp = 0;

        for (int i = 1; i < prices.length; i++) {
            temp = prices[i] - prices[i - 1];
            if (temp > 0) {
                profit += temp;
            }
        }
        return profit;
    }


    public static void main(String[] args) {
        Question122 question3 = new Question122();

        int[] prices = {7, 1, 5, 3, 6, 4};

        int res = question3.maxProfit(prices);
        System.out.println(res); // 7
    }
}
