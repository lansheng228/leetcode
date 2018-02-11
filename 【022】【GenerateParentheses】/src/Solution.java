import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Author: 王俊超
 * Date: 2015-06-22
 * Time: 11:13
 * Declaration: All Rights Reserved !!!
 */
public class Solution {
    /**
     * <pre>
     * Given n pairs of parentheses, write a function to generate all combinations
     * of well-formed parentheses.
     *
     * For example, given n = 3, a solution set is:
     * "((()))", "(()())", "(())()", "()(())", "()()()"
     *
     * 题目大意：
     * 给定n对括号，输出他们所有正确的组合
     *
     * 解题思路：
     * 采用递归求解试
     * </pre>
     *
     * @param n
     * @return
     */
    public List<String> generateParenthesis(int n) {
        // 保存结果的队列
        List<String> result = new ArrayList<>();
        // 括号数大于0
        if (n > 0) {
            // 