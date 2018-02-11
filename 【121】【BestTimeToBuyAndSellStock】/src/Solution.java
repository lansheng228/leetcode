/**
 * Author: 王俊超
 * Date: 2015-06-22
 * Time: 15:42
 * Declaration: All Rights Reserved !!!
 */
public class Solution {
    /**
     * <pre>
     * Say you have an array for which the ith element is the price of a given stock on day i.
     *
     * If you were only permitted to complete at most one transaction (ie, buy one and sell
     * one share of the stock), design an algorithm to find the maximum profit.
     *
     * 题目大意：
     * 给一个数组prices[]，prices[i]代表股票在第i天的售价，求出只做一次交易(一次买入和卖出)能得到的最大收益。
     *
     * 解题思路：
     * 只需要找出最大的差值即可，即 max(prices[j] 